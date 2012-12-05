
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object respuestas extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(consulta: String):play.api.templates.Html = {
        _display_ {import helper._

def /*2.2*/styles/*2.8*/:play.api.templates.Html = {_display_(

Seq(format.raw/*2.12*/("""

<link href=""""),_display_(Seq(/*4.14*/routes/*4.20*/.Assets.at("stylesheets/demo_table.css"))),format.raw/*4.60*/("""" rel="stylesheet" type="text/css"/>

""")))};def /*8.2*/scripts/*8.9*/:play.api.templates.Html = {_display_(

Seq(format.raw/*8.13*/("""

<script src=""""),_display_(Seq(/*10.15*/routes/*10.21*/.Assets.at("javascripts/jquery.js"))),format.raw/*10.56*/("""" tyoe="text/javascripts"></script>
<script src=""""),_display_(Seq(/*11.15*/routes/*11.21*/.Assets.at("javascripts/jquery.dataTables.js"))),format.raw/*11.67*/("""" tyoe="text/javascripts"></script>

<script>
  
  $(document).ready( function() """),format.raw("""{"""),format.raw/*15.34*/("""
  $('table').dataTable( """),format.raw("""{"""),format.raw/*16.26*/("""
  "oLanguage": """),format.raw("""{"""),format.raw/*17.17*/("""
  "sSearch": "Buscar:",
  "sEmptyTable": "No hay datos que correspondan con su busqueda",
  "sInfo": "Mostrando elementos del _START_ al  _END_ de _TOTAL_ elementos",
  "sInfoEmpty": "No hay resultados que mostrar",
  "sLengthMenu": "Mostrar _MENU_ resultados por página",
  "sInfoFiltered": " - filtrados de _MAX_ resultados",
  "oPaginate": """),format.raw("""{"""),format.raw/*24.17*/("""
  "sPrevious": "Página previa",
  "sNext": "Página proxima",
  "sFirst" : "Primera",
  "sLast": "Última"
  """),format.raw("""}"""),format.raw/*29.4*/("""
  """),format.raw("""}"""),format.raw/*30.4*/("""
  """),format.raw("""}"""),format.raw/*31.4*/(""" );
  """),format.raw("""}"""),format.raw/*32.4*/(""" );
  



</script>

""")))};
Seq(format.raw/*1.20*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*39.2*/("""

"""),format.raw/*42.1*/("""
"""),_display_(Seq(/*43.2*/main("Preguntas")(styles)(scripts)/*43.36*/{_display_(Seq(format.raw/*43.37*/("""

"""),_display_(Seq(/*45.2*/Html(consulta))),format.raw/*45.16*/(""" 


""")))})),format.raw/*48.2*/("""
"""))}
    }
    
    def render(consulta:String) = apply(consulta)
    
    def f:((String) => play.api.templates.Html) = (consulta) => apply(consulta)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 05 12:04:48 VET 2012
                    SOURCE: /home/carlos/Desktop/TDS/playapppostgres/app/views/respuestas.scala.html
                    HASH: e7b3c01a6663849eecdd504354e2003c4805232c
                    MATRIX: 760->1|854->21|867->27|929->31|974->46|988->52|1049->92|1110->134|1124->141|1186->145|1233->161|1248->167|1305->202|1386->252|1401->258|1469->304|1598->386|1671->412|1735->429|2127->774|2282->883|2332->887|2382->891|2435->898|2491->19|2518->131|2547->920|2576->939|2608->941|2651->975|2685->976|2718->979|2754->993|2790->998
                    LINES: 27->1|30->2|30->2|32->2|34->4|34->4|34->4|36->8|36->8|38->8|40->10|40->10|40->10|41->11|41->11|41->11|45->15|46->16|47->17|54->24|59->29|60->30|61->31|62->32|70->1|71->6|73->39|75->42|76->43|76->43|76->43|78->45|78->45|81->48
                    -- GENERATED --
                */
            