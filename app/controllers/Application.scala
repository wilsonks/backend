package controllers

import java.util.concurrent.TimeUnit

import actors.StatsActor
import akka.actor.ActorSystem
import akka.util.Timeout
import model.CombinedData
import play.api.libs.json.Json
import play.api.mvc._
import akka.pattern.ask
import services._

import scala.concurrent.ExecutionContext.Implicits.global
import play.api.data.Form
import play.api.data.Forms._

case class UserLoginData(username: String, password: String)

//################################################################################################
//Every controller must extend the play.api.mvc.BaseController trait, but it’s usually easier to
//extend an abstract class called AbstractController.
//The Action object is a DSL-like construct that helps define controller methods. Controller methods 
//exposed as HTTP endpoints often return values of type play.api.mvc.Result , and this is exactly 
//what the index method does. It simply takes a compiled Scala HTML template called index and returns 
//it to the browser also specifying 200 OK as a response code.
//################################################################################################
class Application(components: ControllerComponents, sunService: SunService,
    weatherService: WeatherService,
    actorSystem: ActorSystem,
    authService: AuthService,
    userAuthAction: UserAuthAction) extends AbstractController(components) {

  def index = Action {
    Ok(views.html.index())
  }

  def restricted = userAuthAction { userAuthRequest =>
    Ok(views.html.restricted(userAuthRequest.user))
  }

  def data = Action.async {
    val lat = -33.8830
    val lon = 151.2167
    val sunInfoF = sunService.getSunInfo(lat, lon)
    val temperatureF = weatherService.getTemperature(lat, lon)

    implicit val timeout = Timeout(5, TimeUnit.SECONDS)
    val requestsF = (actorSystem.actorSelection(StatsActor.path) ?
      StatsActor.GetStats).mapTo[Int]

    for {
      sunInfo <- sunInfoF
      temperature <- temperatureF
      requests <- requestsF
    } yield {
      Ok(Json.toJson(CombinedData(sunInfo, temperature, requests)))
    }
  }

  def login = Action {
    Ok(views.html.login(None))
  }

  def doLogin = Action { implicit request =>
    userDataForm.bindFromRequest.fold(
      formWithErrors => Ok(views.html.login(Some("Wrong data"))),
      userData => {
        val maybeCookie = authService.login(userData.username, userData.password)
        maybeCookie match {
          case Some(cookie) =>
            Redirect("/").withCookies(cookie)
          case None =>
            Ok(views.html.login(Some("Login failed")))
        }
      }
    )
  }

  val userDataForm = Form {
    mapping(
      "username" -> nonEmptyText,
      "password" -> nonEmptyText
    )(UserLoginData.apply)(UserLoginData.unapply)
  }
}
