
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Doodle main page</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        
        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*18.45*/routes/*18.51*/.Application.index())),format.raw/*18.71*/("""">Surveyvor</a>
                    <ul class="nav">
                        <li class=""""),_display_(Seq[Any](/*20.37*/("active".when(nav == "signup")))),format.raw/*20.69*/("""">
                            <a href=""""),_display_(Seq[Any](/*21.39*/routes/*21.45*/.Register.blank())),format.raw/*21.62*/("""">Register</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*23.37*/("active".when(nav == "contact")))),format.raw/*23.70*/("""">
                            <a href=""""),_display_(Seq[Any](/*24.39*/routes/*24.45*/.LoginPage.blank())),format.raw/*24.63*/("""">Login</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">
                
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*36.26*/title)),format.raw/*36.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*41.26*/content)),format.raw/*41.33*/("""
                    </div>
                </div>
                
            </div>

            <footer>

            </footer>

        </div>
        
    </body>
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html) = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.Html) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 17 23:35:30 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/main.scala.html
                    HASH: df78dd18c640fc77d21536d066593e898d3d9b4f
                    MATRIX: 764->1|887->47|1052->177|1066->183|1126->222|1217->278|1231->284|1286->318|1383->379|1398->385|1452->417|1513->442|1528->448|1595->493|1842->704|1857->710|1899->730|2024->819|2078->851|2155->892|2170->898|2209->915|2326->996|2381->1029|2458->1070|2473->1076|2513->1094|2826->1371|2853->1376|3019->1506|3048->1513
                    LINES: 27->1|30->1|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|47->18|47->18|47->18|49->20|49->20|50->21|50->21|50->21|52->23|52->23|53->24|53->24|53->24|65->36|65->36|70->41|70->41
                    -- GENERATED --
                */
            