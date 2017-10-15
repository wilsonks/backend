
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*31.5*/table/*31.10*/(mystyle: String,caption: String, hlist: List[Any],slist: List[Any],dlists: List[List[Any]] ):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*31.107*/("""
				"""),format.raw/*32.5*/("""<div class="scrollingTable">
					<table id="""),_display_(/*33.17*/mystyle),format.raw/*33.24*/(""">
					<div>
						"""),_display_(/*35.8*/slist/*35.13*/.zipWithIndex.map/*35.30*/{ case (e, i) =>_display_(Seq[Any](format.raw/*35.46*/(""" """),_display_(/*35.48*/if(!e.toString.isEmpty)/*35.71*/ {_display_(Seq[Any](format.raw/*35.73*/("""
							"""),format.raw/*36.8*/("""<input type="text" id="""),_display_(/*36.31*/mystyle),_display_(/*36.39*/e),format.raw/*36.40*/(""" """),format.raw/*36.41*/("""onkeyup="myFunction('"""),_display_(/*36.63*/mystyle),_display_(/*36.71*/e),format.raw/*36.72*/("""','"""),_display_(/*36.76*/mystyle),format.raw/*36.83*/("""',"""),_display_(/*36.86*/i),format.raw/*36.87*/(""")" placeholder="""),_display_(/*36.103*/e),format.raw/*36.104*/("""... title="Search For a """),_display_(/*36.129*/e),format.raw/*36.130*/("""">
							""")))}),format.raw/*37.9*/("""
						""")))}),format.raw/*38.8*/("""

					"""),format.raw/*40.6*/("""</div>
					<caption>"""),_display_(/*41.16*/caption),format.raw/*41.23*/("""</caption>
						<tr>
							"""),_display_(/*43.9*/hlist/*43.14*/.map/*43.18*/ { e =>_display_(Seq[Any](format.raw/*43.25*/("""
								"""),format.raw/*44.9*/("""<th>"""),_display_(/*44.14*/e),format.raw/*44.15*/("""</th>
							""")))}),format.raw/*45.9*/("""

						"""),format.raw/*47.7*/("""</tr>

						"""),_display_(/*49.8*/dlists/*49.14*/.map/*49.18*/ { dlist =>_display_(Seq[Any](format.raw/*49.29*/("""
							"""),format.raw/*50.8*/("""<tr>
								"""),_display_(/*51.10*/dlist/*51.15*/.map/*51.19*/ { e =>_display_(Seq[Any](format.raw/*51.26*/("""
									"""),format.raw/*52.10*/("""<td>"""),_display_(/*52.15*/e),format.raw/*52.16*/("""</td>
								""")))}),format.raw/*53.10*/("""
							"""),format.raw/*54.8*/("""</tr>		

						""")))}),format.raw/*56.8*/("""

					"""),format.raw/*58.6*/("""</table>
				</div>
				<div class="downloadButtons">
				    <button class= "button--pill" onClick ="$('#"""),_display_(/*61.54*/mystyle),format.raw/*61.61*/("""').tableExport("""),format.raw/*61.76*/("""{"""),format.raw/*61.77*/("""type:'excel',tableName:'"""),_display_(/*61.102*/caption),format.raw/*61.109*/("""',escape:'false'"""),format.raw/*61.125*/("""}"""),format.raw/*61.126*/(""");">
				         Save As Excel
				    </button>
				    <button class= "button--pill" onClick ="$('#"""),_display_(/*64.54*/mystyle),format.raw/*64.61*/("""').tableExport("""),format.raw/*64.76*/("""{"""),format.raw/*64.77*/("""type:'pdf',pdfLeftMargin:2,pdfFontSize:'7',tableName:'TableData',escape:'false'"""),format.raw/*64.156*/("""}"""),format.raw/*64.157*/(""");">
				         Save As PDF
				    </button>
				    <button class= "button--pill" onClick ="$('#"""),_display_(/*67.54*/mystyle),format.raw/*67.61*/("""').tableExport("""),format.raw/*67.76*/("""{"""),format.raw/*67.77*/("""type:'png',tableName:'"""),_display_(/*67.100*/caption),format.raw/*67.107*/("""',escape:'false'"""),format.raw/*67.123*/("""}"""),format.raw/*67.124*/(""");">
				         Save As PNG
				    </button>
				        <button class= "button--pill" onClick ="$('#"""),_display_(/*70.58*/mystyle),format.raw/*70.65*/("""').tableExport("""),format.raw/*70.80*/("""{"""),format.raw/*70.81*/("""type:'csv',tableName:'"""),_display_(/*70.104*/caption),format.raw/*70.111*/("""',escape:'false'"""),format.raw/*70.127*/("""}"""),format.raw/*70.128*/(""");">
				         Save As CSV
				    </button>
			    </div>
			""")))};
Seq[Any](format.raw/*1.4*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
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
	
		<div id="body">

		
			"""),format.raw/*74.5*/("""

		"""),_display_(/*76.4*/{	
			
			val mystyle : String = "table-normal-darkblue"
			val caption : String = "Electronic Table Atomic Data"
			val hlist : List[String] = List("Date","Start","End","Table","Game","Dealer","Win","Rake","Commision") 
			val slist : List[String] = List("Date","","","Table","Game","Dealer","Win","Rake","") 
			val dlists : List[List[String]] = List(List("2017/10/08","01:14","01:18","0001","TeenPatti","007","1000","5","50"),
												 List("2017/10/08","01:20","01:25","0001","TeenPatti","007","2000","5","100"),
												 List("2017/10/08","01:30","01:35","0001","TeenPatti","007","3000","5","150"),
												 List("2017/10/08","01:45","02:00","0001","TeenPatti","007","4000","5","200"),
												 List("2017/10/08","01:14","01:18","0001","TeenPatti","007","1000","5","50"),
												 List("2017/10/08","01:20","01:25","0001","TeenPatti","007","2000","5","100"),
												 List("2017/10/08","01:30","01:35","0001","TeenPatti","007","3000","5","150"),
												 List("2017/10/08","01:45","02:00","0001","TeenPatti","007","4000","5","200"),
												 List("2017/10/08","01:14","01:18","0001","TeenPatti","007","1000","5","50"),
												 List("2017/10/08","01:20","01:25","0001","TeenPatti","007","2000","5","100"),
												 List("2017/10/08","01:30","01:35","0001","TeenPatti","007","3000","5","150"),
												 List("2017/10/08","01:45","02:00","0001","TeenPatti","007","4000","5","200"),
												 List("2017/10/08","01:14","01:18","0001","TeenPatti","007","1000","5","50"),
												 List("2017/10/08","01:20","01:25","0001","TeenPatti","007","2000","5","100"),
												 List("2017/10/08","01:30","01:35","0001","TeenPatti","007","3000","5","150"),
												 List("2017/10/08","01:45","02:00","0001","TeenPatti","007","4000","5","200"),
												 List("2017/10/08","01:14","01:18","0001","TeenPatti","007","1000","5","50"),
												 List("2017/10/08","01:20","01:25","0001","TeenPatti","007","2000","5","100"),
												 List("2017/10/08","01:30","01:35","0001","TeenPatti","007","3000","5","150"),
												 List("2017/10/08","01:45","02:00","0001","TeenPatti","007","4000","5","200"),
												 List("2017/10/08","01:14","01:18","0001","TeenPatti","007","1000","5","50"),
												 List("2017/10/08","01:20","01:25","0001","TeenPatti","007","2000","5","100"),
												 List("2017/10/08","01:30","01:35","0001","TeenPatti","007","3000","5","150"),
												 List("2017/10/08","01:45","02:00","0001","TeenPatti","007","4000","5","200")
												) 

			
			table(mystyle,caption,hlist,slist,dlists)

		}),format.raw/*111.4*/("""



		"""),format.raw/*115.3*/("""</div>


		<script>
			function myFunction(myInput,myTable,myIndex) """),format.raw/*119.49*/("""{"""),format.raw/*119.50*/("""		  
			  """),format.raw/*120.6*/("""var input, filter, table, tr, td, i;
			  input = document.getElementById(myInput);
			  filter = input.value.toUpperCase();
			  table = document.getElementById(myTable);
			  tr = table.getElementsByTagName("tr");

			  // Loop through all table rows, and hide those who don't match the search query
			  for (i = 0; i < tr.length; i++) """),format.raw/*127.38*/("""{"""),format.raw/*127.39*/("""
			    """),format.raw/*128.8*/("""td = tr[i].getElementsByTagName("td")[myIndex];
			    if (td) """),format.raw/*129.16*/("""{"""),format.raw/*129.17*/("""
			      """),format.raw/*130.10*/("""if (td.innerHTML.toUpperCase().indexOf(filter) > -1) """),format.raw/*130.63*/("""{"""),format.raw/*130.64*/("""
			        """),format.raw/*131.12*/("""tr[i].style.display = "";
			      """),format.raw/*132.10*/("""}"""),format.raw/*132.11*/(""" """),format.raw/*132.12*/("""else """),format.raw/*132.17*/("""{"""),format.raw/*132.18*/("""
			        """),format.raw/*133.12*/("""tr[i].style.display = "none";
			      """),format.raw/*134.10*/("""}"""),format.raw/*134.11*/("""
			    """),format.raw/*135.8*/("""}"""),format.raw/*135.9*/("""
			  """),format.raw/*136.6*/("""}"""),format.raw/*136.7*/("""
			"""),format.raw/*137.4*/("""}"""),format.raw/*137.5*/("""

			"""),format.raw/*139.4*/("""function makeTableScroll() """),format.raw/*139.31*/("""{"""),format.raw/*139.32*/("""
	            """),format.raw/*140.14*/("""// Constant retrieved from server-side via JSP
	            var maxRows = 20;

	            var table = document.getElementById('table-normal-darkblue');
	            var wrapper = table.parentNode;
	            var rowsInTable = table.rows.length;
	            var height = 0;
	            if (rowsInTable > maxRows) """),format.raw/*147.41*/("""{"""),format.raw/*147.42*/("""
	                """),format.raw/*148.18*/("""for (var i = 0; i < maxRows; i++) """),format.raw/*148.52*/("""{"""),format.raw/*148.53*/("""
	                    """),format.raw/*149.22*/("""height += table.rows[i].clientHeight;
	                """),format.raw/*150.18*/("""}"""),format.raw/*150.19*/("""
	                """),format.raw/*151.18*/("""wrapper.style.height = height + "px";
	            """),format.raw/*152.14*/("""}"""),format.raw/*152.15*/("""
	        """),format.raw/*153.10*/("""}"""),format.raw/*153.11*/("""

		"""),format.raw/*155.3*/("""</script>

    </body>
    <script src=""""),_display_(/*158.19*/routes/*158.25*/.Assets.versioned("compiled/bundle.js")),format.raw/*158.64*/("""" ></script>
    <script src=""""),_display_(/*159.19*/routes/*159.25*/.Assets.versioned("compiled/jquery.min.js")),format.raw/*159.68*/(""""></script>

    <script type="text/javascript" src=""""),_display_(/*161.42*/routes/*161.48*/.Assets.versioned("compiled/tableExport.js")),format.raw/*161.92*/(""""></script>
	<script type="text/javascript" src=""""),_display_(/*162.39*/routes/*162.45*/.Assets.versioned("compiled/jquery.base64.js")),format.raw/*162.91*/(""""></script>
	<script type="text/javascript" src=""""),_display_(/*163.39*/routes/*163.45*/.Assets.versioned("compiled/html2canvas.js")),format.raw/*163.89*/(""""></script>
	<script type="text/javascript" src=""""),_display_(/*164.39*/routes/*164.45*/.Assets.versioned("compiled/jspdf/libs/sprintf.js")),format.raw/*164.96*/(""""></script>
	<script type="text/javascript" src=""""),_display_(/*165.39*/routes/*165.45*/.Assets.versioned("compiled/jspdf/jspdf.js")),format.raw/*165.89*/(""""></script>
	<script type="text/javascript" src=""""),_display_(/*166.39*/routes/*166.45*/.Assets.versioned("compiled/jspdf/libs/base64.js")),format.raw/*166.95*/(""""></script>

</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 10:38:22 IST 2017
                  SOURCE: /home/wilson/1-MyProjects/denis/app/views/index.scala.html
                  HASH: 9dc5e5df4b52042a5d6bc9af4442ab9fe41fdb79
                  MATRIX: 722->1|803->803|817->808|992->905|1024->910|1096->955|1124->962|1170->982|1184->987|1210->1004|1264->1020|1293->1022|1325->1045|1365->1047|1400->1055|1450->1078|1478->1086|1500->1087|1529->1088|1578->1110|1606->1118|1628->1119|1659->1123|1687->1130|1717->1133|1739->1134|1783->1150|1806->1151|1859->1176|1882->1177|1923->1188|1961->1196|1995->1203|2044->1225|2072->1232|2128->1262|2142->1267|2155->1271|2200->1278|2236->1287|2268->1292|2290->1293|2334->1307|2369->1315|2409->1329|2424->1335|2437->1339|2486->1350|2521->1358|2562->1372|2576->1377|2589->1381|2634->1388|2672->1398|2704->1403|2726->1404|2772->1419|2807->1427|2853->1443|2887->1450|3021->1557|3049->1564|3092->1579|3121->1580|3174->1605|3203->1612|3248->1628|3278->1629|3408->1732|3436->1739|3479->1754|3508->1755|3616->1834|3646->1835|3774->1936|3802->1943|3845->1958|3874->1959|3925->1982|3954->1989|3999->2005|4029->2006|4161->2111|4189->2118|4232->2133|4261->2134|4312->2157|4341->2164|4386->2180|4416->2181|4520->3|4549->6|4685->116|4699->122|4759->162|4827->204|4841->210|4899->248|4987->309|5002->315|5063->354|5538->2247|5569->2252|8176->4838|8210->4844|8307->4912|8337->4913|8375->4923|8743->5262|8773->5263|8809->5271|8901->5334|8931->5335|8970->5345|9052->5398|9082->5399|9123->5411|9187->5446|9217->5447|9247->5448|9281->5453|9311->5454|9352->5466|9420->5505|9450->5506|9486->5514|9515->5515|9549->5521|9578->5522|9610->5526|9639->5527|9672->5532|9728->5559|9758->5560|9801->5574|10148->5892|10178->5893|10225->5911|10288->5945|10318->5946|10369->5968|10453->6023|10483->6024|10530->6042|10610->6093|10640->6094|10679->6104|10709->6105|10741->6109|10810->6150|10826->6156|10887->6195|10946->6226|10962->6232|11027->6275|11109->6329|11125->6335|11191->6379|11269->6429|11285->6435|11353->6481|11431->6531|11447->6537|11513->6581|11591->6631|11607->6637|11680->6688|11758->6738|11774->6744|11840->6788|11918->6838|11934->6844|12006->6894
                  LINES: 21->1|25->31|25->31|27->31|28->32|29->33|29->33|31->35|31->35|31->35|31->35|31->35|31->35|31->35|32->36|32->36|32->36|32->36|32->36|32->36|32->36|32->36|32->36|32->36|32->36|32->36|32->36|32->36|32->36|32->36|33->37|34->38|36->40|37->41|37->41|39->43|39->43|39->43|39->43|40->44|40->44|40->44|41->45|43->47|45->49|45->49|45->49|45->49|46->50|47->51|47->51|47->51|47->51|48->52|48->52|48->52|49->53|50->54|52->56|54->58|57->61|57->61|57->61|57->61|57->61|57->61|57->61|57->61|60->64|60->64|60->64|60->64|60->64|60->64|63->67|63->67|63->67|63->67|63->67|63->67|63->67|63->67|66->70|66->70|66->70|66->70|66->70|66->70|66->70|66->70|71->1|74->4|78->8|78->8|78->8|79->9|79->9|79->9|80->10|80->10|80->10|101->74|103->76|138->111|142->115|146->119|146->119|147->120|154->127|154->127|155->128|156->129|156->129|157->130|157->130|157->130|158->131|159->132|159->132|159->132|159->132|159->132|160->133|161->134|161->134|162->135|162->135|163->136|163->136|164->137|164->137|166->139|166->139|166->139|167->140|174->147|174->147|175->148|175->148|175->148|176->149|177->150|177->150|178->151|179->152|179->152|180->153|180->153|182->155|185->158|185->158|185->158|186->159|186->159|186->159|188->161|188->161|188->161|189->162|189->162|189->162|190->163|190->163|190->163|191->164|191->164|191->164|192->165|192->165|192->165|193->166|193->166|193->166
                  -- GENERATED --
              */
          