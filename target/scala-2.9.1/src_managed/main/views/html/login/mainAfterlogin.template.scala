
package views.html.login

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
object mainAfterlogin extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.Html] {

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
                        </li>
                        <li class=""""),_display_(Seq[Any](/*21.37*/("active".when(nav == "surveys")))),format.raw/*21.70*/("""">
                            <a href=""""),_display_(Seq[Any](/*22.39*/routes/*22.45*/.CreateSurvey.newIndex())),format.raw/*22.69*/("""">My Surveys</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*24.37*/("active".when(nav == "surveys1")))),format.raw/*24.71*/("""">
                            <a href=""""),_display_(Seq[Any](/*25.39*/routes/*25.45*/.CreateSurvey.blank())),format.raw/*25.66*/("""">Create Survey</a>
                        </li>

                        
                        
                        <li class=""""),_display_(Seq[Any](/*30.37*/("active".when(nav == "logout")))),format.raw/*30.69*/("""">
                           <a href=""""),_display_(Seq[Any](/*31.38*/routes/*31.44*/.LoginPage.blank())),format.raw/*31.62*/("""">Logout</a>
                        </li>

                    </ul>
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">
                
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*44.26*/title)),format.raw/*44.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*49.26*/content)),format.raw/*49.33*/("""
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
                    DATE: Mon Dec 17 23:37:45 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/login/mainAfterlogin.scala.html
                    HASH: 7f768d3f28cedb1ec50abc4dc4f350deb1bf0124
                    MATRIX: 780->1|903->47|1068->177|1082->183|1142->222|1233->278|1247->284|1302->318|1399->379|1414->385|1468->417|1529->442|1544->448|1611->493|1858->704|1873->710|1915->730|2070->849|2125->882|2202->923|2217->929|2263->953|2382->1036|2438->1070|2515->1111|2530->1117|2573->1138|2746->1275|2800->1307|2876->1347|2891->1353|2931->1371|3246->1650|3273->1655|3439->1785|3468->1792
                    LINES: 27->1|30->1|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|47->18|47->18|47->18|50->21|50->21|51->22|51->22|51->22|53->24|53->24|54->25|54->25|54->25|59->30|59->30|60->31|60->31|60->31|73->44|73->44|78->49|78->49
                    -- GENERATED --
                */
            