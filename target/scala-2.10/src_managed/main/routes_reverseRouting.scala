// @SOURCE:/Users/eis/Development/Java/StoryMode/conf/routes
// @HASH:387d6b07efd96656acd3679ebb98828a1a2612bc
// @DATE:Sat Oct 18 12:55:20 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:5
package controllers {

// @LINE:23
class ReverseWebJarAssets {
    

// @LINE:23
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:5
class ReverseApplication {
    

// @LINE:12
def reactiveRequest(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reactive-request")
}
                                                

// @LINE:13
def reactiveComposition(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reactive-composition")
}
                                                

// @LINE:11
def asyncNonBlockingFoo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "async-non-blocking-foo")
}
                                                

// @LINE:10
def asyncFoo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "async-foo")
}
                                                

// @LINE:16
def events(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events")
}
                                                

// @LINE:9
def syncFoo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sync-foo")
}
                                                

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:7
def feedback(foo:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test/" + implicitly[PathBindable[String]].unbind("foo", dynamicString(foo)))
}
                                                

// @LINE:19
def echo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "echo")
}
                                                
    
}
                          
}
                  


// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:5
package controllers.javascript {

// @LINE:23
class ReverseWebJarAssets {
    

// @LINE:23
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:5
class ReverseApplication {
    

// @LINE:12
def reactiveRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.reactiveRequest",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reactive-request"})
      }
   """
)
                        

// @LINE:13
def reactiveComposition : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.reactiveComposition",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reactive-composition"})
      }
   """
)
                        

// @LINE:11
def asyncNonBlockingFoo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.asyncNonBlockingFoo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "async-non-blocking-foo"})
      }
   """
)
                        

// @LINE:10
def asyncFoo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.asyncFoo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "async-foo"})
      }
   """
)
                        

// @LINE:16
def events : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.events",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events"})
      }
   """
)
                        

// @LINE:9
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
                        

// @LINE:7
def feedback : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.feedback",
   """
      function(foo) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("foo", encodeURIComponent(foo))})
      }
   """
)
                        

// @LINE:19
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
        


// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:5
package controllers.ref {


// @LINE:23
class ReverseWebJarAssets {
    

// @LINE:23
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:5
class ReverseApplication {
    

// @LINE:12
def reactiveRequest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.reactiveRequest(), HandlerDef(this, "controllers.Application", "reactiveRequest", Seq(), "GET", """""", _prefix + """reactive-request""")
)
                      

// @LINE:13
def reactiveComposition(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.reactiveComposition(), HandlerDef(this, "controllers.Application", "reactiveComposition", Seq(), "GET", """""", _prefix + """reactive-composition""")
)
                      

// @LINE:11
def asyncNonBlockingFoo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.asyncNonBlockingFoo(), HandlerDef(this, "controllers.Application", "asyncNonBlockingFoo", Seq(), "GET", """""", _prefix + """async-non-blocking-foo""")
)
                      

// @LINE:10
def asyncFoo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.asyncFoo(), HandlerDef(this, "controllers.Application", "asyncFoo", Seq(), "GET", """""", _prefix + """async-foo""")
)
                      

// @LINE:16
def events(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.events(), HandlerDef(this, "controllers.Application", "events", Seq(), "GET", """ Server Sent Events""", _prefix + """events""")
)
                      

// @LINE:9
def syncFoo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.syncFoo(), HandlerDef(this, "controllers.Application", "syncFoo", Seq(), "GET", """""", _prefix + """sync-foo""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:7
def feedback(foo:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.feedback(foo), HandlerDef(this, "controllers.Application", "feedback", Seq(classOf[String]), "GET", """""", _prefix + """test/$foo<[^/]+>""")
)
                      

// @LINE:19
def echo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.echo(), HandlerDef(this, "controllers.Application", "echo", Seq(), "GET", """ WebSocket""", _prefix + """echo""")
)
                      
    
}
                          
}
        
    