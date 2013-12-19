
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
object checkedForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Survey,UserAnswers,Form[Survey],String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(survey: Survey,userAnswers: UserAnswers, form1: Form[Survey], results: String):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.81*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/mainAfter(Html("Your result..."), nav = "creating")/*6.53*/ {_display_(Seq[Any](format.raw/*6.55*/("""
    
   
    """),_display_(Seq[Any](/*9.6*/helper/*9.12*/.form(action = routes.CreateSurvey.newIndex())/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
    
		
   		<h2>"""),_display_(Seq[Any](/*12.11*/survey/*12.17*/.title)),format.raw/*12.23*/("""</h2>


    		<h6>1. Question</h6>
   		
   		
 			<p>
        	<b>"""),_display_(Seq[Any](/*19.14*/survey/*19.20*/.question1)),format.raw/*19.30*/("""</b>
    		</p>
 				
 		
 			<form class="form-inline">
  			

			"""),_display_(Seq[Any](/*26.5*/if(survey.answerFirst1 == survey.rightAnswerFirst)/*26.55*/ {_display_(Seq[Any](format.raw/*26.57*/("""
			    """),_display_(Seq[Any](/*27.9*/if(userAnswers.answerFirst == survey.answerFirst1)/*27.59*/ {_display_(Seq[Any](format.raw/*27.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*30.68*/survey/*30.74*/.answerFirst1)),format.raw/*30.87*/(""" checked>
  					"""),_display_(Seq[Any](/*31.9*/survey/*31.15*/.answerFirst1)),format.raw/*31.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*34.6*/else/*34.11*/{_display_(Seq[Any](format.raw/*34.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*37.68*/survey/*37.74*/.answerFirst1)),format.raw/*37.87*/(""">
  					"""),_display_(Seq[Any](/*38.9*/survey/*38.15*/.answerFirst1)),format.raw/*38.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*41.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*44.7*/if(userAnswers.answerFirst == survey.answerFirst1)/*44.57*/ {_display_(Seq[Any](format.raw/*44.59*/("""
  				"""),_display_(Seq[Any](/*45.8*/if(survey.answerFirst1 != survey.rightAnswerFirst)/*45.58*/ {_display_(Seq[Any](format.raw/*45.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*48.68*/survey/*48.74*/.answerFirst1)),format.raw/*48.87*/(""" checked>
  					"""),_display_(Seq[Any](/*49.9*/survey/*49.15*/.answerFirst1)),format.raw/*49.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*51.7*/("""
  			""")))})),format.raw/*52.7*/("""
  			
  			"""),_display_(Seq[Any](/*54.7*/if(userAnswers.answerFirst != survey.answerFirst1)/*54.57*/ {_display_(Seq[Any](format.raw/*54.59*/("""
  				"""),_display_(Seq[Any](/*55.8*/if(survey.answerFirst1 != survey.rightAnswerFirst)/*55.58*/ {_display_(Seq[Any](format.raw/*55.60*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*58.68*/survey/*58.74*/.answerFirst1)),format.raw/*58.87*/(""">
  					"""),_display_(Seq[Any](/*59.9*/survey/*59.15*/.answerFirst1)),format.raw/*59.28*/("""
  			</label>
  			""")))})),format.raw/*61.7*/("""
  			""")))})),format.raw/*62.7*/("""
  			
  			</br>
   			</br>
   			
   			"""),_display_(Seq[Any](/*67.8*/if(survey.answerFirst2 == survey.rightAnswerFirst)/*67.58*/ {_display_(Seq[Any](format.raw/*67.60*/("""
			    """),_display_(Seq[Any](/*68.9*/if(userAnswers.answerFirst == survey.answerFirst2)/*68.59*/ {_display_(Seq[Any](format.raw/*68.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*71.68*/survey/*71.74*/.answerFirst2)),format.raw/*71.87*/(""" checked>
  					"""),_display_(Seq[Any](/*72.9*/survey/*72.15*/.answerFirst2)),format.raw/*72.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*75.6*/else/*75.11*/{_display_(Seq[Any](format.raw/*75.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*78.68*/survey/*78.74*/.answerFirst2)),format.raw/*78.87*/(""">
  					"""),_display_(Seq[Any](/*79.9*/survey/*79.15*/.answerFirst2)),format.raw/*79.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*82.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*85.7*/if(userAnswers.answerFirst == survey.answerFirst2)/*85.57*/ {_display_(Seq[Any](format.raw/*85.59*/("""
  				"""),_display_(Seq[Any](/*86.8*/if(survey.answerFirst2 != survey.rightAnswerFirst)/*86.58*/ {_display_(Seq[Any](format.raw/*86.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*89.68*/survey/*89.74*/.answerFirst2)),format.raw/*89.87*/(""" checked>
  					"""),_display_(Seq[Any](/*90.9*/survey/*90.15*/.answerFirst2)),format.raw/*90.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*92.7*/("""
  			""")))})),format.raw/*93.7*/("""
  			
  			"""),_display_(Seq[Any](/*95.7*/if(userAnswers.answerFirst != survey.answerFirst2)/*95.57*/ {_display_(Seq[Any](format.raw/*95.59*/("""
  				"""),_display_(Seq[Any](/*96.8*/if(survey.answerFirst2 != survey.rightAnswerFirst)/*96.58*/ {_display_(Seq[Any](format.raw/*96.60*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*99.68*/survey/*99.74*/.answerFirst2)),format.raw/*99.87*/(""">
  					"""),_display_(Seq[Any](/*100.9*/survey/*100.15*/.answerFirst2)),format.raw/*100.28*/(""" 
  			</label>
  			""")))})),format.raw/*102.7*/("""
  			""")))})),format.raw/*103.7*/("""
  			
   			
   			</br>
   			</br>
			
			"""),_display_(Seq[Any](/*109.5*/if(survey.answerFirst3 == survey.rightAnswerFirst)/*109.55*/ {_display_(Seq[Any](format.raw/*109.57*/("""
			    """),_display_(Seq[Any](/*110.9*/if(userAnswers.answerFirst == survey.answerFirst3)/*110.59*/ {_display_(Seq[Any](format.raw/*110.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*113.68*/survey/*113.74*/.answerFirst3)),format.raw/*113.87*/(""" checked>
  					"""),_display_(Seq[Any](/*114.9*/survey/*114.15*/.answerFirst3)),format.raw/*114.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*117.6*/else/*117.11*/{_display_(Seq[Any](format.raw/*117.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*120.68*/survey/*120.74*/.answerFirst3)),format.raw/*120.87*/(""">
  					"""),_display_(Seq[Any](/*121.9*/survey/*121.15*/.answerFirst3)),format.raw/*121.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*124.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*127.7*/if(userAnswers.answerFirst == survey.answerFirst3)/*127.57*/ {_display_(Seq[Any](format.raw/*127.59*/("""
  				"""),_display_(Seq[Any](/*128.8*/if(survey.answerFirst3 != survey.rightAnswerFirst)/*128.58*/ {_display_(Seq[Any](format.raw/*128.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*131.68*/survey/*131.74*/.answerFirst3)),format.raw/*131.87*/(""" checked>
  					"""),_display_(Seq[Any](/*132.9*/survey/*132.15*/.answerFirst3)),format.raw/*132.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*134.7*/("""
  			""")))})),format.raw/*135.7*/("""
  			
  			"""),_display_(Seq[Any](/*137.7*/if(userAnswers.answerFirst != survey.answerFirst3)/*137.57*/ {_display_(Seq[Any](format.raw/*137.59*/("""
  				"""),_display_(Seq[Any](/*138.8*/if(survey.answerFirst3 != survey.rightAnswerFirst)/*138.58*/ {_display_(Seq[Any](format.raw/*138.60*/("""
  					"""),_display_(Seq[Any](/*139.9*/if(survey.answerFirst3 != null && survey.answerFirst3 != "")/*139.69*/ {_display_(Seq[Any](format.raw/*139.71*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*142.68*/survey/*142.74*/.answerFirst3)),format.raw/*142.87*/(""">
  					"""),_display_(Seq[Any](/*143.9*/survey/*143.15*/.answerFirst3)),format.raw/*143.28*/(""" 
  			</label>
  			
  			""")))})),format.raw/*146.7*/("""
  			""")))})),format.raw/*147.7*/("""
  			""")))})),format.raw/*148.7*/("""
  				
  			</br>
   			</br>		
			
     		"""),_display_(Seq[Any](/*153.9*/if(survey.answerFirst4 == survey.rightAnswerFirst)/*153.59*/ {_display_(Seq[Any](format.raw/*153.61*/("""
			    """),_display_(Seq[Any](/*154.9*/if(userAnswers.answerFirst == survey.answerFirst4)/*154.59*/ {_display_(Seq[Any](format.raw/*154.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*157.68*/survey/*157.74*/.answerFirst4)),format.raw/*157.87*/(""" checked>
  					"""),_display_(Seq[Any](/*158.9*/survey/*158.15*/.answerFirst4)),format.raw/*158.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*161.6*/else/*161.11*/{_display_(Seq[Any](format.raw/*161.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*164.68*/survey/*164.74*/.answerFirst4)),format.raw/*164.87*/(""">
  					"""),_display_(Seq[Any](/*165.9*/survey/*165.15*/.answerFirst4)),format.raw/*165.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*168.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*171.7*/if(userAnswers.answerFirst == survey.answerFirst4)/*171.57*/ {_display_(Seq[Any](format.raw/*171.59*/("""
  				"""),_display_(Seq[Any](/*172.8*/if(survey.answerFirst4 != survey.rightAnswerFirst)/*172.58*/ {_display_(Seq[Any](format.raw/*172.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*175.68*/survey/*175.74*/.answerFirst4)),format.raw/*175.87*/(""" checked>
  					"""),_display_(Seq[Any](/*176.9*/survey/*176.15*/.answerFirst4)),format.raw/*176.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*178.7*/("""
  			""")))})),format.raw/*179.7*/("""
  			
  			"""),_display_(Seq[Any](/*181.7*/if(userAnswers.answerFirst != survey.answerFirst4)/*181.57*/ {_display_(Seq[Any](format.raw/*181.59*/("""
  				"""),_display_(Seq[Any](/*182.8*/if(survey.answerFirst4 != survey.rightAnswerFirst)/*182.58*/ {_display_(Seq[Any](format.raw/*182.60*/("""
  					"""),_display_(Seq[Any](/*183.9*/if(survey.answerFirst4 != null && survey.answerFirst4 != "")/*183.69*/ {_display_(Seq[Any](format.raw/*183.71*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question1" id="question1" value= """),_display_(Seq[Any](/*186.68*/survey/*186.74*/.answerFirst4)),format.raw/*186.87*/(""">
  					"""),_display_(Seq[Any](/*187.9*/survey/*187.15*/.answerFirst4)),format.raw/*187.28*/("""
  			</label>

  			""")))})),format.raw/*190.7*/("""
  			""")))})),format.raw/*191.7*/("""
  			""")))})),format.raw/*192.7*/("""
   			</br>
   			</br>
   		

			<h6>2. Question</h6>
   		
   		
 			<p>
        	<b>"""),_display_(Seq[Any](/*201.14*/survey/*201.20*/.question2)),format.raw/*201.30*/("""</b>
    		</p>
 				
 		
 			<form class="form-inline">
  			

			"""),_display_(Seq[Any](/*208.5*/if(survey.answerSec1 == survey.rightAnswerSec)/*208.51*/ {_display_(Seq[Any](format.raw/*208.53*/("""
			    """),_display_(Seq[Any](/*209.9*/if(userAnswers.answerSec == survey.answerSec1)/*209.55*/ {_display_(Seq[Any](format.raw/*209.57*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*212.68*/survey/*212.74*/.answerSec1)),format.raw/*212.85*/(""" checked>
  					"""),_display_(Seq[Any](/*213.9*/survey/*213.15*/.answerSec1)),format.raw/*213.26*/(""" <b>OK<b>
			</label>
			
			""")))}/*216.6*/else/*216.11*/{_display_(Seq[Any](format.raw/*216.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*219.68*/survey/*219.74*/.answerSec1)),format.raw/*219.85*/(""">
  					"""),_display_(Seq[Any](/*220.9*/survey/*220.15*/.answerSec1)),format.raw/*220.26*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*223.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*226.7*/if(userAnswers.answerSec == survey.answerSec1)/*226.53*/ {_display_(Seq[Any](format.raw/*226.55*/("""
  				"""),_display_(Seq[Any](/*227.8*/if(survey.answerSec1 != survey.rightAnswerSec)/*227.54*/ {_display_(Seq[Any](format.raw/*227.56*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*230.68*/survey/*230.74*/.answerSec1)),format.raw/*230.85*/(""" checked>
  					"""),_display_(Seq[Any](/*231.9*/survey/*231.15*/.answerSec1)),format.raw/*231.26*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*233.7*/("""
  			""")))})),format.raw/*234.7*/("""
  			
  			"""),_display_(Seq[Any](/*236.7*/if(userAnswers.answerSec != survey.answerSec1)/*236.53*/ {_display_(Seq[Any](format.raw/*236.55*/("""
  				"""),_display_(Seq[Any](/*237.8*/if(survey.answerSec1 != survey.rightAnswerSec)/*237.54*/ {_display_(Seq[Any](format.raw/*237.56*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*240.68*/survey/*240.74*/.answerSec1)),format.raw/*240.85*/(""">
  					"""),_display_(Seq[Any](/*241.9*/survey/*241.15*/.answerSec1)),format.raw/*241.26*/(""" 
  			</label>
  			""")))})),format.raw/*243.7*/("""
  			""")))})),format.raw/*244.7*/("""
  			
  			</br>
   			</br>
   			
   			"""),_display_(Seq[Any](/*249.8*/if(survey.answerSec2 == survey.rightAnswerSec)/*249.54*/ {_display_(Seq[Any](format.raw/*249.56*/("""
			    """),_display_(Seq[Any](/*250.9*/if(userAnswers.answerSec == survey.answerSec2)/*250.55*/ {_display_(Seq[Any](format.raw/*250.57*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*253.68*/survey/*253.74*/.answerSec2)),format.raw/*253.85*/(""" checked>
  					"""),_display_(Seq[Any](/*254.9*/survey/*254.15*/.answerSec2)),format.raw/*254.26*/(""" <b>OK<b>
			</label>
			
			""")))}/*257.6*/else/*257.11*/{_display_(Seq[Any](format.raw/*257.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*260.68*/survey/*260.74*/.answerSec2)),format.raw/*260.85*/(""">
  					"""),_display_(Seq[Any](/*261.9*/survey/*261.15*/.answerSec2)),format.raw/*261.26*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*264.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*267.7*/if(userAnswers.answerSec == survey.answerSec2)/*267.53*/ {_display_(Seq[Any](format.raw/*267.55*/("""
  				"""),_display_(Seq[Any](/*268.8*/if(survey.answerSec2 != survey.rightAnswerSec)/*268.54*/ {_display_(Seq[Any](format.raw/*268.56*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*271.68*/survey/*271.74*/.answerSec2)),format.raw/*271.85*/(""" checked>
  					"""),_display_(Seq[Any](/*272.9*/survey/*272.15*/.answerSec2)),format.raw/*272.26*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*274.7*/("""
  			""")))})),format.raw/*275.7*/("""
  			
  			"""),_display_(Seq[Any](/*277.7*/if(userAnswers.answerSec != survey.answerSec2)/*277.53*/ {_display_(Seq[Any](format.raw/*277.55*/("""
  				"""),_display_(Seq[Any](/*278.8*/if(survey.answerSec2 != survey.rightAnswerSec)/*278.54*/ {_display_(Seq[Any](format.raw/*278.56*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*281.68*/survey/*281.74*/.answerSec2)),format.raw/*281.85*/(""">
  					"""),_display_(Seq[Any](/*282.9*/survey/*282.15*/.answerSec2)),format.raw/*282.26*/(""" 
  			</label>
  			""")))})),format.raw/*284.7*/("""
  			""")))})),format.raw/*285.7*/("""
  			
   			
   			</br>
   			</br>
			
			"""),_display_(Seq[Any](/*291.5*/if(survey.answerSec3 == survey.rightAnswerSec)/*291.51*/ {_display_(Seq[Any](format.raw/*291.53*/("""
			    """),_display_(Seq[Any](/*292.9*/if(userAnswers.answerSec == survey.answerSec3)/*292.55*/ {_display_(Seq[Any](format.raw/*292.57*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*295.68*/survey/*295.74*/.answerSec3)),format.raw/*295.85*/(""" checked>
  					"""),_display_(Seq[Any](/*296.9*/survey/*296.15*/.answerSec3)),format.raw/*296.26*/(""" <b>OK<b>
			</label>
			
			""")))}/*299.6*/else/*299.11*/{_display_(Seq[Any](format.raw/*299.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*302.68*/survey/*302.74*/.answerSec3)),format.raw/*302.85*/(""">
  					"""),_display_(Seq[Any](/*303.9*/survey/*303.15*/.answerSec3)),format.raw/*303.26*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*306.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*309.7*/if(userAnswers.answerSec == survey.answerSec3)/*309.53*/ {_display_(Seq[Any](format.raw/*309.55*/("""
  				"""),_display_(Seq[Any](/*310.8*/if(survey.answerSec3 != survey.rightAnswerSec)/*310.54*/ {_display_(Seq[Any](format.raw/*310.56*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*313.68*/survey/*313.74*/.answerSec3)),format.raw/*313.85*/(""" checked>
  					"""),_display_(Seq[Any](/*314.9*/survey/*314.15*/.answerSec3)),format.raw/*314.26*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*316.7*/("""
  			""")))})),format.raw/*317.7*/("""
  			
  			"""),_display_(Seq[Any](/*319.7*/if(userAnswers.answerSec != survey.answerSec3)/*319.53*/ {_display_(Seq[Any](format.raw/*319.55*/("""
  				"""),_display_(Seq[Any](/*320.8*/if(survey.answerSec3 != survey.rightAnswerSec)/*320.54*/ {_display_(Seq[Any](format.raw/*320.56*/("""
  					"""),_display_(Seq[Any](/*321.9*/if(survey.answerSec3 != null && survey.answerSec3 != "")/*321.65*/ {_display_(Seq[Any](format.raw/*321.67*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*324.68*/survey/*324.74*/.answerSec3)),format.raw/*324.85*/(""">
  					"""),_display_(Seq[Any](/*325.9*/survey/*325.15*/.answerSec3)),format.raw/*325.26*/(""" 
  			</label>

  			""")))})),format.raw/*328.7*/("""
  			""")))})),format.raw/*329.7*/("""
  			""")))})),format.raw/*330.7*/("""
   			
   			</br>
   			</br>
   			
                        

			
     		"""),_display_(Seq[Any](/*338.9*/if(survey.answerSec4 == survey.rightAnswerSec)/*338.55*/ {_display_(Seq[Any](format.raw/*338.57*/("""
			    """),_display_(Seq[Any](/*339.9*/if(userAnswers.answerSec == survey.answerSec4)/*339.55*/ {_display_(Seq[Any](format.raw/*339.57*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*342.68*/survey/*342.74*/.answerSec4)),format.raw/*342.85*/(""" checked>
  					"""),_display_(Seq[Any](/*343.9*/survey/*343.15*/.answerSec4)),format.raw/*343.26*/(""" <b>OK<b>
			</label>
			
			""")))}/*346.6*/else/*346.11*/{_display_(Seq[Any](format.raw/*346.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*349.68*/survey/*349.74*/.answerSec4)),format.raw/*349.85*/(""">
  					"""),_display_(Seq[Any](/*350.9*/survey/*350.15*/.answerSec4)),format.raw/*350.26*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*353.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*356.7*/if(userAnswers.answerSec == survey.answerSec4)/*356.53*/ {_display_(Seq[Any](format.raw/*356.55*/("""
  				"""),_display_(Seq[Any](/*357.8*/if(survey.answerSec4 != survey.rightAnswerSec)/*357.54*/ {_display_(Seq[Any](format.raw/*357.56*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*360.68*/survey/*360.74*/.answerSec4)),format.raw/*360.85*/(""" checked>
  					"""),_display_(Seq[Any](/*361.9*/survey/*361.15*/.answerSec4)),format.raw/*361.26*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*363.7*/("""
  			""")))})),format.raw/*364.7*/("""
  			
  			"""),_display_(Seq[Any](/*366.7*/if(userAnswers.answerSec != survey.answerSec4)/*366.53*/ {_display_(Seq[Any](format.raw/*366.55*/("""
  				"""),_display_(Seq[Any](/*367.8*/if(survey.answerSec4 != survey.rightAnswerSec)/*367.54*/ {_display_(Seq[Any](format.raw/*367.56*/("""
  					"""),_display_(Seq[Any](/*368.9*/if(survey.answerSec4 != null && survey.answerSec4 != "")/*368.65*/ {_display_(Seq[Any](format.raw/*368.67*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question2" id="question2" value= """),_display_(Seq[Any](/*371.68*/survey/*371.74*/.answerSec4)),format.raw/*371.85*/(""">
  					"""),_display_(Seq[Any](/*372.9*/survey/*372.15*/.answerSec4)),format.raw/*372.26*/("""
  			</label>
  			""")))})),format.raw/*374.7*/("""
  			""")))})),format.raw/*375.7*/("""
  			""")))})),format.raw/*376.7*/("""
  			</br>
   			</br>
   			
  
 			   			
   			
   			<h6>3. Question</h6>
   		
   		
 			<p>
        	<b>"""),_display_(Seq[Any](/*387.14*/survey/*387.20*/.question3)),format.raw/*387.30*/("""</b>
    		</p>
 				
 		
 			<form class="form-inline">
  			

			"""),_display_(Seq[Any](/*394.5*/if(survey.answerThird1 == survey.rightAnswerThird)/*394.55*/ {_display_(Seq[Any](format.raw/*394.57*/("""
			    """),_display_(Seq[Any](/*395.9*/if(userAnswers.answerThird == survey.answerThird1)/*395.59*/ {_display_(Seq[Any](format.raw/*395.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*398.68*/survey/*398.74*/.answerThird1)),format.raw/*398.87*/(""" checked>
  					"""),_display_(Seq[Any](/*399.9*/survey/*399.15*/.answerThird1)),format.raw/*399.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*402.6*/else/*402.11*/{_display_(Seq[Any](format.raw/*402.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*405.68*/survey/*405.74*/.answerThird1)),format.raw/*405.87*/(""">
  					"""),_display_(Seq[Any](/*406.9*/survey/*406.15*/.answerThird1)),format.raw/*406.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*409.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*412.7*/if(userAnswers.answerThird == survey.answerThird1)/*412.57*/ {_display_(Seq[Any](format.raw/*412.59*/("""
  				"""),_display_(Seq[Any](/*413.8*/if(survey.answerThird1 != survey.rightAnswerThird)/*413.58*/ {_display_(Seq[Any](format.raw/*413.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*416.68*/survey/*416.74*/.answerThird1)),format.raw/*416.87*/(""" checked>
  					"""),_display_(Seq[Any](/*417.9*/survey/*417.15*/.answerThird1)),format.raw/*417.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*419.7*/("""
  			""")))})),format.raw/*420.7*/("""
  			
  			"""),_display_(Seq[Any](/*422.7*/if(userAnswers.answerThird != survey.answerThird1)/*422.57*/ {_display_(Seq[Any](format.raw/*422.59*/("""
  				"""),_display_(Seq[Any](/*423.8*/if(survey.answerThird1 != survey.rightAnswerThird)/*423.58*/ {_display_(Seq[Any](format.raw/*423.60*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*426.68*/survey/*426.74*/.answerThird1)),format.raw/*426.87*/(""">
  					"""),_display_(Seq[Any](/*427.9*/survey/*427.15*/.answerThird1)),format.raw/*427.28*/(""" 
  			</label>
  			""")))})),format.raw/*429.7*/("""
  			""")))})),format.raw/*430.7*/("""
  			
  			</br>
   			</br>
   			
   			"""),_display_(Seq[Any](/*435.8*/if(survey.answerThird2 == survey.rightAnswerThird)/*435.58*/ {_display_(Seq[Any](format.raw/*435.60*/("""
			    """),_display_(Seq[Any](/*436.9*/if(userAnswers.answerThird == survey.answerThird2)/*436.59*/ {_display_(Seq[Any](format.raw/*436.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*439.68*/survey/*439.74*/.answerThird2)),format.raw/*439.87*/(""" checked>
  					"""),_display_(Seq[Any](/*440.9*/survey/*440.15*/.answerThird2)),format.raw/*440.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*443.6*/else/*443.11*/{_display_(Seq[Any](format.raw/*443.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*446.68*/survey/*446.74*/.answerThird2)),format.raw/*446.87*/(""">
  					"""),_display_(Seq[Any](/*447.9*/survey/*447.15*/.answerThird2)),format.raw/*447.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*450.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*453.7*/if(userAnswers.answerThird == survey.answerThird2)/*453.57*/ {_display_(Seq[Any](format.raw/*453.59*/("""
  				"""),_display_(Seq[Any](/*454.8*/if(survey.answerThird2 != survey.rightAnswerThird)/*454.58*/ {_display_(Seq[Any](format.raw/*454.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*457.68*/survey/*457.74*/.answerThird2)),format.raw/*457.87*/(""" checked>
  					"""),_display_(Seq[Any](/*458.9*/survey/*458.15*/.answerThird2)),format.raw/*458.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*460.7*/("""
  			""")))})),format.raw/*461.7*/("""
  			
  			"""),_display_(Seq[Any](/*463.7*/if(userAnswers.answerThird != survey.answerThird2)/*463.57*/ {_display_(Seq[Any](format.raw/*463.59*/("""
  				"""),_display_(Seq[Any](/*464.8*/if(survey.answerThird2 != survey.rightAnswerThird)/*464.58*/ {_display_(Seq[Any](format.raw/*464.60*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*467.68*/survey/*467.74*/.answerThird2)),format.raw/*467.87*/(""">
  					"""),_display_(Seq[Any](/*468.9*/survey/*468.15*/.answerThird2)),format.raw/*468.28*/(""" 
  			</label>
  			""")))})),format.raw/*470.7*/("""
  			""")))})),format.raw/*471.7*/("""
  			
   			
   			</br>
   			</br>
			
			"""),_display_(Seq[Any](/*477.5*/if(survey.answerThird3 == survey.rightAnswerThird)/*477.55*/ {_display_(Seq[Any](format.raw/*477.57*/("""
			    """),_display_(Seq[Any](/*478.9*/if(userAnswers.answerThird == survey.answerThird3)/*478.59*/ {_display_(Seq[Any](format.raw/*478.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*481.68*/survey/*481.74*/.answerThird3)),format.raw/*481.87*/(""" checked>
  					"""),_display_(Seq[Any](/*482.9*/survey/*482.15*/.answerThird3)),format.raw/*482.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*485.6*/else/*485.11*/{_display_(Seq[Any](format.raw/*485.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*488.68*/survey/*488.74*/.answerThird3)),format.raw/*488.87*/(""">
  					"""),_display_(Seq[Any](/*489.9*/survey/*489.15*/.answerThird3)),format.raw/*489.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*492.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*495.7*/if(userAnswers.answerThird == survey.answerThird3)/*495.57*/ {_display_(Seq[Any](format.raw/*495.59*/("""
  				"""),_display_(Seq[Any](/*496.8*/if(survey.answerThird3 != survey.rightAnswerThird)/*496.58*/ {_display_(Seq[Any](format.raw/*496.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*499.68*/survey/*499.74*/.answerThird3)),format.raw/*499.87*/(""" checked>
  					"""),_display_(Seq[Any](/*500.9*/survey/*500.15*/.answerThird3)),format.raw/*500.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*502.7*/("""
  			""")))})),format.raw/*503.7*/("""
  			
  			"""),_display_(Seq[Any](/*505.7*/if(userAnswers.answerThird != survey.answerThird3)/*505.57*/ {_display_(Seq[Any](format.raw/*505.59*/("""
  				"""),_display_(Seq[Any](/*506.8*/if(survey.answerThird3 != survey.rightAnswerThird)/*506.58*/ {_display_(Seq[Any](format.raw/*506.60*/("""
  					"""),_display_(Seq[Any](/*507.9*/if(survey.answerThird3 != null && survey.answerThird3 != "")/*507.69*/ {_display_(Seq[Any](format.raw/*507.71*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*510.68*/survey/*510.74*/.answerThird3)),format.raw/*510.87*/(""">
  					"""),_display_(Seq[Any](/*511.9*/survey/*511.15*/.answerThird3)),format.raw/*511.28*/(""" 
  			</label>
  			
  			""")))})),format.raw/*514.7*/("""
  			""")))})),format.raw/*515.7*/("""
  			""")))})),format.raw/*516.7*/("""
   			
   			</br>
   			</br>
                        

			
     		"""),_display_(Seq[Any](/*523.9*/if(survey.answerThird4 == survey.rightAnswerThird)/*523.59*/ {_display_(Seq[Any](format.raw/*523.61*/("""
			    """),_display_(Seq[Any](/*524.9*/if(userAnswers.answerThird == survey.answerThird4)/*524.59*/ {_display_(Seq[Any](format.raw/*524.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*527.68*/survey/*527.74*/.answerThird4)),format.raw/*527.87*/(""" checked>
  					"""),_display_(Seq[Any](/*528.9*/survey/*528.15*/.answerThird4)),format.raw/*528.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*531.6*/else/*531.11*/{_display_(Seq[Any](format.raw/*531.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*534.68*/survey/*534.74*/.answerThird4)),format.raw/*534.87*/(""">
  					"""),_display_(Seq[Any](/*535.9*/survey/*535.15*/.answerThird4)),format.raw/*535.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*538.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*541.7*/if(userAnswers.answerThird == survey.answerThird4)/*541.57*/ {_display_(Seq[Any](format.raw/*541.59*/("""
  				"""),_display_(Seq[Any](/*542.8*/if(survey.answerThird4 != survey.rightAnswerThird)/*542.58*/ {_display_(Seq[Any](format.raw/*542.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*545.68*/survey/*545.74*/.answerThird4)),format.raw/*545.87*/(""" checked>
  					"""),_display_(Seq[Any](/*546.9*/survey/*546.15*/.answerThird4)),format.raw/*546.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*548.7*/("""
  			""")))})),format.raw/*549.7*/("""
  			
  			"""),_display_(Seq[Any](/*551.7*/if(userAnswers.answerThird != survey.answerThird4)/*551.57*/ {_display_(Seq[Any](format.raw/*551.59*/("""
  				"""),_display_(Seq[Any](/*552.8*/if(survey.answerThird4 != survey.rightAnswerThird)/*552.58*/ {_display_(Seq[Any](format.raw/*552.60*/("""
  					"""),_display_(Seq[Any](/*553.9*/if(survey.answerThird4 != null && survey.answerThird4 != "")/*553.69*/ {_display_(Seq[Any](format.raw/*553.71*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question3" id="question3" value= """),_display_(Seq[Any](/*556.68*/survey/*556.74*/.answerThird4)),format.raw/*556.87*/(""">
  					"""),_display_(Seq[Any](/*557.9*/survey/*557.15*/.answerThird4)),format.raw/*557.28*/("""
  			</label>
  			""")))})),format.raw/*559.7*/("""
  			""")))})),format.raw/*560.7*/("""
  			""")))})),format.raw/*561.7*/("""	
    
    		</br>
   			</br>

			<h6>4. Question</h6>
   		
   		
 			<p>
        	<b>"""),_display_(Seq[Any](/*570.14*/survey/*570.20*/.question4)),format.raw/*570.30*/("""</b>
    		</p>
 				
 		
 			<form class="form-inline">
  			

			"""),_display_(Seq[Any](/*577.5*/if(survey.answerFourth1 == survey.rightAnswerFourth)/*577.57*/ {_display_(Seq[Any](format.raw/*577.59*/("""
			    """),_display_(Seq[Any](/*578.9*/if(userAnswers.answerFourth == survey.answerFourth1)/*578.61*/ {_display_(Seq[Any](format.raw/*578.63*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*581.68*/survey/*581.74*/.answerFourth1)),format.raw/*581.88*/(""" checked>
  					"""),_display_(Seq[Any](/*582.9*/survey/*582.15*/.answerFourth1)),format.raw/*582.29*/(""" <b>OK<b>
			</label>
			
			""")))}/*585.6*/else/*585.11*/{_display_(Seq[Any](format.raw/*585.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*588.68*/survey/*588.74*/.answerFourth1)),format.raw/*588.88*/(""">
  					"""),_display_(Seq[Any](/*589.9*/survey/*589.15*/.answerFourth1)),format.raw/*589.29*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*592.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*595.7*/if(userAnswers.answerFourth == survey.answerFourth1)/*595.59*/ {_display_(Seq[Any](format.raw/*595.61*/("""
  				"""),_display_(Seq[Any](/*596.8*/if(survey.answerFourth1 != survey.rightAnswerFourth)/*596.60*/ {_display_(Seq[Any](format.raw/*596.62*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*599.68*/survey/*599.74*/.answerFourth1)),format.raw/*599.88*/(""" checked>
  					"""),_display_(Seq[Any](/*600.9*/survey/*600.15*/.answerFourth1)),format.raw/*600.29*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*602.7*/("""
  			""")))})),format.raw/*603.7*/("""
  			
  			"""),_display_(Seq[Any](/*605.7*/if(userAnswers.answerFourth != survey.answerFourth1)/*605.59*/ {_display_(Seq[Any](format.raw/*605.61*/("""
  				"""),_display_(Seq[Any](/*606.8*/if(survey.answerFourth1 != survey.rightAnswerFourth)/*606.60*/ {_display_(Seq[Any](format.raw/*606.62*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*609.68*/survey/*609.74*/.answerFourth1)),format.raw/*609.88*/(""">
  					"""),_display_(Seq[Any](/*610.9*/survey/*610.15*/.answerFourth1)),format.raw/*610.29*/(""" 
  			</label>
  			""")))})),format.raw/*612.7*/("""
  			""")))})),format.raw/*613.7*/("""
  			
  			</br>
   			</br>
   			
   			"""),_display_(Seq[Any](/*618.8*/if(survey.answerFourth2 == survey.rightAnswerFourth)/*618.60*/ {_display_(Seq[Any](format.raw/*618.62*/("""
			    """),_display_(Seq[Any](/*619.9*/if(userAnswers.answerFourth == survey.answerFourth2)/*619.61*/ {_display_(Seq[Any](format.raw/*619.63*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*622.68*/survey/*622.74*/.answerFourth2)),format.raw/*622.88*/(""" checked>
  					"""),_display_(Seq[Any](/*623.9*/survey/*623.15*/.answerFourth2)),format.raw/*623.29*/(""" <b>OK<b>
			</label>
			
			""")))}/*626.6*/else/*626.11*/{_display_(Seq[Any](format.raw/*626.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*629.68*/survey/*629.74*/.answerFourth2)),format.raw/*629.88*/(""">
  					"""),_display_(Seq[Any](/*630.9*/survey/*630.15*/.answerFourth2)),format.raw/*630.29*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*633.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*636.7*/if(userAnswers.answerFourth == survey.answerFourth2)/*636.59*/ {_display_(Seq[Any](format.raw/*636.61*/("""
  				"""),_display_(Seq[Any](/*637.8*/if(survey.answerFourth2 != survey.rightAnswerFourth)/*637.60*/ {_display_(Seq[Any](format.raw/*637.62*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*640.68*/survey/*640.74*/.answerFourth2)),format.raw/*640.88*/(""" checked>
  					"""),_display_(Seq[Any](/*641.9*/survey/*641.15*/.answerFourth2)),format.raw/*641.29*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*643.7*/("""
  			""")))})),format.raw/*644.7*/("""
  			
  			"""),_display_(Seq[Any](/*646.7*/if(userAnswers.answerFourth != survey.answerFourth2)/*646.59*/ {_display_(Seq[Any](format.raw/*646.61*/("""
  				"""),_display_(Seq[Any](/*647.8*/if(survey.answerFourth2 != survey.rightAnswerFourth)/*647.60*/ {_display_(Seq[Any](format.raw/*647.62*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*650.68*/survey/*650.74*/.answerFourth2)),format.raw/*650.88*/(""">
  					"""),_display_(Seq[Any](/*651.9*/survey/*651.15*/.answerFourth2)),format.raw/*651.29*/(""" 
  			</label>
  			""")))})),format.raw/*653.7*/("""
  			""")))})),format.raw/*654.7*/("""
  			
   			
   			</br>
   			</br>
			
			"""),_display_(Seq[Any](/*660.5*/if(survey.answerFourth3 == survey.rightAnswerFourth)/*660.57*/ {_display_(Seq[Any](format.raw/*660.59*/("""
			    """),_display_(Seq[Any](/*661.9*/if(userAnswers.answerFourth == survey.answerFourth3)/*661.61*/ {_display_(Seq[Any](format.raw/*661.63*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*664.68*/survey/*664.74*/.answerFourth3)),format.raw/*664.88*/(""" checked>
  					"""),_display_(Seq[Any](/*665.9*/survey/*665.15*/.answerFourth3)),format.raw/*665.29*/(""" <b>OK<b>
			</label>
			
			""")))}/*668.6*/else/*668.11*/{_display_(Seq[Any](format.raw/*668.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*671.68*/survey/*671.74*/.answerFourth3)),format.raw/*671.88*/(""">
  					"""),_display_(Seq[Any](/*672.9*/survey/*672.15*/.answerFourth3)),format.raw/*672.29*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*675.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*678.7*/if(userAnswers.answerFourth == survey.answerFourth3)/*678.59*/ {_display_(Seq[Any](format.raw/*678.61*/("""
  				"""),_display_(Seq[Any](/*679.8*/if(survey.answerFourth3 != survey.rightAnswerFourth)/*679.60*/ {_display_(Seq[Any](format.raw/*679.62*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*682.68*/survey/*682.74*/.answerFourth3)),format.raw/*682.88*/(""" checked>
  					"""),_display_(Seq[Any](/*683.9*/survey/*683.15*/.answerFourth3)),format.raw/*683.29*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*685.7*/("""
  			""")))})),format.raw/*686.7*/("""
  			
  			"""),_display_(Seq[Any](/*688.7*/if(userAnswers.answerFourth != survey.answerFourth3)/*688.59*/ {_display_(Seq[Any](format.raw/*688.61*/("""
  				"""),_display_(Seq[Any](/*689.8*/if(survey.answerFourth3 != survey.rightAnswerFourth)/*689.60*/ {_display_(Seq[Any](format.raw/*689.62*/("""
  					"""),_display_(Seq[Any](/*690.9*/if(survey.answerFourth3 != null && survey.answerFourth3 != "")/*690.71*/ {_display_(Seq[Any](format.raw/*690.73*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*693.68*/survey/*693.74*/.answerFourth3)),format.raw/*693.88*/(""">
  					"""),_display_(Seq[Any](/*694.9*/survey/*694.15*/.answerFourth3)),format.raw/*694.29*/(""" 
  			</label>
  			
  			""")))})),format.raw/*697.7*/("""
  			""")))})),format.raw/*698.7*/("""
  			""")))})),format.raw/*699.7*/("""
   			
   			</br>
   			</br>
                        

			
     		"""),_display_(Seq[Any](/*706.9*/if(survey.answerFourth4 == survey.rightAnswerFourth)/*706.61*/ {_display_(Seq[Any](format.raw/*706.63*/("""
			    """),_display_(Seq[Any](/*707.9*/if(userAnswers.answerFourth == survey.answerFourth4)/*707.61*/ {_display_(Seq[Any](format.raw/*707.63*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*710.68*/survey/*710.74*/.answerFourth4)),format.raw/*710.88*/(""" checked>
  					"""),_display_(Seq[Any](/*711.9*/survey/*711.15*/.answerFourth4)),format.raw/*711.29*/(""" <b>OK<b>
			</label>
			
			""")))}/*714.6*/else/*714.11*/{_display_(Seq[Any](format.raw/*714.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*717.68*/survey/*717.74*/.answerFourth4)),format.raw/*717.88*/(""">
  					"""),_display_(Seq[Any](/*718.9*/survey/*718.15*/.answerFourth4)),format.raw/*718.29*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*721.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*724.7*/if(userAnswers.answerFourth == survey.answerFourth4)/*724.59*/ {_display_(Seq[Any](format.raw/*724.61*/("""
  				"""),_display_(Seq[Any](/*725.8*/if(survey.answerFourth4 != survey.rightAnswerFourth)/*725.60*/ {_display_(Seq[Any](format.raw/*725.62*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*728.68*/survey/*728.74*/.answerFourth4)),format.raw/*728.88*/(""" checked>
  					"""),_display_(Seq[Any](/*729.9*/survey/*729.15*/.answerFourth4)),format.raw/*729.29*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*731.7*/("""
  			""")))})),format.raw/*732.7*/("""
  			
  			"""),_display_(Seq[Any](/*734.7*/if(userAnswers.answerFourth != survey.answerFourth4)/*734.59*/ {_display_(Seq[Any](format.raw/*734.61*/("""
  				"""),_display_(Seq[Any](/*735.8*/if(survey.answerFourth4 != survey.rightAnswerFourth)/*735.60*/ {_display_(Seq[Any](format.raw/*735.62*/("""
  					"""),_display_(Seq[Any](/*736.9*/if(survey.answerFourth4 != null && survey.answerFourth4 != "")/*736.71*/ {_display_(Seq[Any](format.raw/*736.73*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question4" id="question4" value= """),_display_(Seq[Any](/*739.68*/survey/*739.74*/.answerFourth4)),format.raw/*739.88*/(""">
  					"""),_display_(Seq[Any](/*740.9*/survey/*740.15*/.answerFourth4)),format.raw/*740.29*/("""
  			</label>
  			""")))})),format.raw/*742.7*/("""
  			""")))})),format.raw/*743.7*/("""
  			""")))})),format.raw/*744.7*/("""
   			
   			</br>
   			</br>

   			
   			<h6>5. Question</h6>
   		
   		
 			<p>
        	<b>"""),_display_(Seq[Any](/*754.14*/survey/*754.20*/.question5)),format.raw/*754.30*/("""</b>
    		</p>
 				
 		
 			<form class="form-inline">
  			

			"""),_display_(Seq[Any](/*761.5*/if(survey.answerFifth1 == survey.rightAnswerFifth)/*761.55*/ {_display_(Seq[Any](format.raw/*761.57*/("""
			    """),_display_(Seq[Any](/*762.9*/if(userAnswers.answerFifth == survey.answerFifth1)/*762.59*/ {_display_(Seq[Any](format.raw/*762.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*765.68*/survey/*765.74*/.answerFifth1)),format.raw/*765.87*/(""" checked>
  					"""),_display_(Seq[Any](/*766.9*/survey/*766.15*/.answerFifth1)),format.raw/*766.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*769.6*/else/*769.11*/{_display_(Seq[Any](format.raw/*769.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*772.68*/survey/*772.74*/.answerFifth1)),format.raw/*772.87*/(""">
  					"""),_display_(Seq[Any](/*773.9*/survey/*773.15*/.answerFifth1)),format.raw/*773.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*776.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*779.7*/if(userAnswers.answerFifth == survey.answerFifth1)/*779.57*/ {_display_(Seq[Any](format.raw/*779.59*/("""
  				"""),_display_(Seq[Any](/*780.8*/if(survey.answerFifth1 != survey.rightAnswerFifth)/*780.58*/ {_display_(Seq[Any](format.raw/*780.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*783.68*/survey/*783.74*/.answerFifth1)),format.raw/*783.87*/(""" checked>
  					"""),_display_(Seq[Any](/*784.9*/survey/*784.15*/.answerFifth1)),format.raw/*784.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*786.7*/("""
  			""")))})),format.raw/*787.7*/("""
  			
  			"""),_display_(Seq[Any](/*789.7*/if(userAnswers.answerFifth != survey.answerFifth1)/*789.57*/ {_display_(Seq[Any](format.raw/*789.59*/("""
  				"""),_display_(Seq[Any](/*790.8*/if(survey.answerFifth1 != survey.rightAnswerFifth)/*790.58*/ {_display_(Seq[Any](format.raw/*790.60*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*793.68*/survey/*793.74*/.answerFifth1)),format.raw/*793.87*/(""">
  					"""),_display_(Seq[Any](/*794.9*/survey/*794.15*/.answerFifth1)),format.raw/*794.28*/(""" 
  			</label>
  			""")))})),format.raw/*796.7*/("""
  			""")))})),format.raw/*797.7*/("""
  			
  			</br>
   			</br>
   			
   			"""),_display_(Seq[Any](/*802.8*/if(survey.answerFifth2 == survey.rightAnswerFifth)/*802.58*/ {_display_(Seq[Any](format.raw/*802.60*/("""
			    """),_display_(Seq[Any](/*803.9*/if(userAnswers.answerFifth == survey.answerFifth2)/*803.59*/ {_display_(Seq[Any](format.raw/*803.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*806.68*/survey/*806.74*/.answerFifth2)),format.raw/*806.87*/(""" checked>
  					"""),_display_(Seq[Any](/*807.9*/survey/*807.15*/.answerFifth2)),format.raw/*807.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*810.6*/else/*810.11*/{_display_(Seq[Any](format.raw/*810.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*813.68*/survey/*813.74*/.answerFifth2)),format.raw/*813.87*/(""">
  					"""),_display_(Seq[Any](/*814.9*/survey/*814.15*/.answerFifth2)),format.raw/*814.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*817.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*820.7*/if(userAnswers.answerFifth == survey.answerFifth2)/*820.57*/ {_display_(Seq[Any](format.raw/*820.59*/("""
  				"""),_display_(Seq[Any](/*821.8*/if(survey.answerFifth2 != survey.rightAnswerFifth)/*821.58*/ {_display_(Seq[Any](format.raw/*821.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*824.68*/survey/*824.74*/.answerFifth2)),format.raw/*824.87*/(""" checked>
  					"""),_display_(Seq[Any](/*825.9*/survey/*825.15*/.answerFifth2)),format.raw/*825.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*827.7*/("""
  			""")))})),format.raw/*828.7*/("""
  			
  			"""),_display_(Seq[Any](/*830.7*/if(userAnswers.answerFifth != survey.answerFifth2)/*830.57*/ {_display_(Seq[Any](format.raw/*830.59*/("""
  				"""),_display_(Seq[Any](/*831.8*/if(survey.answerFifth2 != survey.rightAnswerFifth)/*831.58*/ {_display_(Seq[Any](format.raw/*831.60*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*834.68*/survey/*834.74*/.answerFifth2)),format.raw/*834.87*/(""">
  					"""),_display_(Seq[Any](/*835.9*/survey/*835.15*/.answerFifth2)),format.raw/*835.28*/(""" 
  			</label>
  			""")))})),format.raw/*837.7*/("""
  			""")))})),format.raw/*838.7*/("""
  			
   			
   			</br>
   			</br>
			
			"""),_display_(Seq[Any](/*844.5*/if(survey.answerFifth3 == survey.rightAnswerFifth)/*844.55*/ {_display_(Seq[Any](format.raw/*844.57*/("""
			    """),_display_(Seq[Any](/*845.9*/if(userAnswers.answerFifth == survey.answerFifth3)/*845.59*/ {_display_(Seq[Any](format.raw/*845.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*848.68*/survey/*848.74*/.answerFifth3)),format.raw/*848.87*/(""" checked>
  					"""),_display_(Seq[Any](/*849.9*/survey/*849.15*/.answerFifth3)),format.raw/*849.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*852.6*/else/*852.11*/{_display_(Seq[Any](format.raw/*852.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*855.68*/survey/*855.74*/.answerFifth3)),format.raw/*855.87*/(""">
  					"""),_display_(Seq[Any](/*856.9*/survey/*856.15*/.answerFifth3)),format.raw/*856.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*859.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*862.7*/if(userAnswers.answerFifth == survey.answerFifth3)/*862.57*/ {_display_(Seq[Any](format.raw/*862.59*/("""
  				"""),_display_(Seq[Any](/*863.8*/if(survey.answerFifth3 != survey.rightAnswerFifth)/*863.58*/ {_display_(Seq[Any](format.raw/*863.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*866.68*/survey/*866.74*/.answerFifth3)),format.raw/*866.87*/(""" checked>
  					"""),_display_(Seq[Any](/*867.9*/survey/*867.15*/.answerFifth3)),format.raw/*867.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*869.7*/("""
  			""")))})),format.raw/*870.7*/("""
  			
  			"""),_display_(Seq[Any](/*872.7*/if(userAnswers.answerFifth != survey.answerFifth3)/*872.57*/ {_display_(Seq[Any](format.raw/*872.59*/("""
  				"""),_display_(Seq[Any](/*873.8*/if(survey.answerFifth3 != survey.rightAnswerFifth)/*873.58*/ {_display_(Seq[Any](format.raw/*873.60*/("""
  					"""),_display_(Seq[Any](/*874.9*/if(survey.answerFifth3 != null && survey.answerFifth3 != "")/*874.69*/ {_display_(Seq[Any](format.raw/*874.71*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*877.68*/survey/*877.74*/.answerFifth3)),format.raw/*877.87*/(""">
  					"""),_display_(Seq[Any](/*878.9*/survey/*878.15*/.answerFifth3)),format.raw/*878.28*/(""" 
  			</label>
  			""")))})),format.raw/*880.7*/("""
  			""")))})),format.raw/*881.7*/("""
  			""")))})),format.raw/*882.7*/("""
   			
   			</br>
   			</br>
                        

			
     		"""),_display_(Seq[Any](/*889.9*/if(survey.answerFifth4 == survey.rightAnswerFifth)/*889.59*/ {_display_(Seq[Any](format.raw/*889.61*/("""
			    """),_display_(Seq[Any](/*890.9*/if(userAnswers.answerFifth == survey.answerFifth4)/*890.59*/ {_display_(Seq[Any](format.raw/*890.61*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*893.68*/survey/*893.74*/.answerFifth4)),format.raw/*893.87*/(""" checked>
  					"""),_display_(Seq[Any](/*894.9*/survey/*894.15*/.answerFifth4)),format.raw/*894.28*/(""" <b>OK<b>
			</label>
			
			""")))}/*897.6*/else/*897.11*/{_display_(Seq[Any](format.raw/*897.12*/("""
			
			<label class="radio" style="color:green">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*900.68*/survey/*900.74*/.answerFifth4)),format.raw/*900.87*/(""">
  					"""),_display_(Seq[Any](/*901.9*/survey/*901.15*/.answerFifth4)),format.raw/*901.28*/(""" <b>RIGHT<b>
  			</label>
  			
  			""")))}))))})),format.raw/*904.8*/("""
  			
  			
  			"""),_display_(Seq[Any](/*907.7*/if(userAnswers.answerFifth == survey.answerFifth4)/*907.57*/ {_display_(Seq[Any](format.raw/*907.59*/("""
  				"""),_display_(Seq[Any](/*908.8*/if(survey.answerFifth4 != survey.rightAnswerFifth)/*908.58*/ {_display_(Seq[Any](format.raw/*908.60*/("""
  			
  			<label class="radio" style="color:red">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*911.68*/survey/*911.74*/.answerFifth4)),format.raw/*911.87*/(""" checked>
  					"""),_display_(Seq[Any](/*912.9*/survey/*912.15*/.answerFifth4)),format.raw/*912.28*/(""" <b>WRONG<b>
  			</label>
  			""")))})),format.raw/*914.7*/("""
  			""")))})),format.raw/*915.7*/("""
  			
  			"""),_display_(Seq[Any](/*917.7*/if(userAnswers.answerFifth != survey.answerFifth4)/*917.57*/ {_display_(Seq[Any](format.raw/*917.59*/("""
  				"""),_display_(Seq[Any](/*918.8*/if(survey.answerFifth4 != survey.rightAnswerFifth)/*918.58*/ {_display_(Seq[Any](format.raw/*918.60*/("""
  					"""),_display_(Seq[Any](/*919.9*/if(survey.answerFifth4 != null && survey.answerFifth4 != "")/*919.69*/ {_display_(Seq[Any](format.raw/*919.71*/("""
  			
  			<label class="radio">
  					<input type="radio" name="question5" id="question5" value= """),_display_(Seq[Any](/*922.68*/survey/*922.74*/.answerFifth4)),format.raw/*922.87*/(""">
  					"""),_display_(Seq[Any](/*923.9*/survey/*923.15*/.answerFifth4)),format.raw/*923.28*/("""
  			</label>
  			
  			""")))})),format.raw/*926.7*/("""
  			""")))})),format.raw/*927.7*/("""
  			""")))})),format.raw/*928.7*/("""
   			
   			</br>
   			</br>
   			</br>
   			
   			<h2>Your results is """),_display_(Seq[Any](/*934.28*/results)),format.raw/*934.35*/(""" </h2>
   			

      <div class="actions">
            <input type="submit" class="btn primary" value="Back to my surveys">
            <a href=""""),_display_(Seq[Any](/*939.23*/routes/*939.29*/.Application.index)),format.raw/*939.47*/("""" class="btn">Cancel</a>
        </div>
        

		</form>
     """)))})),format.raw/*944.7*/("""
    
""")))})))}
    }
    
    def render(survey:Survey,userAnswers:UserAnswers,form1:Form[Survey],results:String) = apply(survey,userAnswers,form1,results)
    
    def f:((Survey,UserAnswers,Form[Survey],String) => play.api.templates.Html) = (survey,userAnswers,form1,results) => apply(survey,userAnswers,form1,results)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 17 23:55:59 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/survey/checkedForm.scala.html
                    HASH: 932fa8a12e97946e98edd53d9304a59d01794d85
                    MATRIX: 800->1|1008->80|1038->137|1075->140|1134->191|1173->193|1225->211|1239->217|1293->263|1332->265|1390->287|1405->293|1433->299|1544->374|1559->380|1591->390|1701->465|1760->515|1800->517|1845->527|1904->577|1944->579|2100->699|2115->705|2150->718|2204->737|2219->743|2254->756|2305->790|2318->795|2357->796|2513->916|2528->922|2563->935|2609->946|2624->952|2659->965|2737->1008|2794->1030|2853->1080|2893->1082|2937->1091|2996->1141|3036->1143|3194->1265|3209->1271|3244->1284|3298->1303|3313->1309|3348->1322|3414->1357|3453->1365|3503->1380|3562->1430|3602->1432|3646->1441|3705->1491|3745->1493|3885->1597|3900->1603|3935->1616|3981->1627|3996->1633|4031->1646|4085->1669|4124->1677|4208->1726|4267->1776|4307->1778|4352->1788|4411->1838|4451->1840|4607->1960|4622->1966|4657->1979|4711->1998|4726->2004|4761->2017|4812->2051|4825->2056|4864->2057|5020->2177|5035->2183|5070->2196|5116->2207|5131->2213|5166->2226|5244->2269|5301->2291|5360->2341|5400->2343|5444->2352|5503->2402|5543->2404|5701->2526|5716->2532|5751->2545|5805->2564|5820->2570|5855->2583|5921->2618|5960->2626|6010->2641|6069->2691|6109->2693|6153->2702|6212->2752|6252->2754|6392->2858|6407->2864|6442->2877|6489->2888|6505->2894|6541->2907|6597->2931|6637->2939|6725->2991|6785->3041|6826->3043|6872->3053|6932->3103|6973->3105|7130->3225|7146->3231|7182->3244|7237->3263|7253->3269|7289->3282|7341->3316|7355->3321|7395->3322|7552->3442|7568->3448|7604->3461|7651->3472|7667->3478|7703->3491|7782->3534|7840->3556|7900->3606|7941->3608|7986->3617|8046->3667|8087->3669|8246->3791|8262->3797|8298->3810|8353->3829|8369->3835|8405->3848|8472->3883|8512->3891|8563->3906|8623->3956|8664->3958|8709->3967|8769->4017|8810->4019|8856->4029|8926->4089|8967->4091|9108->4195|9124->4201|9160->4214|9207->4225|9223->4231|9259->4244|9322->4275|9362->4283|9402->4291|9488->4341|9548->4391|9589->4393|9635->4403|9695->4453|9736->4455|9893->4575|9909->4581|9945->4594|10000->4613|10016->4619|10052->4632|10104->4666|10118->4671|10158->4672|10315->4792|10331->4798|10367->4811|10414->4822|10430->4828|10466->4841|10545->4884|10603->4906|10663->4956|10704->4958|10749->4967|10809->5017|10850->5019|11009->5141|11025->5147|11061->5160|11116->5179|11132->5185|11168->5198|11235->5233|11275->5241|11326->5256|11386->5306|11427->5308|11472->5317|11532->5367|11573->5369|11619->5379|11689->5439|11730->5441|11871->5545|11887->5551|11923->5564|11970->5575|11986->5581|12022->5594|12079->5619|12119->5627|12159->5635|12294->5733|12310->5739|12343->5749|12454->5824|12510->5870|12551->5872|12597->5882|12653->5928|12694->5930|12851->6050|12867->6056|12901->6067|12956->6086|12972->6092|13006->6103|13058->6137|13072->6142|13112->6143|13269->6263|13285->6269|13319->6280|13366->6291|13382->6297|13416->6308|13495->6351|13553->6373|13609->6419|13650->6421|13695->6430|13751->6476|13792->6478|13951->6600|13967->6606|14001->6617|14056->6636|14072->6642|14106->6653|14173->6688|14213->6696|14264->6711|14320->6757|14361->6759|14406->6768|14462->6814|14503->6816|14644->6920|14660->6926|14694->6937|14741->6948|14757->6954|14791->6965|14847->6989|14887->6997|14972->7046|15028->7092|15069->7094|15115->7104|15171->7150|15212->7152|15369->7272|15385->7278|15419->7289|15474->7308|15490->7314|15524->7325|15576->7359|15590->7364|15630->7365|15787->7485|15803->7491|15837->7502|15884->7513|15900->7519|15934->7530|16013->7573|16071->7595|16127->7641|16168->7643|16213->7652|16269->7698|16310->7700|16469->7822|16485->7828|16519->7839|16574->7858|16590->7864|16624->7875|16691->7910|16731->7918|16782->7933|16838->7979|16879->7981|16924->7990|16980->8036|17021->8038|17162->8142|17178->8148|17212->8159|17259->8170|17275->8176|17309->8187|17365->8211|17405->8219|17493->8271|17549->8317|17590->8319|17636->8329|17692->8375|17733->8377|17890->8497|17906->8503|17940->8514|17995->8533|18011->8539|18045->8550|18097->8584|18111->8589|18151->8590|18308->8710|18324->8716|18358->8727|18405->8738|18421->8744|18455->8755|18534->8798|18592->8820|18648->8866|18689->8868|18734->8877|18790->8923|18831->8925|18990->9047|19006->9053|19040->9064|19095->9083|19111->9089|19145->9100|19212->9135|19252->9143|19303->9158|19359->9204|19400->9206|19445->9215|19501->9261|19542->9263|19588->9273|19654->9329|19695->9331|19836->9435|19852->9441|19886->9452|19933->9463|19949->9469|19983->9480|20041->9506|20081->9514|20121->9522|20242->9607|20298->9653|20339->9655|20385->9665|20441->9711|20482->9713|20639->9833|20655->9839|20689->9850|20744->9869|20760->9875|20794->9886|20846->9920|20860->9925|20900->9926|21057->10046|21073->10052|21107->10063|21154->10074|21170->10080|21204->10091|21283->10134|21341->10156|21397->10202|21438->10204|21483->10213|21539->10259|21580->10261|21739->10383|21755->10389|21789->10400|21844->10419|21860->10425|21894->10436|21961->10471|22001->10479|22052->10494|22108->10540|22149->10542|22194->10551|22250->10597|22291->10599|22337->10609|22403->10665|22444->10667|22585->10771|22601->10777|22635->10788|22682->10799|22698->10805|22732->10816|22787->10839|22827->10847|22867->10855|23027->10978|23043->10984|23076->10994|23187->11069|23247->11119|23288->11121|23334->11131|23394->11181|23435->11183|23592->11303|23608->11309|23644->11322|23699->11341|23715->11347|23751->11360|23803->11394|23817->11399|23857->11400|24014->11520|24030->11526|24066->11539|24113->11550|24129->11556|24165->11569|24244->11612|24302->11634|24362->11684|24403->11686|24448->11695|24508->11745|24549->11747|24708->11869|24724->11875|24760->11888|24815->11907|24831->11913|24867->11926|24934->11961|24974->11969|25025->11984|25085->12034|25126->12036|25171->12045|25231->12095|25272->12097|25413->12201|25429->12207|25465->12220|25512->12231|25528->12237|25564->12250|25620->12274|25660->12282|25745->12331|25805->12381|25846->12383|25892->12393|25952->12443|25993->12445|26150->12565|26166->12571|26202->12584|26257->12603|26273->12609|26309->12622|26361->12656|26375->12661|26415->12662|26572->12782|26588->12788|26624->12801|26671->12812|26687->12818|26723->12831|26802->12874|26860->12896|26920->12946|26961->12948|27006->12957|27066->13007|27107->13009|27266->13131|27282->13137|27318->13150|27373->13169|27389->13175|27425->13188|27492->13223|27532->13231|27583->13246|27643->13296|27684->13298|27729->13307|27789->13357|27830->13359|27971->13463|27987->13469|28023->13482|28070->13493|28086->13499|28122->13512|28178->13536|28218->13544|28306->13596|28366->13646|28407->13648|28453->13658|28513->13708|28554->13710|28711->13830|28727->13836|28763->13849|28818->13868|28834->13874|28870->13887|28922->13921|28936->13926|28976->13927|29133->14047|29149->14053|29185->14066|29232->14077|29248->14083|29284->14096|29363->14139|29421->14161|29481->14211|29522->14213|29567->14222|29627->14272|29668->14274|29827->14396|29843->14402|29879->14415|29934->14434|29950->14440|29986->14453|30053->14488|30093->14496|30144->14511|30204->14561|30245->14563|30290->14572|30350->14622|30391->14624|30437->14634|30507->14694|30548->14696|30689->14800|30705->14806|30741->14819|30788->14830|30804->14836|30840->14849|30903->14880|30943->14888|30983->14896|31096->14973|31156->15023|31197->15025|31243->15035|31303->15085|31344->15087|31501->15207|31517->15213|31553->15226|31608->15245|31624->15251|31660->15264|31712->15298|31726->15303|31766->15304|31923->15424|31939->15430|31975->15443|32022->15454|32038->15460|32074->15473|32153->15516|32211->15538|32271->15588|32312->15590|32357->15599|32417->15649|32458->15651|32617->15773|32633->15779|32669->15792|32724->15811|32740->15817|32776->15830|32843->15865|32883->15873|32934->15888|32994->15938|33035->15940|33080->15949|33140->15999|33181->16001|33227->16011|33297->16071|33338->16073|33479->16177|33495->16183|33531->16196|33578->16207|33594->16213|33630->16226|33685->16249|33725->16257|33765->16265|33900->16363|33916->16369|33949->16379|34060->16454|34122->16506|34163->16508|34209->16518|34271->16570|34312->16572|34469->16692|34485->16698|34522->16712|34577->16731|34593->16737|34630->16751|34682->16785|34696->16790|34736->16791|34893->16911|34909->16917|34946->16931|34993->16942|35009->16948|35046->16962|35125->17005|35183->17027|35245->17079|35286->17081|35331->17090|35393->17142|35434->17144|35593->17266|35609->17272|35646->17286|35701->17305|35717->17311|35754->17325|35821->17360|35861->17368|35912->17383|35974->17435|36015->17437|36060->17446|36122->17498|36163->17500|36304->17604|36320->17610|36357->17624|36404->17635|36420->17641|36457->17655|36513->17679|36553->17687|36638->17736|36700->17788|36741->17790|36787->17800|36849->17852|36890->17854|37047->17974|37063->17980|37100->17994|37155->18013|37171->18019|37208->18033|37260->18067|37274->18072|37314->18073|37471->18193|37487->18199|37524->18213|37571->18224|37587->18230|37624->18244|37703->18287|37761->18309|37823->18361|37864->18363|37909->18372|37971->18424|38012->18426|38171->18548|38187->18554|38224->18568|38279->18587|38295->18593|38332->18607|38399->18642|38439->18650|38490->18665|38552->18717|38593->18719|38638->18728|38700->18780|38741->18782|38882->18886|38898->18892|38935->18906|38982->18917|38998->18923|39035->18937|39091->18961|39131->18969|39219->19021|39281->19073|39322->19075|39368->19085|39430->19137|39471->19139|39628->19259|39644->19265|39681->19279|39736->19298|39752->19304|39789->19318|39841->19352|39855->19357|39895->19358|40052->19478|40068->19484|40105->19498|40152->19509|40168->19515|40205->19529|40284->19572|40342->19594|40404->19646|40445->19648|40490->19657|40552->19709|40593->19711|40752->19833|40768->19839|40805->19853|40860->19872|40876->19878|40913->19892|40980->19927|41020->19935|41071->19950|41133->20002|41174->20004|41219->20013|41281->20065|41322->20067|41368->20077|41440->20139|41481->20141|41622->20245|41638->20251|41675->20265|41722->20276|41738->20282|41775->20296|41838->20327|41878->20335|41918->20343|42031->20420|42093->20472|42134->20474|42180->20484|42242->20536|42283->20538|42440->20658|42456->20664|42493->20678|42548->20697|42564->20703|42601->20717|42653->20751|42667->20756|42707->20757|42864->20877|42880->20883|42917->20897|42964->20908|42980->20914|43017->20928|43096->20971|43154->20993|43216->21045|43257->21047|43302->21056|43364->21108|43405->21110|43564->21232|43580->21238|43617->21252|43672->21271|43688->21277|43725->21291|43792->21326|43832->21334|43883->21349|43945->21401|43986->21403|44031->21412|44093->21464|44134->21466|44180->21476|44252->21538|44293->21540|44434->21644|44450->21650|44487->21664|44534->21675|44550->21681|44587->21695|44642->21718|44682->21726|44722->21734|44869->21844|44885->21850|44918->21860|45029->21935|45089->21985|45130->21987|45176->21997|45236->22047|45277->22049|45434->22169|45450->22175|45486->22188|45541->22207|45557->22213|45593->22226|45645->22260|45659->22265|45699->22266|45856->22386|45872->22392|45908->22405|45955->22416|45971->22422|46007->22435|46086->22478|46144->22500|46204->22550|46245->22552|46290->22561|46350->22611|46391->22613|46550->22735|46566->22741|46602->22754|46657->22773|46673->22779|46709->22792|46776->22827|46816->22835|46867->22850|46927->22900|46968->22902|47013->22911|47073->22961|47114->22963|47255->23067|47271->23073|47307->23086|47354->23097|47370->23103|47406->23116|47462->23140|47502->23148|47587->23197|47647->23247|47688->23249|47734->23259|47794->23309|47835->23311|47992->23431|48008->23437|48044->23450|48099->23469|48115->23475|48151->23488|48203->23522|48217->23527|48257->23528|48414->23648|48430->23654|48466->23667|48513->23678|48529->23684|48565->23697|48644->23740|48702->23762|48762->23812|48803->23814|48848->23823|48908->23873|48949->23875|49108->23997|49124->24003|49160->24016|49215->24035|49231->24041|49267->24054|49334->24089|49374->24097|49425->24112|49485->24162|49526->24164|49571->24173|49631->24223|49672->24225|49813->24329|49829->24335|49865->24348|49912->24359|49928->24365|49964->24378|50020->24402|50060->24410|50148->24462|50208->24512|50249->24514|50295->24524|50355->24574|50396->24576|50553->24696|50569->24702|50605->24715|50660->24734|50676->24740|50712->24753|50764->24787|50778->24792|50818->24793|50975->24913|50991->24919|51027->24932|51074->24943|51090->24949|51126->24962|51205->25005|51263->25027|51323->25077|51364->25079|51409->25088|51469->25138|51510->25140|51669->25262|51685->25268|51721->25281|51776->25300|51792->25306|51828->25319|51895->25354|51935->25362|51986->25377|52046->25427|52087->25429|52132->25438|52192->25488|52233->25490|52279->25500|52349->25560|52390->25562|52531->25666|52547->25672|52583->25685|52630->25696|52646->25702|52682->25715|52738->25739|52778->25747|52818->25755|52931->25832|52991->25882|53032->25884|53078->25894|53138->25944|53179->25946|53336->26066|53352->26072|53388->26085|53443->26104|53459->26110|53495->26123|53547->26157|53561->26162|53601->26163|53758->26283|53774->26289|53810->26302|53857->26313|53873->26319|53909->26332|53988->26375|54046->26397|54106->26447|54147->26449|54192->26458|54252->26508|54293->26510|54452->26632|54468->26638|54504->26651|54559->26670|54575->26676|54611->26689|54678->26724|54718->26732|54769->26747|54829->26797|54870->26799|54915->26808|54975->26858|55016->26860|55062->26870|55132->26930|55173->26932|55314->27036|55330->27042|55366->27055|55413->27066|55429->27072|55465->27085|55527->27115|55567->27123|55607->27131|55728->27215|55758->27222|55946->27373|55962->27379|56003->27397|56106->27468
                    LINES: 27->1|33->1|35->5|36->6|36->6|36->6|39->9|39->9|39->9|39->9|42->12|42->12|42->12|49->19|49->19|49->19|56->26|56->26|56->26|57->27|57->27|57->27|60->30|60->30|60->30|61->31|61->31|61->31|64->34|64->34|64->34|67->37|67->37|67->37|68->38|68->38|68->38|71->41|74->44|74->44|74->44|75->45|75->45|75->45|78->48|78->48|78->48|79->49|79->49|79->49|81->51|82->52|84->54|84->54|84->54|85->55|85->55|85->55|88->58|88->58|88->58|89->59|89->59|89->59|91->61|92->62|97->67|97->67|97->67|98->68|98->68|98->68|101->71|101->71|101->71|102->72|102->72|102->72|105->75|105->75|105->75|108->78|108->78|108->78|109->79|109->79|109->79|112->82|115->85|115->85|115->85|116->86|116->86|116->86|119->89|119->89|119->89|120->90|120->90|120->90|122->92|123->93|125->95|125->95|125->95|126->96|126->96|126->96|129->99|129->99|129->99|130->100|130->100|130->100|132->102|133->103|139->109|139->109|139->109|140->110|140->110|140->110|143->113|143->113|143->113|144->114|144->114|144->114|147->117|147->117|147->117|150->120|150->120|150->120|151->121|151->121|151->121|154->124|157->127|157->127|157->127|158->128|158->128|158->128|161->131|161->131|161->131|162->132|162->132|162->132|164->134|165->135|167->137|167->137|167->137|168->138|168->138|168->138|169->139|169->139|169->139|172->142|172->142|172->142|173->143|173->143|173->143|176->146|177->147|178->148|183->153|183->153|183->153|184->154|184->154|184->154|187->157|187->157|187->157|188->158|188->158|188->158|191->161|191->161|191->161|194->164|194->164|194->164|195->165|195->165|195->165|198->168|201->171|201->171|201->171|202->172|202->172|202->172|205->175|205->175|205->175|206->176|206->176|206->176|208->178|209->179|211->181|211->181|211->181|212->182|212->182|212->182|213->183|213->183|213->183|216->186|216->186|216->186|217->187|217->187|217->187|220->190|221->191|222->192|231->201|231->201|231->201|238->208|238->208|238->208|239->209|239->209|239->209|242->212|242->212|242->212|243->213|243->213|243->213|246->216|246->216|246->216|249->219|249->219|249->219|250->220|250->220|250->220|253->223|256->226|256->226|256->226|257->227|257->227|257->227|260->230|260->230|260->230|261->231|261->231|261->231|263->233|264->234|266->236|266->236|266->236|267->237|267->237|267->237|270->240|270->240|270->240|271->241|271->241|271->241|273->243|274->244|279->249|279->249|279->249|280->250|280->250|280->250|283->253|283->253|283->253|284->254|284->254|284->254|287->257|287->257|287->257|290->260|290->260|290->260|291->261|291->261|291->261|294->264|297->267|297->267|297->267|298->268|298->268|298->268|301->271|301->271|301->271|302->272|302->272|302->272|304->274|305->275|307->277|307->277|307->277|308->278|308->278|308->278|311->281|311->281|311->281|312->282|312->282|312->282|314->284|315->285|321->291|321->291|321->291|322->292|322->292|322->292|325->295|325->295|325->295|326->296|326->296|326->296|329->299|329->299|329->299|332->302|332->302|332->302|333->303|333->303|333->303|336->306|339->309|339->309|339->309|340->310|340->310|340->310|343->313|343->313|343->313|344->314|344->314|344->314|346->316|347->317|349->319|349->319|349->319|350->320|350->320|350->320|351->321|351->321|351->321|354->324|354->324|354->324|355->325|355->325|355->325|358->328|359->329|360->330|368->338|368->338|368->338|369->339|369->339|369->339|372->342|372->342|372->342|373->343|373->343|373->343|376->346|376->346|376->346|379->349|379->349|379->349|380->350|380->350|380->350|383->353|386->356|386->356|386->356|387->357|387->357|387->357|390->360|390->360|390->360|391->361|391->361|391->361|393->363|394->364|396->366|396->366|396->366|397->367|397->367|397->367|398->368|398->368|398->368|401->371|401->371|401->371|402->372|402->372|402->372|404->374|405->375|406->376|417->387|417->387|417->387|424->394|424->394|424->394|425->395|425->395|425->395|428->398|428->398|428->398|429->399|429->399|429->399|432->402|432->402|432->402|435->405|435->405|435->405|436->406|436->406|436->406|439->409|442->412|442->412|442->412|443->413|443->413|443->413|446->416|446->416|446->416|447->417|447->417|447->417|449->419|450->420|452->422|452->422|452->422|453->423|453->423|453->423|456->426|456->426|456->426|457->427|457->427|457->427|459->429|460->430|465->435|465->435|465->435|466->436|466->436|466->436|469->439|469->439|469->439|470->440|470->440|470->440|473->443|473->443|473->443|476->446|476->446|476->446|477->447|477->447|477->447|480->450|483->453|483->453|483->453|484->454|484->454|484->454|487->457|487->457|487->457|488->458|488->458|488->458|490->460|491->461|493->463|493->463|493->463|494->464|494->464|494->464|497->467|497->467|497->467|498->468|498->468|498->468|500->470|501->471|507->477|507->477|507->477|508->478|508->478|508->478|511->481|511->481|511->481|512->482|512->482|512->482|515->485|515->485|515->485|518->488|518->488|518->488|519->489|519->489|519->489|522->492|525->495|525->495|525->495|526->496|526->496|526->496|529->499|529->499|529->499|530->500|530->500|530->500|532->502|533->503|535->505|535->505|535->505|536->506|536->506|536->506|537->507|537->507|537->507|540->510|540->510|540->510|541->511|541->511|541->511|544->514|545->515|546->516|553->523|553->523|553->523|554->524|554->524|554->524|557->527|557->527|557->527|558->528|558->528|558->528|561->531|561->531|561->531|564->534|564->534|564->534|565->535|565->535|565->535|568->538|571->541|571->541|571->541|572->542|572->542|572->542|575->545|575->545|575->545|576->546|576->546|576->546|578->548|579->549|581->551|581->551|581->551|582->552|582->552|582->552|583->553|583->553|583->553|586->556|586->556|586->556|587->557|587->557|587->557|589->559|590->560|591->561|600->570|600->570|600->570|607->577|607->577|607->577|608->578|608->578|608->578|611->581|611->581|611->581|612->582|612->582|612->582|615->585|615->585|615->585|618->588|618->588|618->588|619->589|619->589|619->589|622->592|625->595|625->595|625->595|626->596|626->596|626->596|629->599|629->599|629->599|630->600|630->600|630->600|632->602|633->603|635->605|635->605|635->605|636->606|636->606|636->606|639->609|639->609|639->609|640->610|640->610|640->610|642->612|643->613|648->618|648->618|648->618|649->619|649->619|649->619|652->622|652->622|652->622|653->623|653->623|653->623|656->626|656->626|656->626|659->629|659->629|659->629|660->630|660->630|660->630|663->633|666->636|666->636|666->636|667->637|667->637|667->637|670->640|670->640|670->640|671->641|671->641|671->641|673->643|674->644|676->646|676->646|676->646|677->647|677->647|677->647|680->650|680->650|680->650|681->651|681->651|681->651|683->653|684->654|690->660|690->660|690->660|691->661|691->661|691->661|694->664|694->664|694->664|695->665|695->665|695->665|698->668|698->668|698->668|701->671|701->671|701->671|702->672|702->672|702->672|705->675|708->678|708->678|708->678|709->679|709->679|709->679|712->682|712->682|712->682|713->683|713->683|713->683|715->685|716->686|718->688|718->688|718->688|719->689|719->689|719->689|720->690|720->690|720->690|723->693|723->693|723->693|724->694|724->694|724->694|727->697|728->698|729->699|736->706|736->706|736->706|737->707|737->707|737->707|740->710|740->710|740->710|741->711|741->711|741->711|744->714|744->714|744->714|747->717|747->717|747->717|748->718|748->718|748->718|751->721|754->724|754->724|754->724|755->725|755->725|755->725|758->728|758->728|758->728|759->729|759->729|759->729|761->731|762->732|764->734|764->734|764->734|765->735|765->735|765->735|766->736|766->736|766->736|769->739|769->739|769->739|770->740|770->740|770->740|772->742|773->743|774->744|784->754|784->754|784->754|791->761|791->761|791->761|792->762|792->762|792->762|795->765|795->765|795->765|796->766|796->766|796->766|799->769|799->769|799->769|802->772|802->772|802->772|803->773|803->773|803->773|806->776|809->779|809->779|809->779|810->780|810->780|810->780|813->783|813->783|813->783|814->784|814->784|814->784|816->786|817->787|819->789|819->789|819->789|820->790|820->790|820->790|823->793|823->793|823->793|824->794|824->794|824->794|826->796|827->797|832->802|832->802|832->802|833->803|833->803|833->803|836->806|836->806|836->806|837->807|837->807|837->807|840->810|840->810|840->810|843->813|843->813|843->813|844->814|844->814|844->814|847->817|850->820|850->820|850->820|851->821|851->821|851->821|854->824|854->824|854->824|855->825|855->825|855->825|857->827|858->828|860->830|860->830|860->830|861->831|861->831|861->831|864->834|864->834|864->834|865->835|865->835|865->835|867->837|868->838|874->844|874->844|874->844|875->845|875->845|875->845|878->848|878->848|878->848|879->849|879->849|879->849|882->852|882->852|882->852|885->855|885->855|885->855|886->856|886->856|886->856|889->859|892->862|892->862|892->862|893->863|893->863|893->863|896->866|896->866|896->866|897->867|897->867|897->867|899->869|900->870|902->872|902->872|902->872|903->873|903->873|903->873|904->874|904->874|904->874|907->877|907->877|907->877|908->878|908->878|908->878|910->880|911->881|912->882|919->889|919->889|919->889|920->890|920->890|920->890|923->893|923->893|923->893|924->894|924->894|924->894|927->897|927->897|927->897|930->900|930->900|930->900|931->901|931->901|931->901|934->904|937->907|937->907|937->907|938->908|938->908|938->908|941->911|941->911|941->911|942->912|942->912|942->912|944->914|945->915|947->917|947->917|947->917|948->918|948->918|948->918|949->919|949->919|949->919|952->922|952->922|952->922|953->923|953->923|953->923|956->926|957->927|958->928|964->934|964->934|969->939|969->939|969->939|974->944
                    -- GENERATED --
                */
            