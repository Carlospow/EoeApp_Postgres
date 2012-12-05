
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
object questions extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

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
         """),_display_(Seq(/*12.11*/(id))),format.raw/*12.15*/("""
         <h1> Preguntas Compuestas</h1>
     

         <ul>

         <li>"""),_display_(Seq(/*18.15*/form(routes.Application.preguntaUnoC())/*18.54*/ {_display_(Seq(format.raw/*18.56*/("""        
         <p class="preguntas">
           ¿Que materias son de dificultad  
             <select name="p1parte1">
               <option value="dificultad_bajo">baja</option>
               <option value="dificultad_medio">medio</option>
               <option value="dificultad_alto">alta</option>
             </select>
             y las imparten profesores con un desempeno global
             <select name="p1parte2">
               <option value="calidad_prof_bajo">bajo</option>
               <option value="calidad_prof_medio">medio</option>
               <option value="calidad_prof_alto">alto</option>
             </select> 
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
	        """)))})),format.raw/*34.11*/("""
    
         
         </li>
         </br>
         </br>
         <hr>
         
         <li>"""),_display_(Seq(/*42.15*/form(routes.Application.preguntaDosC())/*42.54*/ {_display_(Seq(format.raw/*42.56*/("""
           <p class="preguntas">
           ¿Cuales son las materias con un nivel de utilidad  
             <select name="p2parte1">
               <option value="utilidad_bajo">baja</option>
               <option value="utilidad_medio">medio</option>
               <option value="utilidad_alto">alta</option>
             </select>
             y requieren de un grado de esfuerzo
             <select name="p2parte2">
               <option value="esfuerzo_bajo">bajo</option>
               <option value="esfuerzo_medio">medio</option>
               <option value="esfuerzo_alto">alto</option>
             </select> 
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
         """)))})),format.raw/*58.11*/("""

         
         </li>
         </br>
         </br>
         <hr>

         <li>"""),_display_(Seq(/*66.15*/form(routes.Application.preguntaTresC())/*66.55*/ {_display_(Seq(format.raw/*66.57*/("""
           <p class="preguntas">
           ¿Que materias tienen un grado de utidad  
             <select name="p3parte1">
               <option value="utilidad_bajo">baja</option>
               <option value="utilidad_medio">medio</option>
               <option value="utilidad_alto">alta</option>
             </select>
             y las imparten prefesores con un desempeno global
             <select name="p3parte2">
               <option value="calidad_prof_bajo">bajo</option>
               <option value="calidad_prof_medio">medio</option>
               <option value="calidad_prof_alto">alto</option>
             </select> 
           </p>
           <input type="submit" value="Enviar" class="b_submit"></input>
         """)))})),format.raw/*82.11*/("""
          </li>
         </br>
         </br>
         
         </ul> 

""")))})),format.raw/*89.2*/("""
"""))}
    }
    
    def render(id:String) = apply(id)
    
    def f:((String) => play.api.templates.Html) = (id) => apply(id)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Dec 05 12:04:48 VET 2012
                    SOURCE: /home/carlos/Desktop/TDS/playapppostgres/app/views/questions.scala.html
                    HASH: 4db6af12b4fd18ba10cb22d646bd967ec88dba39
                    MATRIX: 759->1|848->17|861->23|923->27|947->32|961->39|1023->43|1059->14|1087->29|1115->45|1144->64|1176->66|1219->100|1253->101|1295->112|1321->116|1429->193|1477->232|1512->234|2290->980|2420->1079|2468->1118|2503->1120|3261->1846|3378->1932|3427->1972|3462->1974|4236->2716|4342->2791
                    LINES: 27->1|30->3|30->3|32->3|33->6|33->6|35->6|37->1|39->4|41->7|43->10|44->11|44->11|44->11|45->12|45->12|51->18|51->18|51->18|67->34|75->42|75->42|75->42|91->58|99->66|99->66|99->66|115->82|122->89
                    -- GENERATED --
                */
            