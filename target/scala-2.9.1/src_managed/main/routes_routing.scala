// @SOURCE:/home/carlos/Desktop/TDS/playapppostgres/conf/routes
// @HASH:04d04304b1ae1b1d4bf3f0ebd7f68bae5d044f95
// @DATE:Wed Dec 05 12:04:45 VET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Application_consultaS1 = Route("GET", PathPattern(List(StaticPart("/consultaS"))))
                    

// @LINE:8
val controllers_Application_preguntaUnoS2 = Route("POST", PathPattern(List(StaticPart("/resconsultaS"))))
                    

// @LINE:9
val controllers_Application_preguntaDosS3 = Route("POST", PathPattern(List(StaticPart("/resconsultaS2"))))
                    

// @LINE:10
val controllers_Application_preguntaTresS4 = Route("POST", PathPattern(List(StaticPart("/resconsultaS3"))))
                    

// @LINE:11
val controllers_Application_preguntaCuatroS5 = Route("POST", PathPattern(List(StaticPart("/resconsultaS4"))))
                    

// @LINE:12
val controllers_Application_preguntaCincoS6 = Route("POST", PathPattern(List(StaticPart("/resconsultaS5"))))
                    

// @LINE:13
val controllers_Application_preguntaSeisS7 = Route("POST", PathPattern(List(StaticPart("/resconsultaS6"))))
                    

// @LINE:14
val controllers_Application_consultaC8 = Route("GET", PathPattern(List(StaticPart("/consultaC"))))
                    

// @LINE:15
val controllers_Application_preguntaUnoC9 = Route("POST", PathPattern(List(StaticPart("/resconsulta"))))
                    

// @LINE:16
val controllers_Application_preguntaDosC10 = Route("POST", PathPattern(List(StaticPart("/resconsulta2"))))
                    

// @LINE:17
val controllers_Application_preguntaTresC11 = Route("POST", PathPattern(List(StaticPart("/resconsulta3"))))
                    

// @LINE:18
val controllers_Application_config12 = Route("GET", PathPattern(List(StaticPart("/config"))))
                    

// @LINE:19
val controllers_Application_confighandle13 = Route("POST", PathPattern(List(StaticPart("/config"))))
                    

// @LINE:23
val controllers_Assets_at14 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/consultaS""","""controllers.Application.consultaS()"""),("""POST""","""/resconsultaS""","""controllers.Application.preguntaUnoS()"""),("""POST""","""/resconsultaS2""","""controllers.Application.preguntaDosS()"""),("""POST""","""/resconsultaS3""","""controllers.Application.preguntaTresS()"""),("""POST""","""/resconsultaS4""","""controllers.Application.preguntaCuatroS()"""),("""POST""","""/resconsultaS5""","""controllers.Application.preguntaCincoS()"""),("""POST""","""/resconsultaS6""","""controllers.Application.preguntaSeisS()"""),("""GET""","""/consultaC""","""controllers.Application.consultaC()"""),("""POST""","""/resconsulta""","""controllers.Application.preguntaUnoC()"""),("""POST""","""/resconsulta2""","""controllers.Application.preguntaDosC()"""),("""POST""","""/resconsulta3""","""controllers.Application.preguntaTresC()"""),("""GET""","""/config""","""controllers.Application.config()"""),("""POST""","""/config""","""controllers.Application.confighandle()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_consultaS1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.consultaS(), HandlerDef(this, "controllers.Application", "consultaS", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_preguntaUnoS2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.preguntaUnoS(), HandlerDef(this, "controllers.Application", "preguntaUnoS", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_preguntaDosS3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.preguntaDosS(), HandlerDef(this, "controllers.Application", "preguntaDosS", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_preguntaTresS4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.preguntaTresS(), HandlerDef(this, "controllers.Application", "preguntaTresS", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_preguntaCuatroS5(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.preguntaCuatroS(), HandlerDef(this, "controllers.Application", "preguntaCuatroS", Nil))
   }
}
                    

// @LINE:12
case controllers_Application_preguntaCincoS6(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.preguntaCincoS(), HandlerDef(this, "controllers.Application", "preguntaCincoS", Nil))
   }
}
                    

// @LINE:13
case controllers_Application_preguntaSeisS7(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.preguntaSeisS(), HandlerDef(this, "controllers.Application", "preguntaSeisS", Nil))
   }
}
                    

// @LINE:14
case controllers_Application_consultaC8(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.consultaC(), HandlerDef(this, "controllers.Application", "consultaC", Nil))
   }
}
                    

// @LINE:15
case controllers_Application_preguntaUnoC9(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.preguntaUnoC(), HandlerDef(this, "controllers.Application", "preguntaUnoC", Nil))
   }
}
                    

// @LINE:16
case controllers_Application_preguntaDosC10(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.preguntaDosC(), HandlerDef(this, "controllers.Application", "preguntaDosC", Nil))
   }
}
                    

// @LINE:17
case controllers_Application_preguntaTresC11(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.preguntaTresC(), HandlerDef(this, "controllers.Application", "preguntaTresC", Nil))
   }
}
                    

// @LINE:18
case controllers_Application_config12(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.config(), HandlerDef(this, "controllers.Application", "config", Nil))
   }
}
                    

// @LINE:19
case controllers_Application_confighandle13(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.confighandle(), HandlerDef(this, "controllers.Application", "confighandle", Nil))
   }
}
                    

// @LINE:23
case controllers_Assets_at14(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                