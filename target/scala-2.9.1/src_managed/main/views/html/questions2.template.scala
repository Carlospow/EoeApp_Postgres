
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
object questions2 extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id : String):play.api.templates.Html = {
        _display_ {import helper._

def /*3.2*/styles/*3.8*/:play.api.templates.Html = {_display_(

Seq(format.raw/*3.12*/("""
""")))};def /*6.2*/scripts/*6.9*/:play.api.templates.Html = {_display_(

Seq(format.raw/*6.13*/("""
""")))};
Seq(format.raw/*1.15*/("""

"""),format.raw/*4.2*/("""

"""),format.raw/*7.2*/("""

"""),format.raw/*10.1*/("""
"""),_display_(Seq(/*11.2*/main("Preguntas")(styles)(scripts)/*11.36*/{_display_(Seq(format.raw/*11.37*/("""

         """),_display_(Seq(/*13.11*/(id))),format.raw/*13.15*/("""
         <h1> Preguntas Simples</h1>
     

         <ul>

           <li>"""),_display_(Seq(/*19.17*/form(routes.Application.preguntaUnoS())/*19.56*/ {_display_(Seq(format.raw/*19.58*/("""        
           <p class="preguntas">
             ¿Que materias son de dificultad  
             <select name="p1">
               <option value="dificultad_bajo">baja</option>
               <option value="dificultad_medio">medio</option>
               <option value="dificultad_alto">alta</option>
             </select>
             ?
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
	        """)))})),format.raw/*30.11*/("""
    
         </li>
         </br>
         </br>
         <hr>
         
         <li>"""),_display_(Seq(/*37.15*/form(routes.Application.preguntaDosS())/*37.54*/ {_display_(Seq(format.raw/*37.56*/("""        
           <p class="preguntas">
             ¿Que materias requieren un nivel de esfuerzo  
             <select name="p2">
               <option value="esfuerzo_bajo">bajo</option>
               <option value="esfuerzo_medio">medio</option>
               <option value="esfuerzo_alto">alto</option>
             </select>
             ?
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
	        """)))})),format.raw/*48.11*/("""
    
         </li>
         </br>
         </br>
         <hr>

         <li>"""),_display_(Seq(/*55.15*/form(routes.Application.preguntaTresS())/*55.55*/ {_display_(Seq(format.raw/*55.57*/("""        
           <p class="preguntas">
             ¿Que materias poseen un nivel de utilidad  
             <select name="p3">
               <option value="utilidad_bajo">bajo</option>
               <option value="utilidad_medio">medio</option>
               <option value="utilidad_alto">alto</option>
             </select>
             ?
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
	        """)))})),format.raw/*66.11*/("""
    
         
         </li>
         </br>
         </br>
         <hr>

         <li>"""),_display_(Seq(/*74.15*/form(routes.Application.preguntaCuatroS())/*74.57*/ {_display_(Seq(format.raw/*74.59*/("""        
           <p class="preguntas">
             ¿Que profesores poseen un desempeño global   
             <select name="p4">
               <option value="calidad_prof_bajo">bajo</option>
               <option value="calidad_prof_medio">medio</option>
               <option value="calidad_prof_alto">alto</option>
             </select>
             ?
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
	        """)))})),format.raw/*85.11*/("""
    
           </li>
         </br>
         </br>
         <hr>


         <li>"""),_display_(Seq(/*93.15*/form(routes.Application.preguntaCincoS())/*93.56*/ {_display_(Seq(format.raw/*93.58*/("""        
           <p class="preguntas">
             ¿Que materias poseen una expectativa de calificación    
             <select name="p5">
               <option value="expectativa_bajo">baja</option>
               <option value="expectativa_medio">media</option>
               <option value="expectativa_alto">alta</option>
             </select>
             ?
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
	        """)))})),format.raw/*104.11*/("""
    
         </li>
         </br>
         </br>
         <hr>
         

         <li>"""),_display_(Seq(/*112.15*/form(routes.Application.preguntaSeisS())/*112.55*/ {_display_(Seq(format.raw/*112.57*/("""        
           <p class="preguntas">
             ¿Que materias requieren un grado de preparación previa   
             <select name="p6">
               <option value="preparacion_bajo">bajo</option>
               <option value="preparacion_medio">medio</option>
               <option value="preparacion_alto">alto</option>
             </select>
             ?
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
	        """)))})),format.raw/*123.11*/("""
    
         </li>
         </br>
         </br>
         <hr>

""")))})),format.raw/*130.2*/("""
"""))}
    }
    
    def render(id:String) = apply(id)
    
    def f:((String) => play.api.templates.Html) = (id) => apply(id)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 05 12:04:49 VET 2012
                    SOURCE: /home/carlos/Desktop/TDS/playapppostgres/app/views/questions2.scala.html
                    HASH: 0f32826416916b6606f118be419ec4ab31a5f15f
                    MATRIX: 760->1|849->17|862->23|924->27|948->32|962->39|1024->43|1060->14|1088->29|1116->45|1145->64|1177->66|1220->100|1254->101|1297->113|1323->117|1430->193|1478->232|1513->234|1988->677|2108->766|2156->805|2191->807|2673->1257|2784->1337|2833->1377|2868->1379|3347->1826|3468->1916|3519->1958|3554->1960|4047->2421|4161->2504|4211->2545|4246->2547|4748->3016|4870->3106|4920->3146|4956->3148|5459->3618|5558->3685
                    LINES: 27->1|30->3|30->3|32->3|33->6|33->6|35->6|37->1|39->4|41->7|43->10|44->11|44->11|44->11|46->13|46->13|52->19|52->19|52->19|63->30|70->37|70->37|70->37|81->48|88->55|88->55|88->55|99->66|107->74|107->74|107->74|118->85|126->93|126->93|126->93|137->104|145->112|145->112|145->112|156->123|163->130
                    -- GENERATED --
                */
            