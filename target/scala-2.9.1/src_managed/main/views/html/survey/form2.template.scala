
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
object form2 extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Survey,Form[Survey],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(survey: Survey, form1: Form[Survey]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/mainAfter(Html("Fill Survey"), nav = "creating")/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""
    
   
    """),_display_(Seq[Any](/*9.6*/helper/*9.12*/.form(action = routes.FillSurvey.checkSurvey)/*9.57*/ {_display_(Seq[Any](format.raw/*9.59*/("""
    

   		<h2>"""),_display_(Seq[Any](/*12.11*/survey/*12.17*/.title)),format.raw/*12.23*/("""</h2>


    		<h6>1. Question</h6>
   		
   		
 			<p>
        	<b>"""),_display_(Seq[Any](/*19.14*/survey/*19.20*/.question1)),format.raw/*19.30*/("""</b>
    		</p>
 				
 		
 			<form class="form-inline">
  			

			
			<label class="radio">
  					<input type="radio" name="question1" id="question1" value="""),_display_(Seq[Any](/*28.67*/survey/*28.73*/.answerFirst1)),format.raw/*28.86*/(""" checked>
  					"""),_display_(Seq[Any](/*29.9*/survey/*29.15*/.answerFirst1)),format.raw/*29.28*/("""
			</label>
			
			</br>
   			</br>

 			
			<label class="radio">
  					<input type="radio" name="question1" id="question1" value="""),_display_(Seq[Any](/*37.67*/survey/*37.73*/.answerFirst2)),format.raw/*37.86*/(""">
  					"""),_display_(Seq[Any](/*38.9*/survey/*38.15*/.answerFirst2)),format.raw/*38.28*/("""
			</label>
			
			</br>
   			</br>
			
			"""),_display_(Seq[Any](/*44.5*/if(survey.answerFirst3 == null || survey.answerFirst3 == "")/*44.65*/ {_display_(Seq[Any](format.raw/*44.67*/("""
            
        	""")))}/*46.12*/else/*46.17*/{_display_(Seq[Any](format.raw/*46.18*/("""
            
            <label class="radio">
  					<input type="radio" name="question1" id="question1" value="""),_display_(Seq[Any](/*49.67*/survey/*49.73*/.answerFirst3)),format.raw/*49.86*/(""">
  					"""),_display_(Seq[Any](/*50.9*/survey/*50.15*/.answerFirst3)),format.raw/*50.28*/("""
			</label>
            
            
            </br>
   			</br>
                        
        	""")))})),format.raw/*57.11*/("""

			
     		"""),_display_(Seq[Any](/*60.9*/if(survey.answerFirst4 == null || survey.answerFirst4 == "")/*60.69*/ {_display_(Seq[Any](format.raw/*60.71*/("""

        	""")))}/*62.12*/else/*62.17*/{_display_(Seq[Any](format.raw/*62.18*/("""
            
            <label class="radio">
  					<input type="radio" name="question1" id="question1" value="""),_display_(Seq[Any](/*65.67*/survey/*65.73*/.answerFirst4)),format.raw/*65.86*/(""">
  					"""),_display_(Seq[Any](/*66.9*/survey/*66.15*/.answerFirst4)),format.raw/*66.28*/("""
			</label>
            
            </br>
   			</br>
            
        	""")))})),format.raw/*72.11*/("""
			
   			

			<h6>2. Question</h6>
   		
   		
 			<p>
        	<b>"""),_display_(Seq[Any](/*80.14*/survey/*80.20*/.question2)),format.raw/*80.30*/("""</b>
    		</p>
 				
 		
 			<form class="form-inline">
  			

			
			<label class="radio">
  					<input type="radio" name="question2" id="question2" value="""),_display_(Seq[Any](/*89.67*/survey/*89.73*/.answerSec1)),format.raw/*89.84*/(""" checked>
  					"""),_display_(Seq[Any](/*90.9*/survey/*90.15*/.answerSec1)),format.raw/*90.26*/("""
			</label>
			
			</br>
   			</br>

 			
			<label class="radio">
  					<input type="radio" name="question2" id="question2" value="""),_display_(Seq[Any](/*98.67*/survey/*98.73*/.answerSec2)),format.raw/*98.84*/(""">
  					"""),_display_(Seq[Any](/*99.9*/survey/*99.15*/.answerSec2)),format.raw/*99.26*/("""
			</label>
			
			</br>
   			</br>
			
			"""),_display_(Seq[Any](/*105.5*/if(survey.answerSec3 == null || survey.answerSec3 == "")/*105.61*/ {_display_(Seq[Any](format.raw/*105.63*/("""
            
        	""")))}/*107.12*/else/*107.17*/{_display_(Seq[Any](format.raw/*107.18*/("""
            
            <label class="radio">
  					<input type="radio" name="question2" id="question2" value="""),_display_(Seq[Any](/*110.67*/survey/*110.73*/.answerSec3)),format.raw/*110.84*/(""">
  					"""),_display_(Seq[Any](/*111.9*/survey/*111.15*/.answerSec3)),format.raw/*111.26*/("""
			</label>
			
			</br>
   			</br>
            
        	""")))})),format.raw/*117.11*/("""

     		"""),_display_(Seq[Any](/*119.9*/if(survey.answerSec4 == null || survey.answerSec4 == "")/*119.65*/ {_display_(Seq[Any](format.raw/*119.67*/("""

        	""")))}/*121.12*/else/*121.17*/{_display_(Seq[Any](format.raw/*121.18*/("""
            
            <label class="radio">
  					<input type="radio" name="question2" id="question2" value="""),_display_(Seq[Any](/*124.67*/survey/*124.73*/.answerSec4)),format.raw/*124.84*/(""">
  					"""),_display_(Seq[Any](/*125.9*/survey/*125.15*/.answerSec4)),format.raw/*125.26*/("""
			</label>
            
            </br>
   			</br>
            
        	""")))})),format.raw/*131.11*/("""
 			   			
   			
   			<h6>3. Question</h6>
   		
   		
 			<p>
        	<b>"""),_display_(Seq[Any](/*138.14*/survey/*138.20*/.question3)),format.raw/*138.30*/("""</b>
    		</p>
 				
 		
 			<form class="form-inline">
  			

			
			<label class="radio">
  					<input type="radio" name="question3" id="question3" value="""),_display_(Seq[Any](/*147.67*/survey/*147.73*/.answerThird1)),format.raw/*147.86*/(""" checked>
  					"""),_display_(Seq[Any](/*148.9*/survey/*148.15*/.answerThird1)),format.raw/*148.28*/("""
			</label>
			
			</br>
   			</br>

 			
			<label class="radio">
  					<input type="radio" name="question3" id="question3" value="""),_display_(Seq[Any](/*156.67*/survey/*156.73*/.answerThird2)),format.raw/*156.86*/(""">
  					"""),_display_(Seq[Any](/*157.9*/survey/*157.15*/.answerThird2)),format.raw/*157.28*/("""
			</label>
			
			</br>
   			</br>
			
			"""),_display_(Seq[Any](/*163.5*/if(survey.answerThird3 == null || survey.answerThird3 == "")/*163.65*/ {_display_(Seq[Any](format.raw/*163.67*/("""
            
        	""")))}/*165.12*/else/*165.17*/{_display_(Seq[Any](format.raw/*165.18*/("""
            
            <label class="radio">
  					<input type="radio" name="question3" id="question3" value="""),_display_(Seq[Any](/*168.67*/survey/*168.73*/.answerThird3)),format.raw/*168.86*/(""">
  					"""),_display_(Seq[Any](/*169.9*/survey/*169.15*/.answerThird3)),format.raw/*169.28*/("""
			</label>
            
            </br>
   			</br>
            
        	""")))})),format.raw/*175.11*/("""


     		"""),_display_(Seq[Any](/*178.9*/if(survey.answerThird4 == null || survey.answerThird4 == "")/*178.69*/ {_display_(Seq[Any](format.raw/*178.71*/("""

        	""")))}/*180.12*/else/*180.17*/{_display_(Seq[Any](format.raw/*180.18*/("""
            
            <label class="radio">
  					<input type="radio" name="question4" id="question4" value="""),_display_(Seq[Any](/*183.67*/survey/*183.73*/.answerThird4)),format.raw/*183.86*/(""">
  					"""),_display_(Seq[Any](/*184.9*/survey/*184.15*/.answerThird4)),format.raw/*184.28*/("""
			</label>
            
            </br>
   			</br>
            
        	""")))})),format.raw/*190.11*/("""
        	
        	<h6>4. Question</h6>
   		
   		
 			<p>
        	<b>"""),_display_(Seq[Any](/*196.14*/survey/*196.20*/.question4)),format.raw/*196.30*/("""</b>
    		</p>
 				
 		
 			<form class="form-inline">
  			

			
			<label class="radio">
  					<input type="radio" name="question4" id="question4" value="""),_display_(Seq[Any](/*205.67*/survey/*205.73*/.answerFourth1)),format.raw/*205.87*/(""" checked>
  					"""),_display_(Seq[Any](/*206.9*/survey/*206.15*/.answerFourth1)),format.raw/*206.29*/("""
			</label>
			
			</br>
   			</br>

 			
			<label class="radio">
  					<input type="radio" name="question4" id="question4" value="""),_display_(Seq[Any](/*214.67*/survey/*214.73*/.answerFourth2)),format.raw/*214.87*/(""">
  					"""),_display_(Seq[Any](/*215.9*/survey/*215.15*/.answerFourth2)),format.raw/*215.29*/("""
			</label>
			
			</br>
   			</br>
			
			"""),_display_(Seq[Any](/*221.5*/if(survey.answerFourth3 == null || survey.answerFourth3 == "")/*221.67*/ {_display_(Seq[Any](format.raw/*221.69*/("""
            
        	""")))}/*223.12*/else/*223.17*/{_display_(Seq[Any](format.raw/*223.18*/("""
            
            <label class="radio">
  					<input type="radio" name="question4" id="question4" value="""),_display_(Seq[Any](/*226.67*/survey/*226.73*/.answerFourth3)),format.raw/*226.87*/(""">
  					"""),_display_(Seq[Any](/*227.9*/survey/*227.15*/.answerFourth3)),format.raw/*227.29*/("""
			</label>
            
            </br>
   			</br>
            
        	""")))})),format.raw/*233.11*/("""


     		"""),_display_(Seq[Any](/*236.9*/if(survey.answerFourth4 == null || survey.answerFourth4 == "")/*236.71*/ {_display_(Seq[Any](format.raw/*236.73*/("""

        	""")))}/*238.12*/else/*238.17*/{_display_(Seq[Any](format.raw/*238.18*/("""
            
            <label class="radio">
  					<input type="radio" name="question4" id="question4" value="""),_display_(Seq[Any](/*241.67*/survey/*241.73*/.answerFourth4)),format.raw/*241.87*/(""">
  					"""),_display_(Seq[Any](/*242.9*/survey/*242.15*/.answerFourth4)),format.raw/*242.29*/("""
			</label>
            
            </br>
   			</br>
            
        	""")))})),format.raw/*248.11*/("""
        	
        	<h6>5. Question</h6>
   		
   		
 			<p>
        	<b>"""),_display_(Seq[Any](/*254.14*/survey/*254.20*/.question4)),format.raw/*254.30*/("""</b>
    		</p>
 				
 		
 			<form class="form-inline">
  			

			
			<label class="radio">
  					<input type="radio" name="question5" id="question5" value="""),_display_(Seq[Any](/*263.67*/survey/*263.73*/.answerFifth1)),format.raw/*263.86*/(""" checked>
  					"""),_display_(Seq[Any](/*264.9*/survey/*264.15*/.answerFifth1)),format.raw/*264.28*/("""
			</label>
			
			</br>
   			</br>

 			
			<label class="radio">
  					<input type="radio" name="question5" id="question5" value="""),_display_(Seq[Any](/*272.67*/survey/*272.73*/.answerFifth2)),format.raw/*272.86*/(""">
  					"""),_display_(Seq[Any](/*273.9*/survey/*273.15*/.answerFifth2)),format.raw/*273.28*/("""
			</label>
			
			</br>
   			</br>
			
			"""),_display_(Seq[Any](/*279.5*/if(survey.answerFifth3 == null || survey.answerFifth3 == "")/*279.65*/ {_display_(Seq[Any](format.raw/*279.67*/("""
            
        	""")))}/*281.12*/else/*281.17*/{_display_(Seq[Any](format.raw/*281.18*/("""
            
            <label class="radio">
  					<input type="radio" name="question5" id="question5" value="""),_display_(Seq[Any](/*284.67*/survey/*284.73*/.answerFifth3)),format.raw/*284.86*/(""">
  					"""),_display_(Seq[Any](/*285.9*/survey/*285.15*/.answerFifth3)),format.raw/*285.28*/("""
			</label>
            
            </br>
   			</br>
            
        	""")))})),format.raw/*291.11*/("""


     		"""),_display_(Seq[Any](/*294.9*/if(survey.answerFifth4 == null || survey.answerFifth4 == "")/*294.69*/ {_display_(Seq[Any](format.raw/*294.71*/("""

        	""")))}/*296.12*/else/*296.17*/{_display_(Seq[Any](format.raw/*296.18*/("""
            
            <label class="radio">
  					<input type="radio" name="question5" id="question5" value="""),_display_(Seq[Any](/*299.67*/survey/*299.73*/.answerFifth4)),format.raw/*299.86*/(""">
  					"""),_display_(Seq[Any](/*300.9*/survey/*300.15*/.answerFifth4)),format.raw/*300.28*/("""
			</label>
            
            </br>
   			</br>
            
        	""")))})),format.raw/*306.11*/("""
		
			

      <div class="actions">
            <input type="submit" class="btn primary" value="Send">
            <a href=""""),_display_(Seq[Any](/*312.23*/routes/*312.29*/.Application.index)),format.raw/*312.47*/("""" class="btn">Cancel</a>
        </div>
        

		</form>
     """)))})),format.raw/*317.7*/("""
    
""")))})))}
    }
    
    def render(survey:Survey,form1:Form[Survey]) = apply(survey,form1)
    
    def f:((Survey,Form[Survey]) => play.api.templates.Html) = (survey,form1) => apply(survey,form1)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 17 23:24:34 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/survey/form2.scala.html
                    HASH: 8510cb7e913dc024c6361a08f9c68874ec2be356
                    MATRIX: 775->1|941->38|971->95|1008->98|1064->146|1103->148|1155->166|1169->172|1222->217|1261->219|1317->239|1332->245|1360->251|1471->326|1486->332|1518->342|1722->510|1737->516|1772->529|1826->548|1841->554|1876->567|2055->710|2070->716|2105->729|2151->740|2166->746|2201->759|2288->811|2357->871|2397->873|2442->900|2455->905|2494->906|2647->1023|2662->1029|2697->1042|2743->1053|2758->1059|2793->1072|2936->1183|2988->1200|3057->1260|3097->1262|3130->1277|3143->1282|3182->1283|3335->1400|3350->1406|3385->1419|3431->1430|3446->1436|3481->1449|3598->1534|3712->1612|3727->1618|3759->1628|3963->1796|3978->1802|4011->1813|4065->1832|4080->1838|4113->1849|4292->1992|4307->1998|4340->2009|4386->2020|4401->2026|4434->2037|4522->2089|4588->2145|4629->2147|4675->2174|4689->2179|4729->2180|4883->2297|4899->2303|4933->2314|4980->2325|4996->2331|5030->2342|5130->2409|5178->2421|5244->2477|5285->2479|5319->2494|5333->2499|5373->2500|5527->2617|5543->2623|5577->2634|5624->2645|5640->2651|5674->2662|5792->2747|5915->2833|5931->2839|5964->2849|6169->3017|6185->3023|6221->3036|6276->3055|6292->3061|6328->3074|6508->3217|6524->3223|6560->3236|6607->3247|6623->3253|6659->3266|6747->3318|6817->3378|6858->3380|6904->3407|6918->3412|6958->3413|7112->3530|7128->3536|7164->3549|7211->3560|7227->3566|7263->3579|7381->3664|7431->3678|7501->3738|7542->3740|7576->3755|7590->3760|7630->3761|7784->3878|7800->3884|7836->3897|7883->3908|7899->3914|7935->3927|8053->4012|8170->4092|8186->4098|8219->4108|8424->4276|8440->4282|8477->4296|8532->4315|8548->4321|8585->4335|8765->4478|8781->4484|8818->4498|8865->4509|8881->4515|8918->4529|9006->4581|9078->4643|9119->4645|9165->4672|9179->4677|9219->4678|9373->4795|9389->4801|9426->4815|9473->4826|9489->4832|9526->4846|9644->4931|9694->4945|9766->5007|9807->5009|9841->5024|9855->5029|9895->5030|10049->5147|10065->5153|10102->5167|10149->5178|10165->5184|10202->5198|10320->5283|10437->5363|10453->5369|10486->5379|10691->5547|10707->5553|10743->5566|10798->5585|10814->5591|10850->5604|11030->5747|11046->5753|11082->5766|11129->5777|11145->5783|11181->5796|11269->5848|11339->5908|11380->5910|11426->5937|11440->5942|11480->5943|11634->6060|11650->6066|11686->6079|11733->6090|11749->6096|11785->6109|11903->6194|11953->6208|12023->6268|12064->6270|12098->6285|12112->6290|12152->6291|12306->6408|12322->6414|12358->6427|12405->6438|12421->6444|12457->6457|12575->6542|12744->6674|12760->6680|12801->6698|12904->6769
                    LINES: 27->1|33->1|35->5|36->6|36->6|36->6|39->9|39->9|39->9|39->9|42->12|42->12|42->12|49->19|49->19|49->19|58->28|58->28|58->28|59->29|59->29|59->29|67->37|67->37|67->37|68->38|68->38|68->38|74->44|74->44|74->44|76->46|76->46|76->46|79->49|79->49|79->49|80->50|80->50|80->50|87->57|90->60|90->60|90->60|92->62|92->62|92->62|95->65|95->65|95->65|96->66|96->66|96->66|102->72|110->80|110->80|110->80|119->89|119->89|119->89|120->90|120->90|120->90|128->98|128->98|128->98|129->99|129->99|129->99|135->105|135->105|135->105|137->107|137->107|137->107|140->110|140->110|140->110|141->111|141->111|141->111|147->117|149->119|149->119|149->119|151->121|151->121|151->121|154->124|154->124|154->124|155->125|155->125|155->125|161->131|168->138|168->138|168->138|177->147|177->147|177->147|178->148|178->148|178->148|186->156|186->156|186->156|187->157|187->157|187->157|193->163|193->163|193->163|195->165|195->165|195->165|198->168|198->168|198->168|199->169|199->169|199->169|205->175|208->178|208->178|208->178|210->180|210->180|210->180|213->183|213->183|213->183|214->184|214->184|214->184|220->190|226->196|226->196|226->196|235->205|235->205|235->205|236->206|236->206|236->206|244->214|244->214|244->214|245->215|245->215|245->215|251->221|251->221|251->221|253->223|253->223|253->223|256->226|256->226|256->226|257->227|257->227|257->227|263->233|266->236|266->236|266->236|268->238|268->238|268->238|271->241|271->241|271->241|272->242|272->242|272->242|278->248|284->254|284->254|284->254|293->263|293->263|293->263|294->264|294->264|294->264|302->272|302->272|302->272|303->273|303->273|303->273|309->279|309->279|309->279|311->281|311->281|311->281|314->284|314->284|314->284|315->285|315->285|315->285|321->291|324->294|324->294|324->294|326->296|326->296|326->296|329->299|329->299|329->299|330->300|330->300|330->300|336->306|342->312|342->312|342->312|347->317
                    -- GENERATED --
                */
            