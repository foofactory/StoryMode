
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play Framework")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
    
    <script src=""""),_display_(Seq[Any](/*5.19*/routes/*5.25*/.Assets.at("javascripts/index.js"))),format.raw/*5.59*/(""""></script>

    <div class="well">
        <h1>"""),_display_(Seq[Any](/*8.14*/message)),format.raw/*8.21*/("""</h1>
    </div>
    
    Demos:
    <ul>
        <li><a href=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Application.syncFoo())),format.raw/*13.51*/("""">Sync Foo</a></li>
        <li><a href=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Application.asyncFoo())),format.raw/*14.52*/("""">Async Foo</a></li>
        <li><a href=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Application.asyncNonBlockingFoo())),format.raw/*15.63*/("""">Async Non-Blocking Foo</a></li>
        <li><a href=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Application.reactiveRequest())),format.raw/*16.59*/("""">Reactive Request</a></li>
        <li><a href=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Application.reactiveComposition())),format.raw/*17.63*/("""">Reactive Composition</a></li>
    </ul>
    
    <button id="sse-demo">Connect to Server Sent Event Channel</button>
    
    <br/><br/>
    
    <button id="websocket-demo">Send WebSocket Message</button>
    

""")))})),format.raw/*27.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 11:07:30 EDT 2014
                    SOURCE: /Users/eis/Development/Java/StoryMode/app/views/index.scala.html
                    HASH: ca119f1799dd27082b3a2b20a3bea9f1c5910c21
                    MATRIX: 774->1|885->18|922->21|963->54|1002->56|1061->80|1075->86|1130->120|1214->169|1242->176|1342->240|1357->246|1401->268|1479->310|1494->316|1539->339|1618->382|1633->388|1689->422|1781->478|1796->484|1848->514|1934->564|1949->570|2005->604|2251->819
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|36->8|36->8|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|55->27
                    -- GENERATED --
                */
            