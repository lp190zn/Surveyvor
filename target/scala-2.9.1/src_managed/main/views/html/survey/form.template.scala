
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
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Survey],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(newForm: Form[Survey]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*5.2*/title/*5.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.11*/("""
    <small>Create a new survey</small>
""")))};
Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""
"""),_display_(Seq[Any](/*8.2*/mainAfter(title, nav = "New Survey")/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""

	"""),_display_(Seq[Any](/*10.3*/helper/*10.9*/.form(action = routes.CreateSurvey.preview)/*10.52*/ {_display_(Seq[Any](format.raw/*10.54*/("""
		<fieldset>
		"""),_display_(Seq[Any](/*12.4*/inputText(
                newForm("title"), 
                '_label -> "Title"
            ))),format.raw/*15.14*/("""
		</fieldset>
		

		<fieldset>
            <legend>Write question and its answers</legend>
            
            """),_display_(Seq[Any](/*22.14*/inputText(
                newForm("question1"), 
                '_label -> "1.Question", 
                '_help -> "Your question is empty.",
                '_error -> newForm.globalError
            ))),format.raw/*27.14*/("""
        </fieldset>    
            
		<fieldset>

            
            """),_display_(Seq[Any](/*33.14*/inputText(
                newForm("answerFirst1"), 
                '_label -> "answer1", 
                '_help -> "Your answer is empty.Two answers are necessary."
               
            ))),format.raw/*38.14*/("""
            """),_display_(Seq[Any](/*39.14*/inputText(
                newForm("answerFirst2"), 
                '_label -> "answer2", 
                '_help -> "Your answer is empty.Two answers are necessary."
               
            ))),format.raw/*44.14*/("""
            """),_display_(Seq[Any](/*45.14*/inputText(
                newForm("answerFirst3"), 
                '_label -> "answer3"
			))),format.raw/*48.5*/("""
			 """),_display_(Seq[Any](/*49.6*/inputText(
                newForm("answerFirst4"), 
                '_label -> "answer4"
			))),format.raw/*52.5*/("""
			
			"""),_display_(Seq[Any](/*54.5*/inputText(
                newForm("rightAnswerFirst"), 
                '_label -> "rightAnswer",
                '_help -> "Right Answer."
			))),format.raw/*58.5*/("""
        </fieldset>
        
       <fieldset>
            <legend>Write question and its answers</legend>
            
            """),_display_(Seq[Any](/*64.14*/inputText(
                newForm("question2"), 
                '_label -> "2.Question", 
                '_help -> "Your question is empty.",
                '_error -> newForm.globalError
            ))),format.raw/*69.14*/("""
        </fieldset>    
            
		<fieldset>

            
            """),_display_(Seq[Any](/*75.14*/inputText(
                newForm("answerSec1"), 
                '_label -> "answer1", 
                '_help -> "Your answer is empty.Two answers are necessary."
               
            ))),format.raw/*80.14*/("""
            """),_display_(Seq[Any](/*81.14*/inputText(
                newForm("answerSec2"), 
                '_label -> "answer2", 
                '_help -> "Your answer is empty.Two answers are necessary."
               
            ))),format.raw/*86.14*/("""
            """),_display_(Seq[Any](/*87.14*/inputText(
                newForm("answerSec3"), 
                '_label -> "answer3"
			))),format.raw/*90.5*/("""
			 """),_display_(Seq[Any](/*91.6*/inputText(
                newForm("answerSec4"), 
                '_label -> "answer4"
			))),format.raw/*94.5*/("""
			
			"""),_display_(Seq[Any](/*96.5*/inputText(
                newForm("rightAnswerSec"), 
                '_label -> "rightAnswer",
                '_help -> "Right Answer."
			))),format.raw/*100.5*/("""
        </fieldset>
        
         <fieldset>
            <legend>Write question and its answers</legend>
            
            """),_display_(Seq[Any](/*106.14*/inputText(
                newForm("question3"), 
                '_label -> "3.Question", 
                '_help -> "Your question is empty.",
                '_error -> newForm.globalError
            ))),format.raw/*111.14*/("""
        </fieldset>    
            
		<fieldset>

            
            """),_display_(Seq[Any](/*117.14*/inputText(
                newForm("answerThird1"), 
                '_label -> "answer1", 
                '_help -> "Your answer is empty.Two answers are necessary."
               
            ))),format.raw/*122.14*/("""
            """),_display_(Seq[Any](/*123.14*/inputText(
                newForm("answerThird2"), 
                '_label -> "answer2", 
                '_help -> "Your answer is empty.Two answers are necessary."
               
            ))),format.raw/*128.14*/("""
            """),_display_(Seq[Any](/*129.14*/inputText(
                newForm("answerThird3"), 
                '_label -> "answer3"
			))),format.raw/*132.5*/("""
			 """),_display_(Seq[Any](/*133.6*/inputText(
                newForm("answerThird4"), 
                '_label -> "answer4"
			))),format.raw/*136.5*/("""
			
			"""),_display_(Seq[Any](/*138.5*/inputText(
                newForm("rightAnswerThird"), 
                '_label -> "rightAnswer",
                '_help -> "Right Answer."
			))),format.raw/*142.5*/("""
        </fieldset>
        
         <fieldset>
            <legend>Write question and its answers</legend>
            
            """),_display_(Seq[Any](/*148.14*/inputText(
                newForm("question4"), 
                '_label -> "4.Question", 
                '_help -> "Your question is empty.",
                '_error -> newForm.globalError
            ))),format.raw/*153.14*/("""
        </fieldset>    
            
		<fieldset>

            
            """),_display_(Seq[Any](/*159.14*/inputText(
                newForm("answerFourth1"), 
                '_label -> "answer1", 
                '_help -> "Your answer is empty.Two answers are necessary."
               
            ))),format.raw/*164.14*/("""
            """),_display_(Seq[Any](/*165.14*/inputText(
                newForm("answerFourth2"), 
                '_label -> "answer2", 
                '_help -> "Your answer is empty.Two answers are necessary."
               
            ))),format.raw/*170.14*/("""
            """),_display_(Seq[Any](/*171.14*/inputText(
                newForm("answerFourth3"), 
                '_label -> "answer3"
			))),format.raw/*174.5*/("""
			 """),_display_(Seq[Any](/*175.6*/inputText(
                newForm("answerFourth4"), 
                '_label -> "answer4"
			))),format.raw/*178.5*/("""
			
			"""),_display_(Seq[Any](/*180.5*/inputText(
                newForm("rightAnswerFourth"), 
                '_label -> "rightAnswer",
                '_help -> "Right Answer."
			))),format.raw/*184.5*/("""
        </fieldset>
        
         <fieldset>
            <legend>Write question and its answers</legend>
            
            """),_display_(Seq[Any](/*190.14*/inputText(
                newForm("question5"), 
                '_label -> "5.Question", 
                '_help -> "Your question is empty.",
                '_error -> newForm.globalError
            ))),format.raw/*195.14*/("""
        </fieldset>    
            
		<fieldset>

            
            """),_display_(Seq[Any](/*201.14*/inputText(
                newForm("answerFifth1"), 
                '_label -> "answer1", 
                '_help -> "Your answer is empty.Two answers are necessary."
               
            ))),format.raw/*206.14*/("""
            """),_display_(Seq[Any](/*207.14*/inputText(
                newForm("answerFifth2"), 
                '_label -> "answer2", 
                '_help -> "Your answer is empty.Two answers are necessary."
               
            ))),format.raw/*212.14*/("""
            """),_display_(Seq[Any](/*213.14*/inputText(
                newForm("answerFifth3"), 
                '_label -> "answer3"
			))),format.raw/*216.5*/("""
			 """),_display_(Seq[Any](/*217.6*/inputText(
                newForm("answerFifth4"), 
                '_label -> "answer4"
			))),format.raw/*220.5*/("""
			
			"""),_display_(Seq[Any](/*222.5*/inputText(
                newForm("rightAnswerFifth"), 
                '_label -> "rightAnswer",
                '_help -> "Right Answer."
			))),format.raw/*226.5*/("""
        </fieldset>
        
        
		<div class="actions">
            <input type="submit" class="btn primary" value="Save">
            <a href=""""),_display_(Seq[Any](/*232.23*/routes/*232.29*/.Application.index)),format.raw/*232.47*/("""" class="btn">Cancel</a>
        </div>
        
       
	
	
	
	
	
	""")))})),format.raw/*241.3*/("""

""")))})))}
    }
    
    def render(newForm:Form[Survey]) = apply(newForm)
    
    def f:((Form[Survey]) => play.api.templates.Html) = (newForm) => apply(newForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 15 21:07:09 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/survey/form.scala.html
                    HASH: 4b568d1b19362519a35ecd5aadfcdc5b1e24c124
                    MATRIX: 767->1|902->82|914->87|981->91|1063->24|1091->79|1119->134|1156->137|1200->173|1239->175|1280->181|1294->187|1346->230|1386->232|1440->251|1559->348|1720->473|1952->683|2072->767|2296->969|2347->984|2571->1186|2622->1201|2740->1298|2782->1305|2900->1402|2946->1413|3116->1562|3292->1702|3524->1912|3644->1996|3866->2196|3917->2211|4139->2411|4190->2426|4306->2521|4348->2528|4464->2623|4510->2634|4679->2781|4858->2923|5091->3133|5212->3217|5437->3419|5489->3434|5714->3636|5766->3651|5885->3748|5928->3755|6047->3852|6094->3863|6265->4012|6444->4154|6677->4364|6798->4448|7024->4651|7076->4666|7302->4869|7354->4884|7474->4982|7517->4989|7637->5087|7684->5098|7856->5248|8035->5390|8268->5600|8389->5684|8614->5886|8666->5901|8891->6103|8943->6118|9062->6215|9105->6222|9224->6319|9271->6330|9442->6479|9637->6637|9653->6643|9694->6661|9804->6739
                    LINES: 27->1|32->5|32->5|34->5|37->1|38->4|39->7|40->8|40->8|40->8|42->10|42->10|42->10|42->10|44->12|47->15|54->22|59->27|65->33|70->38|71->39|76->44|77->45|80->48|81->49|84->52|86->54|90->58|96->64|101->69|107->75|112->80|113->81|118->86|119->87|122->90|123->91|126->94|128->96|132->100|138->106|143->111|149->117|154->122|155->123|160->128|161->129|164->132|165->133|168->136|170->138|174->142|180->148|185->153|191->159|196->164|197->165|202->170|203->171|206->174|207->175|210->178|212->180|216->184|222->190|227->195|233->201|238->206|239->207|244->212|245->213|248->216|249->217|252->220|254->222|258->226|264->232|264->232|264->232|273->241
                    -- GENERATED --
                */
            