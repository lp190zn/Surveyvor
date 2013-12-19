
package views.html.survey

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
object mainAfter extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Surveyvor main page</title>
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
                        </li>
                        <li class=""""),_display_(Seq[Any](/*21.37*/("active".when(nav == "surveys")))),format.raw/*21.70*/("""">
                            <a href=""""),_display_(Seq[Any](/*22.39*/routes/*22.45*/.CreateSurvey.newIndex())),format.raw/*22.69*/("""">My Surveys</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*24.37*/("active".when(nav == "surveys1")))),format.raw/*24.71*/("""">
                            <a href=""""),_display_(Seq[Any](/*25.39*/routes/*25.45*/.CreateSurvey.blank())),format.raw/*25.66*/("""">Create Survey</a>
                        </li>
                        
                        
                        <li class=""""),_display_(Seq[Any](/*29.37*/("active".when(nav == "logout")))),format.raw/*29.69*/("""">
                           <a href=""""),_display_(Seq[Any](/*30.38*/routes/*30.44*/.LoginPage.blank())),format.raw/*30.62*/("""">Logout</a>
                        </li>

                    </ul>
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">
                
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*43.26*/title)),format.raw/*43.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*48.26*/content)),format.raw/*48.33*/("""
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
                    DATE: Mon Dec 17 23:34:28 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/survey/mainAfter.scala.html
                    HASH: faf725eb3b540e0554b34d41a86d6bc03064cf0f
                    MATRIX: 776->1|899->47|1074->187|1088->193|1148->232|1240->289|1254->295|1309->329|1407->391|1422->397|1476->429|1538->455|1553->461|1620->506|1874->724|1889->730|1931->750|2089->872|2144->905|2222->947|2237->953|2283->977|2404->1062|2460->1096|2538->1138|2553->1144|2596->1165|2772->1305|2826->1337|2903->1378|2918->1384|2958->1402|3286->1694|3313->1699|3484->1834|3513->1841
                    LINES: 27->1|30->1|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|47->18|47->18|47->18|50->21|50->21|51->22|51->22|51->22|53->24|53->24|54->25|54->25|54->25|58->29|58->29|59->30|59->30|59->30|72->43|72->43|77->48|77->48
                    -- GENERATED --
                */
            