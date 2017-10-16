
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.versioned("compiled/styles.css")),format.raw/*8.85*/(""""> 
        <link rel="stylesheet" href=""""),_display_(/*9.39*/routes/*9.45*/.Assets.versioned("compiled/main.css")),format.raw/*9.83*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
    </head>
    <body onload="makeTableScroll();">

        <div id="logo">
			<h2> CASINO BACKEND SYSTEM </h2>
		</div>

		<div id="menu">
			<h2>Navigation Menu</h2>
			<ul>
				<li class="active"><a href="index.html">Table Data</a></li>
				<li><a href="aboutus.html">Daily Report</a></li>
				<li><a href="products.html">Game Reports</a></li>
				<li><a href="contact.html">Cash Reports</a></li>
			</ul>
		</div>

    """),_display_(/*28.6*/content),format.raw/*28.13*/("""

    """),format.raw/*30.5*/("""</body>
    <script>

    	function myFunction(myInput,myTable,myIndex) """),format.raw/*33.51*/("""{"""),format.raw/*33.52*/("""		  
		  """),format.raw/*34.5*/("""var input, filter, table, tr, td, i;
		  input = document.getElementById(myInput);
		  filter = input.value.toUpperCase();
		  table = document.getElementById(myTable);
		  tr = table.getElementsByTagName("tr");

		  // Loop through all table rows, and hide those who don't match the search query
		  for (i = 0; i < tr.length; i++) """),format.raw/*41.37*/("""{"""),format.raw/*41.38*/("""
		    """),format.raw/*42.7*/("""td = tr[i].getElementsByTagName("td")[myIndex];
		    if (td) """),format.raw/*43.15*/("""{"""),format.raw/*43.16*/("""
		      """),format.raw/*44.9*/("""if (td.innerHTML.toUpperCase().indexOf(filter) > -1) """),format.raw/*44.62*/("""{"""),format.raw/*44.63*/("""
		        """),format.raw/*45.11*/("""tr[i].style.display = "";
		      """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/(""" """),format.raw/*46.11*/("""else """),format.raw/*46.16*/("""{"""),format.raw/*46.17*/("""
		        """),format.raw/*47.11*/("""tr[i].style.display = "none";
		      """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/("""
		    """),format.raw/*49.7*/("""}"""),format.raw/*49.8*/("""
		  """),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""
		"""),format.raw/*51.3*/("""}"""),format.raw/*51.4*/("""

		"""),format.raw/*53.3*/("""function makeTableScroll() """),format.raw/*53.30*/("""{"""),format.raw/*53.31*/("""
            """),format.raw/*54.13*/("""// Constant retrieved from server-side via JSP
            var maxRows = 20;

            var table = document.getElementById('table-normal-darkblue');
            var wrapper = table.parentNode;
            var rowsInTable = table.rows.length;
            var height = 0;
            if (rowsInTable > maxRows) """),format.raw/*61.40*/("""{"""),format.raw/*61.41*/("""
                """),format.raw/*62.17*/("""for (var i = 0; i < maxRows; i++) """),format.raw/*62.51*/("""{"""),format.raw/*62.52*/("""
                    """),format.raw/*63.21*/("""height += table.rows[i].clientHeight;
                """),format.raw/*64.17*/("""}"""),format.raw/*64.18*/("""
                """),format.raw/*65.17*/("""wrapper.style.height = height + "px";
            """),format.raw/*66.13*/("""}"""),format.raw/*66.14*/("""
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/("""

	"""),format.raw/*69.2*/("""</script>

    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.versioned("compiled/bundle.js")),format.raw/*71.64*/("""" ></script>
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("compiled/jquery.min.js")),format.raw/*72.68*/(""""></script>

    <script type="text/javascript" src=""""),_display_(/*74.42*/routes/*74.48*/.Assets.versioned("compiled/tableExport.js")),format.raw/*74.92*/(""""></script>
	<script type="text/javascript" src=""""),_display_(/*75.39*/routes/*75.45*/.Assets.versioned("compiled/jquery.base64.js")),format.raw/*75.91*/(""""></script>
	<script type="text/javascript" src=""""),_display_(/*76.39*/routes/*76.45*/.Assets.versioned("compiled/html2canvas.js")),format.raw/*76.89*/(""""></script>
	<script type="text/javascript" src=""""),_display_(/*77.39*/routes/*77.45*/.Assets.versioned("compiled/jspdf/libs/sprintf.js")),format.raw/*77.96*/(""""></script>
	<script type="text/javascript" src=""""),_display_(/*78.39*/routes/*78.45*/.Assets.versioned("compiled/jspdf/jspdf.js")),format.raw/*78.89*/(""""></script>
	<script type="text/javascript" src=""""),_display_(/*79.39*/routes/*79.45*/.Assets.versioned("compiled/jspdf/libs/base64.js")),format.raw/*79.95*/(""""></script>

</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 15 17:39:12 IST 2017
                  SOURCE: /home/wilson/workspace1/backend/app/views/main.scala.html
                  HASH: 14e94feeb8e016e1b88dd36e5e5e4d9b303fb10e
                  MATRIX: 733->1|858->31|887->34|973->94|998->99|1071->146|1085->152|1145->192|1213->234|1227->240|1285->278|1373->339|1388->345|1449->384|1902->811|1930->818|1963->824|2063->896|2092->897|2128->906|2489->1239|2518->1240|2552->1247|2642->1309|2671->1310|2707->1319|2788->1372|2817->1373|2856->1384|2917->1418|2946->1419|2975->1420|3008->1425|3037->1426|3076->1437|3141->1475|3170->1476|3204->1483|3232->1484|3264->1489|3292->1490|3322->1493|3350->1494|3381->1498|3436->1525|3465->1526|3506->1539|3846->1851|3875->1852|3920->1869|3982->1903|4011->1904|4060->1925|4142->1979|4171->1980|4216->1997|4294->2047|4323->2048|4359->2057|4388->2058|4418->2061|4474->2090|4489->2096|4549->2135|4607->2166|4622->2172|4686->2215|4767->2269|4782->2275|4847->2319|4924->2369|4939->2375|5006->2421|5083->2471|5098->2477|5163->2521|5240->2571|5255->2577|5327->2628|5404->2678|5419->2684|5484->2728|5561->2778|5576->2784|5647->2834
                  LINES: 21->1|26->1|29->4|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|53->28|53->28|55->30|58->33|58->33|59->34|66->41|66->41|67->42|68->43|68->43|69->44|69->44|69->44|70->45|71->46|71->46|71->46|71->46|71->46|72->47|73->48|73->48|74->49|74->49|75->50|75->50|76->51|76->51|78->53|78->53|78->53|79->54|86->61|86->61|87->62|87->62|87->62|88->63|89->64|89->64|90->65|91->66|91->66|92->67|92->67|94->69|96->71|96->71|96->71|97->72|97->72|97->72|99->74|99->74|99->74|100->75|100->75|100->75|101->76|101->76|101->76|102->77|102->77|102->77|103->78|103->78|103->78|104->79|104->79|104->79
                  -- GENERATED --
              */
          