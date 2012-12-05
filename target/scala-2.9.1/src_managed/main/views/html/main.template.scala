
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Html,Html,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String = "Inicio")(styles: Html)(scripts: Html)(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.72*/("""

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0028)http://ldc.usb.ve/~06-39563/ -->

<html xmlns="http://www.w3.org/1999/xhtml">

<html>
    <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta de Opinion Estudiantil Difusa - """),_display_(Seq(/*11.58*/title)),format.raw/*11.63*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/style.css"))),format.raw/*12.95*/("""">
       
        """),_display_(Seq(/*14.10*/styles)),format.raw/*14.16*/("""
        
        <!-- link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*16.63*/routes/*16.69*/.Assets.at("images/favicon.png"))),format.raw/*16.101*/("""" -->
        
        <script src=""""),_display_(Seq(/*18.23*/routes/*18.29*/.Assets.at("javascripts/jquery-1.8.3.js"))),format.raw/*18.70*/("""" type="text/javascript"></script>
        
        """),_display_(Seq(/*20.10*/scripts)),format.raw/*20.17*/("""

        
        
    </head>
    <body>
        
		<div id="container">
	    
	    	<header id="header">
	        </header>
	        
	        <div id="main">
	        
	        	<div id="content">
	            	"""),_display_(Seq(/*35.16*/content)),format.raw/*35.23*/("""
	           	</div>
	           	
	            <div id="sidebar-first">                     
	               <ul id="navbar">                       
	                 <li><a href="/"> Inicio</a></li>
	                 <li><a href="/consultaS">Consultas Simples</a></li>
	                 <li><a href="/consultaC">Consultas Compuestas</a></li>
                    <li><a href="/config">Configuración</a></li>
                    
	               </ul>               
	            </div>
	            
	            <div id="sidebar-second">
	                <h2> Links de interés </h2>
	                <ul>
	                    <li>Propaganda 1</li>
	                    <li>Link hacia algun lugar</li>
	                    <li>Green Card</li>
	                </ul>
	            </div>
	            
	        </div>
	        
	        <div id="footer">
	        	<p> Sartenejas, Baruta, Edo. Miranda - Apartado 89000 - Cable Unibolivar - Caracas Venezuela. Teléfono +58 0212-9063111<br>
				Diseñada y desarrollada por Narfred Inc, Modificada por CH y AR </p>
	        </div>
	    
		</div>
        
    </body>
</html>
"""))}
    }
    
    def render(title:String,styles:Html,scripts:Html,content:Html) = apply(title)(styles)(scripts)(content)
    
    def f:((String) => (Html) => (Html) => (Html) => play.api.templates.Html) = (title) => (styles) => (scripts) => (content) => apply(title)(styles)(scripts)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 05 12:04:48 VET 2012
                    SOURCE: /home/carlos/Desktop/TDS/playapppostgres/app/views/main.scala.html
                    HASH: d7f072823af861369b7140598ab1cc36fd27c425
                    MATRIX: 769->1|911->71|1319->448|1346->453|1439->515|1454->521|1511->556|1562->576|1590->582|1693->654|1708->660|1763->692|1831->729|1846->735|1909->776|1993->829|2022->836|2269->1052|2298->1059
                    LINES: 27->1|30->1|40->11|40->11|41->12|41->12|41->12|43->14|43->14|45->16|45->16|45->16|47->18|47->18|47->18|49->20|49->20|64->35|64->35
                    -- GENERATED --
                */
            