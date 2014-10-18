// @SOURCE:/Users/eis/Development/Java/StoryMode/conf/routes
// @HASH:d9aa5fce1d3b586e281ab1fe18252d851b8dc6e2
// @DATE:Sat Oct 18 11:07:28 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
package controllers {

// @LINE:21
class ReverseWebJarAssets {
    

// @LINE:21
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
class ReverseApplication {
    

// @LINE:10
def reactiveRequest(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reactive-request")
}
                                                

// @LINE:11
def reactiveComposition(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reactive-composition")
}
                                                

// @LINE:9
def asyncNonBlockingFoo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "async-non-blocking-foo")
}
                                                

// @LINE:8
def asyncFoo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "async-foo")
}
                                                

// @LINE:14
def events(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events")
}
                                                

// @LINE:7
def syncFoo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sync-foo")
}
                                                

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:17
def echo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "echo")
}
                                                
    
}
                          
}
                  


// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
package controllers.javascript {

// @LINE:21
class ReverseWebJarAssets {
    

// @LINE:21
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
class ReverseApplication {
    

// @LINE:10
def reactiveRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.reactiveRequest",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reactive-request"})
      }
   """
)
                        

// @LINE:11
def reactiveComposition : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.reactiveComposition",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reactive-composition"})
      }
   """
)
                        

// @LINE:9
def asyncNonBlockingFoo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.asyncNonBlockingFoo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "async-non-blocking-foo"})
      }
   """
)
                        

// @LINE:8
def asyncFoo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.asyncFoo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "async-foo"})
      }
   """
)
                        

// @LINE:14
def events : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.events",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events"})
      }
   """
)
                        

// @LINE:7
def syncFoo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.syncFoo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sync-foo"})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:17
def echo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.echo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "echo"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
package controllers.ref {


// @LINE:21
class ReverseWebJarAssets {
    

// @LINE:21
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
class ReverseApplication {
    

// @LINE:10
def reactiveRequest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.reactiveRequest(), HandlerDef(this, "controllers.Application", "reactiveRequest", Seq(), "GET", """""", _prefix + """reactive-request""")
)
                      

// @LINE:11
def reactiveComposition(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.reactiveComposition(), HandlerDef(this, "controllers.Application", "reactiveComposition", Seq(), "GET", """""", _prefix + """reactive-composition""")
)
                      

// @LINE:9
def asyncNonBlockingFoo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.asyncNonBlockingFoo(), HandlerDef(this, "controllers.Application", "asyncNonBlockingFoo", Seq(), "GET", """""", _prefix + """async-non-blocking-foo""")
)
                      

// @LINE:8
def asyncFoo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.asyncFoo(), HandlerDef(this, "controllers.Application", "asyncFoo", Seq(), "GET", """""", _prefix + """async-foo""")
)
                      

// @LINE:14
def events(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.events(), HandlerDef(this, "controllers.Application", "events", Seq(), "GET", """ Server Sent Events""", _prefix + """events""")
)
                      

// @LINE:7
def syncFoo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.syncFoo(), HandlerDef(this, "controllers.Application", "syncFoo", Seq(), "GET", """""", _prefix + """sync-foo""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:17
def echo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.echo(), HandlerDef(this, "controllers.Application", "echo", Seq(), "GET", """ WebSocket""", _prefix + """echo""")
)
                      
    
}
                          
}
        
    