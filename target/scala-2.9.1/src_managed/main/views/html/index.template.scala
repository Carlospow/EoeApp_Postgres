
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id : String):play.api.templates.Html = {
        _display_ {
def /*3.2*/styles/*3.8*/:play.api.templates.Html = {_display_(

Seq(format.raw/*3.12*/("""
	<link href=""""),_display_(Seq(/*4.15*/routes/*4.21*/.Assets.at("stylesheets/jquery-ui-1.9.2.custom.css"))),format.raw/*4.73*/("""" rel="stylesheet" type="text/css"/>
""")))};def /*7.2*/scripts/*7.9*/:play.api.templates.Html = {_display_(

Seq(format.raw/*7.13*/("""
	 <script src=""""),_display_(Seq(/*8.17*/routes/*8.23*/.Assets.at("javascripts/jquery-ui-1.9.2.custom.js"))),format.raw/*8.74*/("""" type="text/javascript"></script>
	 <script>
	 	$(document).ready(function() """),format.raw("""{"""),format.raw/*10.34*/("""
	 		$("#faq").accordion("""),format.raw("""{"""),format.raw/*11.26*/("""
				active: false,
				collapsible: true,
				heightStyle: "content"
			"""),format.raw("""}"""),format.raw/*15.5*/(""");
		"""),format.raw("""}"""),format.raw/*16.4*/(""");
	 </script>
""")))};
Seq(format.raw/*1.15*/("""

"""),format.raw/*5.2*/("""

"""),format.raw/*18.2*/("""

"""),_display_(Seq(/*20.2*/main("Inicio")(styles)(scripts)/*20.33*/{_display_(Seq(format.raw/*20.34*/("""
	 
	 """),_display_(Seq(/*22.4*/(id))),format.raw/*22.8*/("""
	<h1> Módulo de Consultas Difusas para la Encuesta de Opinión Estudiantil </h1>
		<p> 
        	Bienvenido al módulo de consultas difusas para la Encuesta de Opinión Estudiantil.<br> 
            <br>
            Este módulo se encarga de proveer una interfaz más amigable para consultar los datos de la Encuesta Estudiantil.<br>
            <br>
            Los parámetros de las preguntas son palabras en lenguaje natural y las respuestas son un ordenamiento descendente de los resultados, es decir, la primera respuesta es la que mejor se ajusta a los parámetros provistos.<br>
   			<br>
   			En la sección de <a href="/config">Configuración</a> es posible adaptar los parámetros de cada pregunta según tu preferencia.<br>
		</p>
		<h1> Preguntas Frecuentes </h1>
		<div id="faq">
        	<h2> ¿Por qué en la configuración los valores aceptan decimales? </h2>
        		<div>
        		<p>
        			Por que la ponderación de las respuestas se hace sobre un promedio de todas las respuestas suministradas.
        		</p>
        		</div>
            <h2> ¿Donde puedo conseguir más información acerca del sistema? </h2>
            	<div>
            	<p>
        			Dirígete a la Coordinación de la Encuesta de Opinión Estudiantil en MYS piso 1.
        		</p>
        		</div>
            <h2> ¿De dónde sale la información reflejada en los resultados? </h2>
            	<div>
            	<p>
        			Los datos son extraídos de las respuestas suministradas por los estudiantes en la Encuesta que se hace trimestralemente
        			desde el 2001, por eso es importante que te tomes el tiempo de responderla en cada período.
        		</p>
        		</div>
            <h2> ¿Por qué no salen las otras preguntas de la encuesta? </h2>
            	<div>
            	<p>
        			Existen dos razones: actualmente solo 6 de las preguntas de la encuesta son obligatorias, lo cual implica que
        			poseemos datos estadísticamente significativos para ofrecer una consulta confiable; la segunda razón es que
        			hicimos un estudio de cuáles serían las preguntas de mayor interés para un estudiante y son las planteadas
        			en el sistema.
        		</p>
        		</div>
    	</div>
""")))})),format.raw/*64.2*/("""
"""))}
    }
    
    def render(id:String) = apply(id)
    
    def f:((String) => play.api.templates.Html) = (id) => apply(id)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 05 12:04:48 VET 2012
                    SOURCE: /home/carlos/Desktop/TDS/playapppostgres/app/views/index.scala.html
                    HASH: 05c57d07652d8a916616c63b5c856fb5ce40e386
                    MATRIX: 755->1|828->17|841->23|903->27|948->42|962->48|1035->100|1095->141|1109->148|1171->152|1218->169|1232->175|1304->226|1430->305|1503->331|1623->405|1675->411|1725->14|1753->138|1782->427|1815->430|1855->461|1889->462|1926->469|1951->473|4195->2686
                    LINES: 27->1|29->3|29->3|31->3|32->4|32->4|32->4|33->7|33->7|35->7|36->8|36->8|36->8|38->10|39->11|43->15|44->16|47->1|49->5|51->18|53->20|53->20|53->20|55->22|55->22|97->64
                    -- GENERATED --
                */
            