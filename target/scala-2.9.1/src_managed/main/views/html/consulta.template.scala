
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
object consulta extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0028)http://ldc.usb.ve/~06-39563/ -->
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Haz preguntas sobre la Encuesta de Opinion Estudiantil</title>
<!-- <script type="text/javascript" src="./Dirección de Seguridad Integral_files/jquery-1.8.2.js"></script> -->
<!-- <script type="text/javascript" src="./Dirección de Seguridad Integral_files/magia.js"></script> -->
<!-- <script type="text/javascript" src="./Dirección de Seguridad Integral_files/bootstrap.js"></script> -->
<!-- <link href="./Dirección de Seguridad Integral_files/bootstrap.css" rel="stylesheet" type="text/css"> -->
<!-- <link href="./Dirección de Seguridad Integral_files/bootstrap-responsive.css" rel="stylesheet" type="text/css"> -->
<link href="../../public/stylesheets/style.css" rel="stylesheet" type="text/css">
</head>

<body>

	<div id="container">
    
     <header id="header">
     </header>
        
     <div id="main">
       <div id="content">
         <h1> Preguntas </h1>
    
           
         <form id="Pregunta1" action="">
           <p class="preguntas">
           ¿Que materias son de dificultad  
             <select>
               <option value="1">baja</option>
               <option value="2">medio</option>
               <option value="3">alta</option>
             </select>
             y las imparten prefesores con un desempeno global
             <select>
               <option value="4">bajo</option>
               <option value="5">medio</option>
               <option value="6">alto</option>
             </select> 
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
         </form>
         
         </br>
         <hr>
         
         <form id="Pregunta2" action="">
           <p class="preguntas">
           ¿Cuales son las materias con un nivel de utilidad  
             <select>
               <option value="1">baja</option>
               <option value="2">medio</option>
               <option value="3">alta</option>
             </select>
             y requieren de un grado de esfuerzo
             <select>
               <option value="4">bajo</option>
               <option value="5">medio</option>
               <option value="6">alto</option>
             </select> 
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
         </form>

         </br>
         <hr>

         <form id="Pregunta3" action="">
           <p class="preguntas">
           ¿Que materias tienen un grado de utidad  
             <select>
               <option value="1">baja</option>
               <option value="2">medio</option>
               <option value="3">alta</option>
             </select>
             y las imparten prefesores con un desempeno global
             <select>
               <option value="4">bajo</option>
               <option value="5">medio</option>
               <option value="6">alto</option>
             </select> 
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
         </form>
    			
         </div>
            <div id="sidebar-first">
					<!-- <ul> -->
               <!--      	<li><a href="http://ldc.usb.ve/~06-39563/#box" class="window">Login</a></li> -->
               <!--          <li><a href="http://ldc.usb.ve/~06-39563/registro.html" class="register">Registro</a></li> -->
					<!-- </ul> -->
                    
               
                                       
               <ul id="navbar">                       
                 <li><a href="fuzzyindex.scala.html"> Inicio</a></li>
                 <li><a>Configuracion</a></li>
                 <li><a href="consulta.scala.html">Consultas</a></li>
                 <li><a>Item 4</a></li>
                 
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
    
    
   
</body></html>
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 05 12:04:48 VET 2012
                    SOURCE: /home/carlos/Desktop/TDS/playapppostgres/app/views/consulta.scala.html
                    HASH: bdcf55c337d64537a44e0ed26abd64f9edd4aab6
                    MATRIX: 817->0
                    LINES: 30->1
                    -- GENERATED --
                */
            