
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wilson/workspace1/backend/conf/routes
// @DATE:Sun Oct 15 17:39:11 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:13
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:13
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """data""", """controllers.Application.data"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.doLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restricted""", """controllers.Application.restricted"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_data1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("data")))
  )
  private[this] lazy val controllers_Application_data1_invoker = createInvoker(
    Application_1.data,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "data",
      Nil,
      "GET",
      this.prefix + """data""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login2_invoker = createInvoker(
    Application_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_doLogin3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_doLogin3_invoker = createInvoker(
    Application_1.doLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "doLogin",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_restricted4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restricted")))
  )
  private[this] lazy val controllers_Application_restricted4_invoker = createInvoker(
    Application_1.restricted,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "restricted",
      Nil,
      "GET",
      this.prefix + """restricted""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:7
    case controllers_Application_data1_route(params) =>
      call { 
        controllers_Application_data1_invoker.call(Application_1.data)
      }
  
    // @LINE:8
    case controllers_Application_login2_route(params) =>
      call { 
        controllers_Application_login2_invoker.call(Application_1.login)
      }
  
    // @LINE:9
    case controllers_Application_doLogin3_route(params) =>
      call { 
        controllers_Application_doLogin3_invoker.call(Application_1.doLogin)
      }
  
    // @LINE:10
    case controllers_Application_restricted4_route(params) =>
      call { 
        controllers_Application_restricted4_invoker.call(Application_1.restricted)
      }
  
    // @LINE:13
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
