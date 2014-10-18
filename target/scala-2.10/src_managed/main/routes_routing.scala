// @SOURCE:/Users/eis/Development/Java/StoryMode/conf/routes
// @HASH:d9aa5fce1d3b586e281ab1fe18252d851b8dc6e2
// @DATE:Sat Oct 18 11:07:28 EDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_syncFoo1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sync-foo"))))
        

// @LINE:8
private[this] lazy val controllers_Application_asyncFoo2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("async-foo"))))
        

// @LINE:9
private[this] lazy val controllers_Application_asyncNonBlockingFoo3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("async-non-blocking-foo"))))
        

// @LINE:10
private[this] lazy val controllers_Application_reactiveRequest4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reactive-request"))))
        

// @LINE:11
private[this] lazy val controllers_Application_reactiveComposition5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reactive-composition"))))
        

// @LINE:14
private[this] lazy val controllers_Application_events6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events"))))
        

// @LINE:17
private[this] lazy val controllers_Application_echo7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("echo"))))
        

// @LINE:20
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:21
private[this] lazy val controllers_WebJarAssets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sync-foo""","""controllers.Application.syncFoo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """async-foo""","""controllers.Application.asyncFoo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """async-non-blocking-foo""","""controllers.Application.asyncNonBlockingFoo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reactive-request""","""controllers.Application.reactiveRequest()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reactive-composition""","""controllers.Application.reactiveComposition()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events""","""controllers.Application.events()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """echo""","""controllers.Application.echo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_syncFoo1(params) => {
   call { 
        invokeHandler(controllers.Application.syncFoo(), HandlerDef(this, "controllers.Application", "syncFoo", Nil,"GET", """""", Routes.prefix + """sync-foo"""))
   }
}
        

// @LINE:8
case controllers_Application_asyncFoo2(params) => {
   call { 
        invokeHandler(controllers.Application.asyncFoo(), HandlerDef(this, "controllers.Application", "asyncFoo", Nil,"GET", """""", Routes.prefix + """async-foo"""))
   }
}
        

// @LINE:9
case controllers_Application_asyncNonBlockingFoo3(params) => {
   call { 
        invokeHandler(controllers.Application.asyncNonBlockingFoo(), HandlerDef(this, "controllers.Application", "asyncNonBlockingFoo", Nil,"GET", """""", Routes.prefix + """async-non-blocking-foo"""))
   }
}
        

// @LINE:10
case controllers_Application_reactiveRequest4(params) => {
   call { 
        invokeHandler(controllers.Application.reactiveRequest(), HandlerDef(this, "controllers.Application", "reactiveRequest", Nil,"GET", """""", Routes.prefix + """reactive-request"""))
   }
}
        

// @LINE:11
case controllers_Application_reactiveComposition5(params) => {
   call { 
        invokeHandler(controllers.Application.reactiveComposition(), HandlerDef(this, "controllers.Application", "reactiveComposition", Nil,"GET", """""", Routes.prefix + """reactive-composition"""))
   }
}
        

// @LINE:14
case controllers_Application_events6(params) => {
   call { 
        invokeHandler(controllers.Application.events(), HandlerDef(this, "controllers.Application", "events", Nil,"GET", """ Server Sent Events""", Routes.prefix + """events"""))
   }
}
        

// @LINE:17
case controllers_Application_echo7(params) => {
   call { 
        invokeHandler(controllers.Application.echo(), HandlerDef(this, "controllers.Application", "echo", Nil,"GET", """ WebSocket""", Routes.prefix + """echo"""))
   }
}
        

// @LINE:20
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:21
case controllers_WebJarAssets_at9(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        
}

}
     