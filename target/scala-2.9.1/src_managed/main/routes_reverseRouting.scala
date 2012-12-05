// @SOURCE:/home/carlos/Desktop/TDS/playapppostgres/conf/routes
// @HASH:04d04304b1ae1b1d4bf3f0ebd7f68bae5d044f95
// @DATE:Wed Dec 05 12:04:45 VET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:23
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:18
def config() = {
   Call("GET", "/config")
}
                                                        
 
// @LINE:19
def confighandle() = {
   Call("POST", "/config")
}
                                                        
 
// @LINE:12
def preguntaCincoS() = {
   Call("POST", "/resconsultaS5")
}
                                                        
 
// @LINE:17
def preguntaTresC() = {
   Call("POST", "/resconsulta3")
}
                                                        
 
// @LINE:11
def preguntaCuatroS() = {
   Call("POST", "/resconsultaS4")
}
                                                        
 
// @LINE:14
def consultaC() = {
   Call("GET", "/consultaC")
}
                                                        
 
// @LINE:9
def preguntaDosS() = {
   Call("POST", "/resconsultaS2")
}
                                                        
 
// @LINE:15
def preguntaUnoC() = {
   Call("POST", "/resconsulta")
}
                                                        
 
// @LINE:10
def preguntaTresS() = {
   Call("POST", "/resconsultaS3")
}
                                                        
 
// @LINE:7
def consultaS() = {
   Call("GET", "/consultaS")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:8
def preguntaUnoS() = {
   Call("POST", "/resconsultaS")
}
                                                        
 
// @LINE:16
def preguntaDosC() = {
   Call("POST", "/resconsulta2")
}
                                                        
 
// @LINE:13
def preguntaSeisS() = {
   Call("POST", "/resconsultaS6")
}
                                                        

                      
    
}
                            

// @LINE:23
class ReverseAssets {
    


 
// @LINE:23
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:23
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:18
def config = JavascriptReverseRoute(
   "controllers.Application.config",
   """
      function() {
      return _wA({method:"GET", url:"/config"})
      }
   """
)
                                                        
 
// @LINE:19
def confighandle = JavascriptReverseRoute(
   "controllers.Application.confighandle",
   """
      function() {
      return _wA({method:"POST", url:"/config"})
      }
   """
)
                                                        
 
// @LINE:12
def preguntaCincoS = JavascriptReverseRoute(
   "controllers.Application.preguntaCincoS",
   """
      function() {
      return _wA({method:"POST", url:"/resconsultaS5"})
      }
   """
)
                                                        
 
// @LINE:17
def preguntaTresC = JavascriptReverseRoute(
   "controllers.Application.preguntaTresC",
   """
      function() {
      return _wA({method:"POST", url:"/resconsulta3"})
      }
   """
)
                                                        
 
// @LINE:11
def preguntaCuatroS = JavascriptReverseRoute(
   "controllers.Application.preguntaCuatroS",
   """
      function() {
      return _wA({method:"POST", url:"/resconsultaS4"})
      }
   """
)
                                                        
 
// @LINE:14
def consultaC = JavascriptReverseRoute(
   "controllers.Application.consultaC",
   """
      function() {
      return _wA({method:"GET", url:"/consultaC"})
      }
   """
)
                                                        
 
// @LINE:9
def preguntaDosS = JavascriptReverseRoute(
   "controllers.Application.preguntaDosS",
   """
      function() {
      return _wA({method:"POST", url:"/resconsultaS2"})
      }
   """
)
                                                        
 
// @LINE:15
def preguntaUnoC = JavascriptReverseRoute(
   "controllers.Application.preguntaUnoC",
   """
      function() {
      return _wA({method:"POST", url:"/resconsulta"})
      }
   """
)
                                                        
 
// @LINE:10
def preguntaTresS = JavascriptReverseRoute(
   "controllers.Application.preguntaTresS",
   """
      function() {
      return _wA({method:"POST", url:"/resconsultaS3"})
      }
   """
)
                                                        
 
// @LINE:7
def consultaS = JavascriptReverseRoute(
   "controllers.Application.consultaS",
   """
      function() {
      return _wA({method:"GET", url:"/consultaS"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:8
def preguntaUnoS = JavascriptReverseRoute(
   "controllers.Application.preguntaUnoS",
   """
      function() {
      return _wA({method:"POST", url:"/resconsultaS"})
      }
   """
)
                                                        
 
// @LINE:16
def preguntaDosC = JavascriptReverseRoute(
   "controllers.Application.preguntaDosC",
   """
      function() {
      return _wA({method:"POST", url:"/resconsulta2"})
      }
   """
)
                                                        
 
// @LINE:13
def preguntaSeisS = JavascriptReverseRoute(
   "controllers.Application.preguntaSeisS",
   """
      function() {
      return _wA({method:"POST", url:"/resconsultaS6"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:23
class ReverseAssets {
    


 
// @LINE:23
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:23
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:18
def config() = new play.api.mvc.HandlerRef(
   controllers.Application.config(), HandlerDef(this, "controllers.Application", "config", Seq())
)
                              
 
// @LINE:19
def confighandle() = new play.api.mvc.HandlerRef(
   controllers.Application.confighandle(), HandlerDef(this, "controllers.Application", "confighandle", Seq())
)
                              
 
// @LINE:12
def preguntaCincoS() = new play.api.mvc.HandlerRef(
   controllers.Application.preguntaCincoS(), HandlerDef(this, "controllers.Application", "preguntaCincoS", Seq())
)
                              
 
// @LINE:17
def preguntaTresC() = new play.api.mvc.HandlerRef(
   controllers.Application.preguntaTresC(), HandlerDef(this, "controllers.Application", "preguntaTresC", Seq())
)
                              
 
// @LINE:11
def preguntaCuatroS() = new play.api.mvc.HandlerRef(
   controllers.Application.preguntaCuatroS(), HandlerDef(this, "controllers.Application", "preguntaCuatroS", Seq())
)
                              
 
// @LINE:14
def consultaC() = new play.api.mvc.HandlerRef(
   controllers.Application.consultaC(), HandlerDef(this, "controllers.Application", "consultaC", Seq())
)
                              
 
// @LINE:9
def preguntaDosS() = new play.api.mvc.HandlerRef(
   controllers.Application.preguntaDosS(), HandlerDef(this, "controllers.Application", "preguntaDosS", Seq())
)
                              
 
// @LINE:15
def preguntaUnoC() = new play.api.mvc.HandlerRef(
   controllers.Application.preguntaUnoC(), HandlerDef(this, "controllers.Application", "preguntaUnoC", Seq())
)
                              
 
// @LINE:10
def preguntaTresS() = new play.api.mvc.HandlerRef(
   controllers.Application.preguntaTresS(), HandlerDef(this, "controllers.Application", "preguntaTresS", Seq())
)
                              
 
// @LINE:7
def consultaS() = new play.api.mvc.HandlerRef(
   controllers.Application.consultaS(), HandlerDef(this, "controllers.Application", "consultaS", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:8
def preguntaUnoS() = new play.api.mvc.HandlerRef(
   controllers.Application.preguntaUnoS(), HandlerDef(this, "controllers.Application", "preguntaUnoS", Seq())
)
                              
 
// @LINE:16
def preguntaDosC() = new play.api.mvc.HandlerRef(
   controllers.Application.preguntaDosC(), HandlerDef(this, "controllers.Application", "preguntaDosC", Seq())
)
                              
 
// @LINE:13
def preguntaSeisS() = new play.api.mvc.HandlerRef(
   controllers.Application.preguntaSeisS(), HandlerDef(this, "controllers.Application", "preguntaSeisS", Seq())
)
                              

                      
    
}
                            

// @LINE:23
class ReverseAssets {
    


 
// @LINE:23
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                