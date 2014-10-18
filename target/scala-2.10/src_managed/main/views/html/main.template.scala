
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
        .popup"""),format.raw/*12.15*/("""{"""),format.raw/*12.16*/("""
        position:fixed;
        width:100%;
        height:100%;
        left:0px;
        right:0px;
        top: 0px;
        bottom:0px;
        background-color:rgba(3,3,3,0.8);
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""

        .popupWindow"""),format.raw/*23.21*/("""{"""),format.raw/*23.22*/("""
        background-color:white;
        margin:0px auto;

        width:400px;
        height:300px;

        margin-top:12%;
        text-align: center;
        -moz-border-radius: 50px 50px / 50px 50px;
        border-radius: 50px 50px / 50px 50px;
        box-shadow: 10px 10px 5px #000;
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/("""

        .popup-title"""),format.raw/*37.21*/("""{"""),format.raw/*37.22*/("""
        background-color:purple;
        position: fixed;
        left: 50%;
        transform: translate(-50%, 0%);
        font-size:26px;
        font-weight:bold;
        margin:10px;
        padding-top:10px;
        color:green;
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""

        .popup_img"""),format.raw/*49.19*/("""{"""),format.raw/*49.20*/("""
        maring:10px;
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/("""

        .popup_img_yes,.popup_img_no"""),format.raw/*53.37*/("""{"""),format.raw/*53.38*/("""
        margin:20px;
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""

        body """),format.raw/*57.14*/("""{"""),format.raw/*57.15*/("""
        margin-top: 50px;
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/("""
    </style>
    <script>
            $(document).ready(function()"""),format.raw/*62.41*/("""{"""),format.raw/*62.42*/("""

                $( ".popup_img_yes" ).click(function() """),format.raw/*64.56*/("""{"""),format.raw/*64.57*/("""
                            $( ".popup" ).fadeOut( 1200 );
              """),format.raw/*66.15*/("""}"""),format.raw/*66.16*/(""");

              $( ".popup_img_no" ).click(function() """),format.raw/*68.53*/("""{"""),format.raw/*68.54*/("""
                            window.open("http://www.google.com","_self");
              """),format.raw/*70.15*/("""}"""),format.raw/*70.16*/(""");

            """),format.raw/*72.13*/("""}"""),format.raw/*72.14*/(""");
    </script>
</head>
<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a id="titleLink" class="brand" href="/">"""),_display_(Seq[Any](/*79.55*/title)),format.raw/*79.60*/("""</a>
        </div>
    </div>
</div>
<div class="container">
    """),_display_(Seq[Any](/*84.6*/content)),format.raw/*84.13*/("""
</div>


<div class="popup"> <!-- popup content start || copy this to the end of the file-->
    <div class="popupWindow">
        <div class="popupForm">
            <form role="form">
                <div class="form-group">
                    <label for="exampleInputEmail1">StoryMode</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" />
                </div>
            </form>
        </div>
    </div>
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
                    DATE: Sat Oct 18 13:55:40 EDT 2014
                    SOURCE: /Users/eis/Development/Java/StoryMode/app/views/main.scala.html
                    HASH: 646ee0ae97183db9f657bc6ef26a3a4b7dea0ab1
                    MATRIX: 778->1|902->31|1072->166|1098->171|1196->234|1210->240|1263->272|1335->309|1349->315|1428->373|1508->417|1523->423|1600->477|1666->515|1695->516|1913->707|1942->708|1992->730|2021->731|2348->1031|2377->1032|2427->1054|2456->1055|2727->1299|2756->1300|2804->1320|2833->1321|2890->1351|2919->1352|2985->1390|3014->1391|3071->1421|3100->1422|3143->1437|3172->1438|3234->1473|3263->1474|3358->1541|3387->1542|3472->1599|3501->1600|3603->1674|3632->1675|3716->1731|3745->1732|3862->1821|3891->1822|3935->1838|3964->1839|4193->2032|4220->2037|4322->2104|4351->2111
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|49->21|49->21|51->23|51->23|63->35|63->35|65->37|65->37|75->47|75->47|77->49|77->49|79->51|79->51|81->53|81->53|83->55|83->55|85->57|85->57|87->59|87->59|90->62|90->62|92->64|92->64|94->66|94->66|96->68|96->68|98->70|98->70|100->72|100->72|107->79|107->79|112->84|112->84
                    -- GENERATED --
                */
            