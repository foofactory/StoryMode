
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

<script src=""""),_display_(Seq[Any](/*5.15*/routes/*5.21*/.Assets.at("javascripts/index.js"))),format.raw/*5.55*/(""""></script>

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
                    DATE: Sat Oct 18 12:18:21 EDT 2014
                    SOURCE: /Users/eis/Development/Java/StoryMode/app/views/index.scala.html
                    HASH: 69ec1c7ad6cf4f6a7bb18b56a4b7a078cd24fc46
                    MATRIX: 774->1|885->18|922->21|963->54|1002->56|1053->72|1067->78|1122->112|1206->161|1234->168|1334->232|1349->238|1393->260|1471->302|1486->308|1531->331|1610->374|1625->380|1681->414|1773->470|1788->476|1840->506|1926->556|1941->562|1997->596|2243->811
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|36->8|36->8|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|55->27
                    -- GENERATED --
                */
            