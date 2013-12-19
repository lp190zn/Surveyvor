
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
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Survey],play.api.templates.Html] {

    /**/
    def apply/*1.3*/(id: Long, surveyForm: Form[Survey]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*4.3*/title/*4.8*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*4.12*/("""
	<small>Edit a survey</small>
	""")))};
Seq[Any](format.raw/*1.39*/("""
	"""),format.raw/*3.1*/("""	"""),format.raw/*4.1*/("""	"""),format.raw/*6.3*/("""
	"""),_display_(Seq[Any](/*7.3*/mainAfter(title, nav = "Edit Survey")/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
	"""),_display_(Seq[Any](/*8.3*/helper/*8.9*/.form(action = routes.CreateSurvey.update(id))/*8.55*/ {_display_(Seq[Any](format.raw/*8.57*/("""
	<fieldset>
	"""),_display_(Seq[Any](/*10.3*/inputText(
	surveyForm("title"), 
	'_label -> "Title"
	))),format.raw/*13.3*/("""
	</fieldset>
	<fieldset>
	<legend>Write question and its answers</legend>
	
	"""),_display_(Seq[Any](/*18.3*/inputText(
	surveyForm("question1"), 
	'_label -> "1.Question" 
	))),format.raw/*21.3*/("""
	</fieldset> 
	
	<fieldset>
	
	"""),_display_(Seq[Any](/*26.3*/inputText(
	surveyForm("answerFirst1"), 
	'_label -> "answer1" 
	
	))),format.raw/*30.3*/("""
	"""),_display_(Seq[Any](/*31.3*/inputText(
	surveyForm("answerFirst2"), 
	'_label -> "answer2"
	
	))),format.raw/*35.3*/("""
	"""),_display_(Seq[Any](/*36.3*/inputText(
	surveyForm("answerFirst3"), 
	'_label -> "answer3"
	))),format.raw/*39.3*/("""
	"""),_display_(Seq[Any](/*40.3*/inputText(
	surveyForm("answerFirst4"), 
	'_label -> "answer4"
	))),format.raw/*43.3*/("""
	
	"""),_display_(Seq[Any](/*45.3*/inputText(
	surveyForm("rightAnswerFirst"), 
	'_label -> "rightAnswer"
	))),format.raw/*48.3*/("""
	</fieldset>
	
	<fieldset>
	<legend>Write question and its answers</legend>
	
	"""),_display_(Seq[Any](/*54.3*/inputText(
	surveyForm("question2"), 
	'_label -> "2.Question"
	))),format.raw/*57.3*/("""
	</fieldset> 
	
	<fieldset>
	
	"""),_display_(Seq[Any](/*62.3*/inputText(
	surveyForm("answerSec1"), 
	'_label -> "answer1"
	
	))),format.raw/*66.3*/("""
	"""),_display_(Seq[Any](/*67.3*/inputText(
	surveyForm("answerSec2"), 
	'_label -> "answer2" 
	
	))),format.raw/*71.3*/("""
	"""),_display_(Seq[Any](/*72.3*/inputText(
	surveyForm("answerSec3"), 
	'_label -> "answer3"
	))),format.raw/*75.3*/("""
	"""),_display_(Seq[Any](/*76.3*/inputText(
	surveyForm("answerSec4"), 
	'_label -> "answer4"
	))),format.raw/*79.3*/("""
	
	"""),_display_(Seq[Any](/*81.3*/inputText(
	surveyForm("rightAnswerSec"), 
	'_label -> "rightAnswer"
	))),format.raw/*84.3*/("""
	</fieldset>
	
	<fieldset>
	<legend>Write question and its answers</legend>
	
	"""),_display_(Seq[Any](/*90.3*/inputText(
	surveyForm("question3"), 
	'_label -> "3.Question"
	))),format.raw/*93.3*/("""
	</fieldset> 
	
	<fieldset>
	
	"""),_display_(Seq[Any](/*98.3*/inputText(
	surveyForm("answerThird1"), 
	'_label -> "answer1"
	
	))),format.raw/*102.3*/("""
	"""),_display_(Seq[Any](/*103.3*/inputText(
	surveyForm("answerThird2"), 
	'_label -> "answer2"
	
	))),format.raw/*107.3*/("""
	"""),_display_(Seq[Any](/*108.3*/inputText(
	surveyForm("answerThird3"), 
	'_label -> "answer3"
	))),format.raw/*111.3*/("""
	"""),_display_(Seq[Any](/*112.3*/inputText(
	surveyForm("answerThird4"), 
	'_label -> "answer4"
	))),format.raw/*115.3*/("""
	
	"""),_display_(Seq[Any](/*117.3*/inputText(
	surveyForm("rightAnswerThird"), 
	'_label -> "rightAnswer"
	))),format.raw/*120.3*/("""
	</fieldset>
	
	<fieldset>
	<legend>Write question and its answers</legend>
	
	"""),_display_(Seq[Any](/*126.3*/inputText(
	surveyForm("question4"), 
	'_label -> "4.Question"
	))),format.raw/*129.3*/("""
	</fieldset> 
	
	<fieldset>
	
	"""),_display_(Seq[Any](/*134.3*/inputText(
	surveyForm("answerFourth1"), 
	'_label -> "answer1"
	
	))),format.raw/*138.3*/("""
	"""),_display_(Seq[Any](/*139.3*/inputText(
	surveyForm("answerFourth2"), 
	'_label -> "answer2"
	
	
	))),format.raw/*144.3*/("""
	"""),_display_(Seq[Any](/*145.3*/inputText(
	surveyForm("answerFourth3"), 
	'_label -> "answer3"
	))),format.raw/*148.3*/("""
	"""),_display_(Seq[Any](/*149.3*/inputText(
	surveyForm("answerFourth4"), 
	'_label -> "answer4"
	))),format.raw/*152.3*/("""
	
	"""),_display_(Seq[Any](/*154.3*/inputText(
	surveyForm("rightAnswerFourth"), 
	'_label -> "rightAnswer"
	))),format.raw/*157.3*/("""
	</fieldset>
	
	<fieldset>
	<legend>Write question and its answers</legend>
	
	"""),_display_(Seq[Any](/*163.3*/inputText(
	surveyForm("question5"), 
	'_label -> "5.Question"
	))),format.raw/*166.3*/("""
	</fieldset> 
	
	<fieldset>
	
	"""),_display_(Seq[Any](/*171.3*/inputText(
	surveyForm("answerFifth1"), 
	'_label -> "answer1"
	
	))),format.raw/*175.3*/("""
	"""),_display_(Seq[Any](/*176.3*/inputText(
	surveyForm("answerFifth2"), 
	'_label -> "answer2"
	
	))),format.raw/*180.3*/("""
	"""),_display_(Seq[Any](/*181.3*/inputText(
	surveyForm("answerFifth3"), 
	'_label -> "answer3"
	))),format.raw/*184.3*/("""
	"""),_display_(Seq[Any](/*185.3*/inputText(
	surveyForm("answerFifth4"), 
	'_label -> "answer4"
	))),format.raw/*188.3*/("""
	
	"""),_display_(Seq[Any](/*190.3*/inputText(
	surveyForm("rightAnswerFifth"), 
	'_label -> "rightAnswer"
	))),format.raw/*193.3*/("""
	</fieldset>
	
	
	<div class="actions">
	<input type="submit" class="btn primary" value="Save">
	<a href=""""),_display_(Seq[Any](/*199.12*/routes/*199.18*/.CreateSurvey.newIndex)),format.raw/*199.40*/("""" class="btn">Cancel</a>
	"""),_display_(Seq[Any](/*200.3*/form(routes.CreateSurvey.delete(id), 'class -> "topRight")/*200.61*/ {_display_(Seq[Any](format.raw/*200.63*/("""
	<input type="submit" value="Delete this survey" class="btn danger">
	""")))})),format.raw/*202.3*/("""
	</div>
	""")))})),format.raw/*204.3*/("""
	
	""")))})))}
    }
    
    def render(id:Long,surveyForm:Form[Survey]) = apply(id,surveyForm)
    
    def f:((Long,Form[Survey]) => play.api.templates.Html) = (id,surveyForm) => apply(id,surveyForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 17 15:29:27 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/survey/editForm.scala.html
                    HASH: c7f2cc5f9752f9868b2637d62773d3e66621c3c0
                    MATRIX: 776->2|924->97|936->102|1003->106|1077->38|1106->59|1133->95|1160->141|1198->145|1243->182|1282->184|1320->188|1333->194|1387->240|1426->242|1478->259|1558->318|1677->402|1767->471|1840->509|1933->581|1972->585|2064->656|2103->660|2192->728|2231->732|2320->800|2362->807|2459->883|2581->970|2670->1038|2743->1076|2833->1145|2872->1149|2963->1219|3002->1223|3089->1289|3128->1293|3215->1359|3257->1366|3352->1440|3474->1527|3563->1595|3636->1633|3729->1704|3769->1708|3862->1779|3902->1783|3992->1851|4032->1855|4122->1923|4165->1930|4263->2006|4386->2093|4476->2161|4550->2199|4644->2271|4684->2275|4781->2350|4821->2354|4912->2423|4952->2427|5043->2496|5086->2503|5185->2580|5308->2667|5398->2735|5472->2773|5565->2844|5605->2848|5698->2919|5738->2923|5828->2991|5868->2995|5958->3063|6001->3070|6099->3146|6250->3260|6266->3266|6311->3288|6375->3316|6443->3374|6484->3376|6590->3450|6635->3463
                    LINES: 27->1|32->4|32->4|34->4|37->1|38->3|38->4|38->6|39->7|39->7|39->7|40->8|40->8|40->8|40->8|42->10|45->13|50->18|53->21|58->26|62->30|63->31|67->35|68->36|71->39|72->40|75->43|77->45|80->48|86->54|89->57|94->62|98->66|99->67|103->71|104->72|107->75|108->76|111->79|113->81|116->84|122->90|125->93|130->98|134->102|135->103|139->107|140->108|143->111|144->112|147->115|149->117|152->120|158->126|161->129|166->134|170->138|171->139|176->144|177->145|180->148|181->149|184->152|186->154|189->157|195->163|198->166|203->171|207->175|208->176|212->180|213->181|216->184|217->185|220->188|222->190|225->193|231->199|231->199|231->199|232->200|232->200|232->200|234->202|236->204
                    -- GENERATED --
                */
            