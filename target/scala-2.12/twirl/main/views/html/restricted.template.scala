
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

object restricted extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[model.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: model.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Restricted</title>
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("compiled/styles.css")),format.raw/*6.85*/(""""> 
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("compiled/main.css")),format.raw/*7.83*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
    </head>
    <body>

        <div id="logo">
			<h2> CASINO BACKEND SYSTEM </h2>
		</div>

		<div id="menu">
			<h2>Navigation Menu</h2>
			<ul>
				<li class="active"><a href="index.html">Table Data</a></li>
				<li><a href="aboutus.html">Daily Report</a></li>
				<li><a href="products.html">Game Report</a></li>
				<li><a href="contact.html">Rake Report</a></li>
			</ul>
		</div>

		<script>
			function myFunction() """),format.raw/*27.26*/("""{"""),format.raw/*27.27*/("""		  
			  """),format.raw/*28.6*/("""var input, filter, table, tr, td, i;
			  input = document.getElementById("myInput");
			  filter = input.value.toUpperCase();
			  table = document.getElementById("myTable");
			  tr = table.getElementsByTagName("tr");

			  // Loop through all table rows, and hide those who don't match the search query
			  for (i = 0; i < tr.length; i++) """),format.raw/*35.38*/("""{"""),format.raw/*35.39*/("""
			    """),format.raw/*36.8*/("""td = tr[i].getElementsByTagName("td")[0];
			    if (td) """),format.raw/*37.16*/("""{"""),format.raw/*37.17*/("""
			      """),format.raw/*38.10*/("""if (td.innerHTML.toUpperCase().indexOf(filter) > -1) """),format.raw/*38.63*/("""{"""),format.raw/*38.64*/("""
			        """),format.raw/*39.12*/("""tr[i].style.display = "";
			      """),format.raw/*40.10*/("""}"""),format.raw/*40.11*/(""" """),format.raw/*40.12*/("""else """),format.raw/*40.17*/("""{"""),format.raw/*40.18*/("""
			        """),format.raw/*41.12*/("""tr[i].style.display = "none";
			      """),format.raw/*42.10*/("""}"""),format.raw/*42.11*/("""
			    """),format.raw/*43.8*/("""}"""),format.raw/*43.9*/("""
			  """),format.raw/*44.6*/("""}"""),format.raw/*44.7*/("""
			"""),format.raw/*45.4*/("""}"""),format.raw/*45.5*/("""
		"""),format.raw/*46.3*/("""</script>

		<!--
        <h1>Hello """),_display_(/*49.20*/user/*49.24*/.userCode),format.raw/*49.33*/("""</h1>
        <div>Your id is """),_display_(/*50.26*/user/*50.30*/.userId),format.raw/*50.37*/("""</div>
        -->
    </body>
</html>
"""))
      }
    }
  }

  def render(user:model.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((model.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 08 23:11:12 IST 2017
                  SOURCE: /home/wilson/1-MyProjects/denis/app/views/restricted.scala.html
                  HASH: cd1e2e3c115ae741607f9292efa06651201b71d4
                  MATRIX: 738->1|851->19|878->20|1020->136|1034->142|1094->182|1162->224|1176->230|1234->268|1321->329|1335->335|1395->374|1851->802|1880->803|1917->813|2288->1156|2317->1157|2352->1165|2437->1222|2466->1223|2504->1233|2585->1286|2614->1287|2654->1299|2717->1334|2746->1335|2775->1336|2808->1341|2837->1342|2877->1354|2944->1393|2973->1394|3008->1402|3036->1403|3069->1409|3097->1410|3128->1414|3156->1415|3186->1418|3250->1455|3263->1459|3293->1468|3351->1499|3364->1503|3392->1510
                  LINES: 21->1|26->1|27->2|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|52->27|52->27|53->28|60->35|60->35|61->36|62->37|62->37|63->38|63->38|63->38|64->39|65->40|65->40|65->40|65->40|65->40|66->41|67->42|67->42|68->43|68->43|69->44|69->44|70->45|70->45|71->46|74->49|74->49|74->49|75->50|75->50|75->50
                  -- GENERATED --
              */
          