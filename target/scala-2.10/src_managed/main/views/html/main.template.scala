
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <title>"""),_display_(Seq[Any](/*7.13*/title)),format.raw/*7.18*/("""</title>
    <link rel='shortcut icon' type='image/png' href='"""),_display_(Seq[Any](/*8.55*/routes/*8.61*/.Assets.at("images/favicon.png"))),format.raw/*8.93*/("""'>
    <link rel='stylesheet' href='"""),_display_(Seq[Any](/*9.35*/routes/*9.41*/.WebJarAssets.at(WebJarAssets.locate("bootstrap.min.css")))),format.raw/*9.99*/("""'>
    <script type='text/javascript' src='"""),_display_(Seq[Any](/*10.42*/routes/*10.48*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js")))),format.raw/*10.102*/("""'></script>
    <style>

        body """),format.raw/*13.14*/("""{"""),format.raw/*13.15*/("""
        margin-top: 50px;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
    </style>
</head>
<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a id="titleLink" class="brand" href="/">"""),_display_(Seq[Any](/*22.55*/title)),format.raw/*22.60*/("""</a>
        </div>
    </div>
</div>
<div class="container">
    """),_display_(Seq[Any](/*27.6*/content)),format.raw/*27.13*/("""
</div>

</body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 14:43:39 EDT 2014
                    SOURCE: /Users/eis/Development/Java/StoryMode/app/views/main.scala.html
                    HASH: 206f2b00a06735992613aa8823d81113e526420b
                    MATRIX: 778->1|902->31|1072->166|1098->171|1196->234|1210->240|1263->272|1335->309|1349->315|1428->373|1508->417|1523->423|1600->477|1666->515|1695->516|1757->551|1786->552|2012->742|2039->747|2141->814|2170->821
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|43->15|43->15|50->22|50->22|55->27|55->27
                    -- GENERATED --
                */
            