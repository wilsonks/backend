
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Option[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(maybeErrorMessage: Option[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*2.1*/("""<html lang="en">
    <head>
        <title>Login page</title>
        <link rel="stylesheet" href=""""),_display_(/*5.39*/routes/*5.45*/.Assets.versioned("compiled/styles.css")),format.raw/*5.85*/(""""> 
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("compiled/main.css")),format.raw/*6.83*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.59*/routes/*7.65*/.Assets.versioned("images/favicon.png")),format.raw/*7.104*/("""">

    </head>
    <body>


	    <div id="div-login">
	        <form method="post" action="/login">
	            <fieldset style="margin: 10px;">
	                <legend>Login</legend>
	                """),_display_(/*17.19*/maybeErrorMessage/*17.36*/.map/*17.40*/ { errorMessage =>_display_(Seq[Any](format.raw/*17.58*/("""
	                    """),format.raw/*18.22*/("""<span class="label bg--error">"""),_display_(/*18.53*/errorMessage),format.raw/*18.65*/(""". Please check the user credentials.</span>
	                """)))}),format.raw/*19.19*/("""
	                """),format.raw/*20.18*/("""<p>
	                    <label for="username">Username:</label>
	                    <input id="username" type="text" name="username"  />
	                </p>
	                <p>
	                    <label for="password">Password:</label>
	                    <input id="password" type="password" name="password"  />
	                </p>
	                <button type="submit" class="button--sm">Login</button>
	            </fieldset>
	        </form>
	    </div>
    </body>
</html>"""))
      }
    }
  }

  def render(maybeErrorMessage:Option[String]): play.twirl.api.HtmlFormat.Appendable = apply(maybeErrorMessage)

  def f:((Option[String]) => play.twirl.api.HtmlFormat.Appendable) = (maybeErrorMessage) => apply(maybeErrorMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 07 17:33:21 IST 2017
                  SOURCE: /home/wilson/1-MyProjects/denis/app/views/login.scala.html
                  HASH: c9ff65a326d253850722972d7fea82cc333d90eb
                  MATRIX: 737->1|867->36|894->37|1020->137|1034->143|1094->183|1162->225|1176->231|1234->269|1321->330|1335->336|1395->375|1627->580|1653->597|1666->601|1722->619|1772->641|1830->672|1863->684|1956->746|2002->764
                  LINES: 21->1|26->1|27->2|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|42->17|42->17|42->17|42->17|43->18|43->18|43->18|44->19|45->20
                  -- GENERATED --
              */
          