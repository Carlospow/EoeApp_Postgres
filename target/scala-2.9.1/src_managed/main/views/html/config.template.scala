
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
object config extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helper._

def /*1.2*/styles/*1.8*/:play.api.templates.Html = {_display_(

Seq(format.raw/*1.12*/("""
<link href=""""),_display_(Seq(/*2.14*/routes/*2.20*/.Assets.at("stylesheets/jquery-ui-1.9.2.custom.css"))),format.raw/*2.72*/("""" rel="stylesheet" type="text/css"/>
""")))};def /*5.2*/scripts/*5.9*/:play.api.templates.Html = {_display_(

Seq(format.raw/*5.13*/("""
 <script src=""""),_display_(Seq(/*6.16*/routes/*6.22*/.Assets.at("javascripts/jquery-ui-1.9.2.custom.js"))),format.raw/*6.73*/("""" type="text/javascript"></script> 
 <script src=""""),_display_(Seq(/*7.16*/routes/*7.22*/.Assets.at("javascripts/multibar.js"))),format.raw/*7.59*/("""" type="text/javascript"></script>
""")))};
Seq(format.raw/*3.2*/("""

"""),format.raw/*8.2*/("""

"""),format.raw/*11.1*/("""
"""),_display_(Seq(/*12.2*/main("Configuracion")(styles)(scripts)/*12.40*/{_display_(Seq(format.raw/*12.41*/("""

	<h1> Configuración </h1>
		
		<h2>Configura tus preferencias para las consultas</h2>
	
		<div id="accordion">
			<h3> Alto </h3>
			<div>
				"""),_display_(Seq(/*21.6*/form(routes.Application.confighandle())/*21.45*/ {_display_(Seq(format.raw/*21.47*/("""
		         <table id="vals">
		         <tr>
		         	<p> A continuación pondera del 1 al 5 donde consideras que... </p>
			         <td>
			         	<label>Empieza a ser alto:</label>
			         	<input type="number" name="p1" class="slide_val0 noEnterSubmit" data-index="0" size="1" step="0.01" max="5" min="1" />
			         </td>
			         <td>
			         	<label>Es alto:</label>
			         	<input type="number" name="p2" class="slide_val0 noEnterSubmit" data-index="1" size="1" step="0.01" max="5" min="1" />
			         </td>
			         <td>
			         	<label>Empieza a dejar de ser alto:</label>
			         	<input type="number" name="p3" class="slide_val0 noEnterSubmit" data-index="2" size="1" step="0.01" max="5" min="1" />
			         </td>
			         <td>
			         	<label>No es alto:</label>
			         	<input type="number" name="p4" class="slide_val0 noEnterSubmit" data-index="3" size="1" step="0.01" max="5" min="1" />
			         </td>
		         </tr>
		         </table>
		        
		        <div id="weightage_slider_0"></div>
		        <div id="ruler"> </div>
		        <input type="hidden" name="pred" value="alto"></input>
		        <input type="submit" value="Actualizar" class="b_submit"></input>
		        """)))})),format.raw/*48.12*/("""
			</div>
			
			</br>
		    <hr>
		    
		    <h3> Medio </h3>
			<div>
				"""),_display_(Seq(/*56.6*/form(routes.Application.confighandle())/*56.45*/ {_display_(Seq(format.raw/*56.47*/("""
				<table id="vals">
		         <tr>
		         	<p> A continuación pondera del 1 al 5 donde consideras que... </p>
			         <td>
			         	<label>Empieza a ser medio:</label>
			         	<input type="number" name="p1" class="slide_val1 noEnterSubmit" data-index="0" size="1" step="0.01" max="5" min="1" />
			         </td>
			         <td>
			         	<label>Es medio:</label>
			         	<input type="number" name="p2" class="slide_val1 noEnterSubmit" data-index="1" size="1" step="0.01" max="5" min="1" />
			         </td>
			         <td>
			         	<label>Empieza a dejar de ser medio:</label>
			         	<input type="number" name="p3" class="slide_val1 noEnterSubmit" data-index="2" size="1" step="0.01" max="5" min="1" />
			         </td>
			         <td>
			         	<label>Deja de ser medio:</label>
			         	<input type="number" name="p4" class="slide_val1 noEnterSubmit" data-index="3" size="1" step="0.01" max="5" min="1" />
			         </td>
		         </tr>
		         </table>
		        
		        <div id="weightage_slider_1"></div>
		        <div id="ruler"> </div>
		        <input type="submit" value="Actualizar" class="b_submit"></input>
		        <input type="hidden" name="pred" value="medio"></input>
				""")))})),format.raw/*83.6*/("""
			</div>
		    </br>
		    <hr>
		    
		    <h3> Bajo </h3>
		    <div>
			    """),_display_(Seq(/*90.9*/form(routes.Application.confighandle())/*90.48*/ {_display_(Seq(format.raw/*90.50*/("""
			    <table id="vals">
		         <tr>
		         	<p> A continuación pondera del 1 al 5 donde consideras que... </p>
			         <td>
			         	<label>Empieza a ser bajo:</label>
			         	<input type="number" name="p1" class="slide_val2 noEnterSubmit" data-index="0" size="1" step="0.01" max="5" min="1" />
			         </td>
			         <td>
			         	<label>Es bajo:</label>
			         	<input type="number" name="p2" class="slide_val2 noEnterSubmit" data-index="1" size="1" step="0.01" max="5" min="1" />
			         </td>
			         <td>
			         	<label>Empieza a dejar de ser bajo:</label>
			         	<input type="number" name="p3" class="slide_val2 noEnterSubmit" data-index="2" size="1" step="0.01" max="5" min="1" />
			         </td>
			         <td>
			         	<label>Deja de ser bajo:</label>
			         	<input type="number" name="p4" class="slide_val2 noEnterSubmit" data-index="3" size="1" step="0.01" max="5" min="1" />
			         </td>
		         </tr>
		         </table>
		        
		        <div id="weightage_slider_2"></div>
		        <div id="ruler"> </div>
			 	<input type="submit" value="Actualizar" class="b_submit"></input>
			 	<input type="hidden" name="pred" value="bajo"></input>
			 	""")))})),format.raw/*117.7*/("""
		 	</div>
	 	
	 	</div>
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 05 12:04:48 VET 2012
                    SOURCE: /home/carlos/Desktop/TDS/playapppostgres/app/views/config.scala.html
                    HASH: 9dbcf42a93d8549fe16505fbd2597c9005ed426f
                    MATRIX: 820->1|833->7|895->11|939->25|953->31|1026->83|1086->124|1100->131|1162->135|1208->151|1222->157|1294->208|1375->259|1389->265|1447->302|1516->121|1544->338|1573->357|1605->359|1652->397|1686->398|1862->544|1910->583|1945->585|3232->1840|3341->1919|3389->1958|3424->1960|4708->3213|4821->3296|4869->3335|4904->3337|6178->4579
                    LINES: 30->1|30->1|32->1|33->2|33->2|33->2|34->5|34->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->3|42->8|44->11|45->12|45->12|45->12|54->21|54->21|54->21|81->48|89->56|89->56|89->56|116->83|123->90|123->90|123->90|150->117
                    -- GENERATED --
                */
            