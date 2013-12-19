
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
object summary extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Survey,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(survey: Survey):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""


"""),_display_(Seq[Any](/*4.2*/mainAfter(Html("Survey created!"), nav = "creating")/*4.54*/ {_display_(Seq[Any](format.raw/*4.56*/("""
    
    <h2>Survey</h2>
    <h5>Title</h5>
    <p>
        """),_display_(Seq[Any](/*9.10*/survey/*9.16*/.title)),format.raw/*9.22*/("""
    </p>
    <h6>1. Question</h6>
    
    <p>
        """),_display_(Seq[Any](/*14.10*/survey/*14.16*/.question1)),format.raw/*14.26*/("""
    </p>
    
    
    <p>
    
     A.   """),_display_(Seq[Any](/*20.12*/survey/*20.18*/.answerFirst1)),format.raw/*20.31*/("""
    
   
    
   
     B.   """),_display_(Seq[Any](/*25.12*/survey/*25.18*/.answerFirst2)),format.raw/*25.31*/("""
      
   
    
    
     C.	"""),_display_(Seq[Any](/*30.10*/if(survey.answerFirst3 == null || survey.answerFirst3 == "")/*30.70*/ {_display_(Seq[Any](format.raw/*30.72*/("""
            <em>Not specified</em>
        """)))}/*32.11*/else/*32.16*/{_display_(Seq[Any](format.raw/*32.17*/("""
            """),_display_(Seq[Any](/*33.14*/survey/*33.20*/.answerFirst3)),format.raw/*33.33*/("""
        """)))})),format.raw/*34.10*/("""
       
    
    
    
    
     D.  """),_display_(Seq[Any](/*40.11*/if(survey.answerFirst4 == null || survey.answerFirst4 == "")/*40.71*/ {_display_(Seq[Any](format.raw/*40.73*/("""
            <em>Not specified</em>
        """)))}/*42.11*/else/*42.16*/{_display_(Seq[Any](format.raw/*42.17*/("""
            """),_display_(Seq[Any](/*43.14*/survey/*43.20*/.answerFirst4)),format.raw/*43.33*/("""
        """)))})),format.raw/*44.10*/("""
        
     </br>
     </br>
     
     Right Answer: """),_display_(Seq[Any](/*49.21*/survey/*49.27*/.rightAnswerFirst)),format.raw/*49.44*/("""
     
     
    </p>
    
    <h6>2. Question</h6>
    
    <p>
        """),_display_(Seq[Any](/*57.10*/survey/*57.16*/.question2)),format.raw/*57.26*/("""
    </p>
    
    
    <p>
    
     A.   """),_display_(Seq[Any](/*63.12*/survey/*63.18*/.answerSec1)),format.raw/*63.29*/("""
    
   
    
   
     B.   """),_display_(Seq[Any](/*68.12*/survey/*68.18*/.answerSec2)),format.raw/*68.29*/("""
      
   
    
    
     C.	"""),_display_(Seq[Any](/*73.10*/if(survey.answerSec3 == null || survey.answerSec3 == "")/*73.66*/ {_display_(Seq[Any](format.raw/*73.68*/("""
            <em>Not specified</em>
        """)))}/*75.11*/else/*75.16*/{_display_(Seq[Any](format.raw/*75.17*/("""
            """),_display_(Seq[Any](/*76.14*/survey/*76.20*/.answerSec3)),format.raw/*76.31*/("""
        """)))})),format.raw/*77.10*/("""
       
    
    
    
    
     D.  """),_display_(Seq[Any](/*83.11*/if(survey.answerSec4 == null || survey.answerSec4 == "")/*83.67*/ {_display_(Seq[Any](format.raw/*83.69*/("""
            <em>Not specified</em>
        """)))}/*85.11*/else/*85.16*/{_display_(Seq[Any](format.raw/*85.17*/("""
            """),_display_(Seq[Any](/*86.14*/survey/*86.20*/.answerSec4)),format.raw/*86.31*/("""
        """)))})),format.raw/*87.10*/("""
        
     </br>
     </br>
     
     Right Answer: """),_display_(Seq[Any](/*92.21*/survey/*92.27*/.rightAnswerSec)),format.raw/*92.42*/("""
     
     
    </p>
    
    <h6>3. Question</h6>
    
    <p>
        """),_display_(Seq[Any](/*100.10*/survey/*100.16*/.question3)),format.raw/*100.26*/("""
    </p>
    
    
    <p>
    
     A.   """),_display_(Seq[Any](/*106.12*/survey/*106.18*/.answerThird1)),format.raw/*106.31*/("""
    
   
    
   
     B.   """),_display_(Seq[Any](/*111.12*/survey/*111.18*/.answerThird2)),format.raw/*111.31*/("""
      
   
    
    
     C.	"""),_display_(Seq[Any](/*116.10*/if(survey.answerThird3 == null || survey.answerThird3 == "")/*116.70*/ {_display_(Seq[Any](format.raw/*116.72*/("""
            <em>Not specified</em>
        """)))}/*118.11*/else/*118.16*/{_display_(Seq[Any](format.raw/*118.17*/("""
            """),_display_(Seq[Any](/*119.14*/survey/*119.20*/.answerThird3)),format.raw/*119.33*/("""
        """)))})),format.raw/*120.10*/("""
       
    
    
    
    
     D.  """),_display_(Seq[Any](/*126.11*/if(survey.answerThird4 == null || survey.answerThird4 == "")/*126.71*/ {_display_(Seq[Any](format.raw/*126.73*/("""
            <em>Not specified</em>
        """)))}/*128.11*/else/*128.16*/{_display_(Seq[Any](format.raw/*128.17*/("""
            """),_display_(Seq[Any](/*129.14*/survey/*129.20*/.answerThird4)),format.raw/*129.33*/("""
        """)))})),format.raw/*130.10*/("""
        
     </br>
     </br>
     
     Right Answer: """),_display_(Seq[Any](/*135.21*/survey/*135.27*/.rightAnswerThird)),format.raw/*135.44*/("""
     
     
    </p>
     
     <h6>4. Question</h6>
    
    <p>
        """),_display_(Seq[Any](/*143.10*/survey/*143.16*/.question4)),format.raw/*143.26*/("""
    </p>
    
    
    <p>
    
     A.   """),_display_(Seq[Any](/*149.12*/survey/*149.18*/.answerFourth1)),format.raw/*149.32*/("""
    
   
    
   
     B.   """),_display_(Seq[Any](/*154.12*/survey/*154.18*/.answerFourth2)),format.raw/*154.32*/("""
      
   
    
    
     C.	"""),_display_(Seq[Any](/*159.10*/if(survey.answerFourth3 == null || survey.answerFourth3 == "")/*159.72*/ {_display_(Seq[Any](format.raw/*159.74*/("""
            <em>Not specified</em>
        """)))}/*161.11*/else/*161.16*/{_display_(Seq[Any](format.raw/*161.17*/("""
            """),_display_(Seq[Any](/*162.14*/survey/*162.20*/.answerFourth3)),format.raw/*162.34*/("""
        """)))})),format.raw/*163.10*/("""
       
    
    
    
    
     D.  """),_display_(Seq[Any](/*169.11*/if(survey.answerFourth4 == null || survey.answerFourth4 == "")/*169.73*/ {_display_(Seq[Any](format.raw/*169.75*/("""
            <em>Not specified</em>
        """)))}/*171.11*/else/*171.16*/{_display_(Seq[Any](format.raw/*171.17*/("""
            """),_display_(Seq[Any](/*172.14*/survey/*172.20*/.answerFourth4)),format.raw/*172.34*/("""
        """)))})),format.raw/*173.10*/("""
        
     </br>
     </br>
     
     Right Answer: """),_display_(Seq[Any](/*178.21*/survey/*178.27*/.rightAnswerFourth)),format.raw/*178.45*/("""
     
     
    </p>
    
    <h6>5. Question</h6>
    
    <p>
        """),_display_(Seq[Any](/*186.10*/survey/*186.16*/.question5)),format.raw/*186.26*/("""
    </p>
    
    
    <p>
    
     A.   """),_display_(Seq[Any](/*192.12*/survey/*192.18*/.answerFifth1)),format.raw/*192.31*/("""
    
   
    
   
     B.   """),_display_(Seq[Any](/*197.12*/survey/*197.18*/.answerFifth2)),format.raw/*197.31*/("""
      
   
    
    
     C.	"""),_display_(Seq[Any](/*202.10*/if(survey.answerFifth3 == null || survey.answerFifth3 == "")/*202.70*/ {_display_(Seq[Any](format.raw/*202.72*/("""
            <em>Not specified</em>
        """)))}/*204.11*/else/*204.16*/{_display_(Seq[Any](format.raw/*204.17*/("""
            """),_display_(Seq[Any](/*205.14*/survey/*205.20*/.answerFifth3)),format.raw/*205.33*/("""
        """)))})),format.raw/*206.10*/("""
       
    
    
    
    
     D.  """),_display_(Seq[Any](/*212.11*/if(survey.answerFifth4 == null || survey.answerFifth4 == "")/*212.71*/ {_display_(Seq[Any](format.raw/*212.73*/("""
            <em>Not specified</em>
        """)))}/*214.11*/else/*214.16*/{_display_(Seq[Any](format.raw/*214.17*/("""
            """),_display_(Seq[Any](/*215.14*/survey/*215.20*/.answerFifth4)),format.raw/*215.33*/("""
        """)))})),format.raw/*216.10*/("""
        
     </br>
     </br>
     
     Right Answer: """),_display_(Seq[Any](/*221.21*/survey/*221.27*/.rightAnswerFifth)),format.raw/*221.44*/("""
     
     
    </p>
     
    
    
""")))})))}
    }
    
    def render(survey:Survey) = apply(survey)
    
    def f:((Survey) => play.api.templates.Html) = (survey) => apply(survey)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 15 16:16:12 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/survey/summary.scala.html
                    HASH: 1ef35a192fe3683a9f1c64f147d9ceda62bfe433
                    MATRIX: 764->1|857->17|898->24|958->76|997->78|1099->145|1113->151|1140->157|1238->219|1253->225|1285->235|1371->285|1386->291|1421->304|1492->339|1507->345|1542->358|1614->394|1683->454|1723->456|1789->504|1802->509|1841->510|1892->525|1907->531|1942->544|1985->555|2066->600|2135->660|2175->662|2241->710|2254->715|2293->716|2344->731|2359->737|2394->750|2437->761|2536->824|2551->830|2590->847|2708->929|2723->935|2755->945|2841->995|2856->1001|2889->1012|2960->1047|2975->1053|3008->1064|3080->1100|3145->1156|3185->1158|3251->1206|3264->1211|3303->1212|3354->1227|3369->1233|3402->1244|3445->1255|3526->1300|3591->1356|3631->1358|3697->1406|3710->1411|3749->1412|3800->1427|3815->1433|3848->1444|3891->1455|3990->1518|4005->1524|4042->1539|4161->1621|4177->1627|4210->1637|4297->1687|4313->1693|4349->1706|4421->1741|4437->1747|4473->1760|4546->1796|4616->1856|4657->1858|4724->1906|4738->1911|4778->1912|4830->1927|4846->1933|4882->1946|4926->1957|5008->2002|5078->2062|5119->2064|5186->2112|5200->2117|5240->2118|5292->2133|5308->2139|5344->2152|5388->2163|5488->2226|5504->2232|5544->2249|5665->2333|5681->2339|5714->2349|5801->2399|5817->2405|5854->2419|5926->2454|5942->2460|5979->2474|6052->2510|6124->2572|6165->2574|6232->2622|6246->2627|6286->2628|6338->2643|6354->2649|6391->2663|6435->2674|6517->2719|6589->2781|6630->2783|6697->2831|6711->2836|6751->2837|6803->2852|6819->2858|6856->2872|6900->2883|7000->2946|7016->2952|7057->2970|7176->3052|7192->3058|7225->3068|7312->3118|7328->3124|7364->3137|7436->3172|7452->3178|7488->3191|7561->3227|7631->3287|7672->3289|7739->3337|7753->3342|7793->3343|7845->3358|7861->3364|7897->3377|7941->3388|8023->3433|8093->3493|8134->3495|8201->3543|8215->3548|8255->3549|8307->3564|8323->3570|8359->3583|8403->3594|8503->3657|8519->3663|8559->3680
                    LINES: 27->1|30->1|33->4|33->4|33->4|38->9|38->9|38->9|43->14|43->14|43->14|49->20|49->20|49->20|54->25|54->25|54->25|59->30|59->30|59->30|61->32|61->32|61->32|62->33|62->33|62->33|63->34|69->40|69->40|69->40|71->42|71->42|71->42|72->43|72->43|72->43|73->44|78->49|78->49|78->49|86->57|86->57|86->57|92->63|92->63|92->63|97->68|97->68|97->68|102->73|102->73|102->73|104->75|104->75|104->75|105->76|105->76|105->76|106->77|112->83|112->83|112->83|114->85|114->85|114->85|115->86|115->86|115->86|116->87|121->92|121->92|121->92|129->100|129->100|129->100|135->106|135->106|135->106|140->111|140->111|140->111|145->116|145->116|145->116|147->118|147->118|147->118|148->119|148->119|148->119|149->120|155->126|155->126|155->126|157->128|157->128|157->128|158->129|158->129|158->129|159->130|164->135|164->135|164->135|172->143|172->143|172->143|178->149|178->149|178->149|183->154|183->154|183->154|188->159|188->159|188->159|190->161|190->161|190->161|191->162|191->162|191->162|192->163|198->169|198->169|198->169|200->171|200->171|200->171|201->172|201->172|201->172|202->173|207->178|207->178|207->178|215->186|215->186|215->186|221->192|221->192|221->192|226->197|226->197|226->197|231->202|231->202|231->202|233->204|233->204|233->204|234->205|234->205|234->205|235->206|241->212|241->212|241->212|243->214|243->214|243->214|244->215|244->215|244->215|245->216|250->221|250->221|250->221
                    -- GENERATED --
                */
            