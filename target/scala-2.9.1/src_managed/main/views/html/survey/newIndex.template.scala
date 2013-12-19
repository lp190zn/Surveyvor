
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
object newIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Survey],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(surveys: List[Survey]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/mainAfter(Html("Work with your Surveys!"))/*5.44*/ {_display_(Seq[Any](format.raw/*5.46*/("""
    
    <h2>Create a survey</h2>
    
    <p>
        Create a new survey easy!
    </p>
    
    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*14.31*/routes/*14.37*/.CreateSurvey.blank)),format.raw/*14.56*/("""">Create a survey »</a>
    </p>
    
    <h1>"""),_display_(Seq[Any](/*17.10*/surveys/*17.17*/.size())),format.raw/*17.24*/(""" surveys</h1>
    
    
        """),_display_(Seq[Any](/*20.10*/for(survey <- surveys) yield /*20.32*/ {_display_(Seq[Any](format.raw/*20.34*/("""
		<a class="btn primary" href="/surveys/"""),_display_(Seq[Any](/*21.42*/survey/*21.48*/.title)),format.raw/*21.54*/(""""><b>"""),_display_(Seq[Any](/*21.60*/survey/*21.66*/.title)),format.raw/*21.72*/(""" »</b></a>
		<b> >> Link:</b> http://localhost:9000/surveys/"""),_display_(Seq[Any](/*22.51*/survey/*22.57*/.title)),format.raw/*22.63*/("""

		</br>
		</br>

		"""),_display_(Seq[Any](/*27.4*/form(routes.CreateSurvey.delete(survey.id), 'class -> "topLeft")/*27.68*/ {_display_(Seq[Any](format.raw/*27.70*/("""
		<input type="submit" value="Delete this survey" class="btn danger">
		""")))})),format.raw/*29.4*/("""

		
		"""),_display_(Seq[Any](/*32.4*/form(routes.CreateSurvey.edit(survey.id), 'class -> "topLeft")/*32.66*/ {_display_(Seq[Any](format.raw/*32.68*/("""
		<input type="submit" value="Edit this survey" class="btn">
		""")))})),format.raw/*34.4*/("""
		
		</br>
		</br>
                       
        """)))})),format.raw/*39.10*/("""

""")))})))}
    }
    
    def render(surveys:List[Survey]) = apply(surveys)
    
    def f:((List[Survey]) => play.api.templates.Html) = (surveys) => apply(surveys)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 17 20:14:33 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/survey/newIndex.scala.html
                    HASH: e79be647eff21ea4533b1d6ed227c8dab301d1e3
                    MATRIX: 771->1|888->24|918->46|955->49|1005->91|1044->93|1223->236|1238->242|1279->261|1365->311|1381->318|1410->325|1482->361|1520->383|1560->385|1639->428|1654->434|1682->440|1724->446|1739->452|1767->458|1865->520|1880->526|1908->532|1970->559|2043->623|2083->625|2190->701|2236->712|2307->774|2347->776|2445->843|2535->901
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|43->14|43->14|43->14|46->17|46->17|46->17|49->20|49->20|49->20|50->21|50->21|50->21|50->21|50->21|50->21|51->22|51->22|51->22|56->27|56->27|56->27|58->29|61->32|61->32|61->32|63->34|68->39
                    -- GENERATED --
                */
            