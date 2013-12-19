
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
object preview extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Survey,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(survey: Survey):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""


"""),_display_(Seq[Any](/*4.2*/mainAfter(Html("Fill Survey"), nav = "creating")/*4.50*/ {_display_(Seq[Any](format.raw/*4.52*/("""
    
    """),_display_(Seq[Any](/*6.6*/helper/*6.12*/.form(action = routes.Register.submit)/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""
    
   
    
    <h2>"""),_display_(Seq[Any](/*10.10*/survey/*10.16*/.title)),format.raw/*10.22*/("""</h2>


    <h6>1. Question</h6>
    
    <p>
        <b>"""),_display_(Seq[Any](/*16.13*/survey/*16.19*/.question1)),format.raw/*16.29*/("""</b>
    </p>
    
    
    <form action="">
	<input type="radio" name= """),_display_(Seq[Any](/*21.29*/survey/*21.35*/.answerFirst1)),format.raw/*21.48*/(""" value= """),_display_(Seq[Any](/*21.57*/survey/*21.63*/.answerFirst1)),format.raw/*21.76*/(""" > """),_display_(Seq[Any](/*21.80*/survey/*21.86*/.answerFirst1)),format.raw/*21.99*/(""" <br> <br>
	<input type="radio" name= """),_display_(Seq[Any](/*22.29*/survey/*22.35*/.answerFirst1)),format.raw/*22.48*/(""" value= """),_display_(Seq[Any](/*22.57*/survey/*22.63*/.answerFirst2)),format.raw/*22.76*/(""" > """),_display_(Seq[Any](/*22.80*/survey/*22.86*/.answerFirst2)),format.raw/*22.99*/(""" <br> <br>
	
    

     """),_display_(Seq[Any](/*26.7*/if(survey.answerFirst3 == null || survey.answerFirst3 == "")/*26.67*/ {_display_(Seq[Any](format.raw/*26.69*/("""
            
        """)))}/*28.11*/else/*28.16*/{_display_(Seq[Any](format.raw/*28.17*/("""
            <input type="radio" name= """),_display_(Seq[Any](/*29.40*/survey/*29.46*/.answerFirst1)),format.raw/*29.59*/(""" value= """),_display_(Seq[Any](/*29.68*/survey/*29.74*/.answerFirst3)),format.raw/*29.87*/(""" > """),_display_(Seq[Any](/*29.91*/survey/*29.97*/.answerFirst3)),format.raw/*29.110*/(""" <br> <br>
        """)))})),format.raw/*30.10*/("""

     """),_display_(Seq[Any](/*32.7*/if(survey.answerFirst4 == null || survey.answerFirst4 == "")/*32.67*/ {_display_(Seq[Any](format.raw/*32.69*/("""

        """)))}/*34.11*/else/*34.16*/{_display_(Seq[Any](format.raw/*34.17*/("""
            <input type="radio" name= """),_display_(Seq[Any](/*35.40*/survey/*35.46*/.answerFirst1)),format.raw/*35.59*/(""" value= """),_display_(Seq[Any](/*35.68*/survey/*35.74*/.answerFirst4)),format.raw/*35.87*/(""" > """),_display_(Seq[Any](/*35.91*/survey/*35.97*/.answerFirst4)),format.raw/*35.110*/(""" <br> <br>
        """)))})),format.raw/*36.10*/("""
  
     
     <h6>2. Question</h6>
    
    <p>
        <b>"""),_display_(Seq[Any](/*42.13*/survey/*42.19*/.question2)),format.raw/*42.29*/("""</b>
    </p>
    
    
    <form action="">
	<input type="radio" name= """),_display_(Seq[Any](/*47.29*/survey/*47.35*/.answerSec1)),format.raw/*47.46*/(""" value= """),_display_(Seq[Any](/*47.55*/survey/*47.61*/.answerSec1)),format.raw/*47.72*/(""" > """),_display_(Seq[Any](/*47.76*/survey/*47.82*/.answerSec1)),format.raw/*47.93*/(""" <br> <br>
	<input type="radio" name= """),_display_(Seq[Any](/*48.29*/survey/*48.35*/.answerSec1)),format.raw/*48.46*/(""" value= """),_display_(Seq[Any](/*48.55*/survey/*48.61*/.answerSec2)),format.raw/*48.72*/(""" > """),_display_(Seq[Any](/*48.76*/survey/*48.82*/.answerSec2)),format.raw/*48.93*/(""" <br> <br>
	
    

     """),_display_(Seq[Any](/*52.7*/if(survey.answerSec3 == null || survey.answerSec3 == "")/*52.63*/ {_display_(Seq[Any](format.raw/*52.65*/("""
            
        """)))}/*54.11*/else/*54.16*/{_display_(Seq[Any](format.raw/*54.17*/("""
            <input type="radio" name= """),_display_(Seq[Any](/*55.40*/survey/*55.46*/.answerSec1)),format.raw/*55.57*/(""" value= """),_display_(Seq[Any](/*55.66*/survey/*55.72*/.answerSec3)),format.raw/*55.83*/(""" > """),_display_(Seq[Any](/*55.87*/survey/*55.93*/.answerSec3)),format.raw/*55.104*/(""" <br> <br>
        """)))})),format.raw/*56.10*/("""

     """),_display_(Seq[Any](/*58.7*/if(survey.answerSec4 == null || survey.answerSec4 == "")/*58.63*/ {_display_(Seq[Any](format.raw/*58.65*/("""

        """)))}/*60.11*/else/*60.16*/{_display_(Seq[Any](format.raw/*60.17*/("""
            <input type="radio" name= """),_display_(Seq[Any](/*61.40*/survey/*61.46*/.answerSec1)),format.raw/*61.57*/(""" value= """),_display_(Seq[Any](/*61.66*/survey/*61.72*/.answerSec4)),format.raw/*61.83*/(""" > """),_display_(Seq[Any](/*61.87*/survey/*61.93*/.answerSec4)),format.raw/*61.104*/(""" <br> <br>
        """)))})),format.raw/*62.10*/("""
     
     <h6>3. Question</h6>
    
    <p>
        <b>"""),_display_(Seq[Any](/*67.13*/survey/*67.19*/.question3)),format.raw/*67.29*/("""</b>
    </p>
    
    
    <form action="">
	<input type="radio" name= """),_display_(Seq[Any](/*72.29*/survey/*72.35*/.answerThird1)),format.raw/*72.48*/(""" value= """),_display_(Seq[Any](/*72.57*/survey/*72.63*/.answerThird1)),format.raw/*72.76*/(""" > """),_display_(Seq[Any](/*72.80*/survey/*72.86*/.answerThird1)),format.raw/*72.99*/(""" <br> <br>
	<input type="radio" name= """),_display_(Seq[Any](/*73.29*/survey/*73.35*/.answerThird1)),format.raw/*73.48*/(""" value= """),_display_(Seq[Any](/*73.57*/survey/*73.63*/.answerThird2)),format.raw/*73.76*/(""" > """),_display_(Seq[Any](/*73.80*/survey/*73.86*/.answerThird2)),format.raw/*73.99*/(""" <br> <br>
	
    

     """),_display_(Seq[Any](/*77.7*/if(survey.answerThird3 == null || survey.answerThird3 == "")/*77.67*/ {_display_(Seq[Any](format.raw/*77.69*/("""
            
        """)))}/*79.11*/else/*79.16*/{_display_(Seq[Any](format.raw/*79.17*/("""
            <input type="radio" name= """),_display_(Seq[Any](/*80.40*/survey/*80.46*/.answerThird1)),format.raw/*80.59*/(""" value= """),_display_(Seq[Any](/*80.68*/survey/*80.74*/.answerThird3)),format.raw/*80.87*/(""" > """),_display_(Seq[Any](/*80.91*/survey/*80.97*/.answerThird3)),format.raw/*80.110*/(""" <br> <br>
        """)))})),format.raw/*81.10*/("""

     """),_display_(Seq[Any](/*83.7*/if(survey.answerThird4 == null || survey.answerThird4 == "")/*83.67*/ {_display_(Seq[Any](format.raw/*83.69*/("""

        """)))}/*85.11*/else/*85.16*/{_display_(Seq[Any](format.raw/*85.17*/("""
            <input type="radio" name= """),_display_(Seq[Any](/*86.40*/survey/*86.46*/.answerThird1)),format.raw/*86.59*/(""" value= """),_display_(Seq[Any](/*86.68*/survey/*86.74*/.answerThird4)),format.raw/*86.87*/(""" > """),_display_(Seq[Any](/*86.91*/survey/*86.97*/.answerThird4)),format.raw/*86.110*/(""" <br> <br>
        """)))})),format.raw/*87.10*/("""
     <h6>4. Question</h6>
    
    <p>
        <b>"""),_display_(Seq[Any](/*91.13*/survey/*91.19*/.question4)),format.raw/*91.29*/("""</b>
    </p>
    
    
    <form action="">
	<input type="radio" name= """),_display_(Seq[Any](/*96.29*/survey/*96.35*/.answerFourth1)),format.raw/*96.49*/(""" value= """),_display_(Seq[Any](/*96.58*/survey/*96.64*/.answerFourth1)),format.raw/*96.78*/(""" > """),_display_(Seq[Any](/*96.82*/survey/*96.88*/.answerFourth1)),format.raw/*96.102*/(""" <br> <br>
	<input type="radio" name= """),_display_(Seq[Any](/*97.29*/survey/*97.35*/.answerFourth1)),format.raw/*97.49*/(""" value= """),_display_(Seq[Any](/*97.58*/survey/*97.64*/.answerFourth2)),format.raw/*97.78*/(""" > """),_display_(Seq[Any](/*97.82*/survey/*97.88*/.answerFourth2)),format.raw/*97.102*/(""" <br> <br>
	
    

     """),_display_(Seq[Any](/*101.7*/if(survey.answerFourth3 == null || survey.answerFourth3 == "")/*101.69*/ {_display_(Seq[Any](format.raw/*101.71*/("""
            
        """)))}/*103.11*/else/*103.16*/{_display_(Seq[Any](format.raw/*103.17*/("""
            <input type="radio" name= """),_display_(Seq[Any](/*104.40*/survey/*104.46*/.answerFourth1)),format.raw/*104.60*/(""" value= """),_display_(Seq[Any](/*104.69*/survey/*104.75*/.answerFourth3)),format.raw/*104.89*/(""" > """),_display_(Seq[Any](/*104.93*/survey/*104.99*/.answerFourth3)),format.raw/*104.113*/(""" <br> <br>
        """)))})),format.raw/*105.10*/("""

     """),_display_(Seq[Any](/*107.7*/if(survey.answerFourth4 == null || survey.answerFourth4 == "")/*107.69*/ {_display_(Seq[Any](format.raw/*107.71*/("""

        """)))}/*109.11*/else/*109.16*/{_display_(Seq[Any](format.raw/*109.17*/("""
            <input type="radio" name= """),_display_(Seq[Any](/*110.40*/survey/*110.46*/.answerFourth1)),format.raw/*110.60*/(""" value= """),_display_(Seq[Any](/*110.69*/survey/*110.75*/.answerFourth4)),format.raw/*110.89*/(""" > """),_display_(Seq[Any](/*110.93*/survey/*110.99*/.answerFourth4)),format.raw/*110.113*/(""" <br> <br>
        """)))})),format.raw/*111.10*/("""
     
     <h6>5. Question</h6>
    
    <p>
        <b>"""),_display_(Seq[Any](/*116.13*/survey/*116.19*/.question5)),format.raw/*116.29*/("""</b>
    </p>
    
    
    <form action="">
	<input type="radio" name= """),_display_(Seq[Any](/*121.29*/survey/*121.35*/.answerFifth1)),format.raw/*121.48*/(""" value= """),_display_(Seq[Any](/*121.57*/survey/*121.63*/.answerFifth1)),format.raw/*121.76*/(""" > """),_display_(Seq[Any](/*121.80*/survey/*121.86*/.answerFifth1)),format.raw/*121.99*/(""" <br> <br>
	<input type="radio" name= """),_display_(Seq[Any](/*122.29*/survey/*122.35*/.answerFifth1)),format.raw/*122.48*/(""" value= """),_display_(Seq[Any](/*122.57*/survey/*122.63*/.answerFifth2)),format.raw/*122.76*/(""" > """),_display_(Seq[Any](/*122.80*/survey/*122.86*/.answerFifth2)),format.raw/*122.99*/(""" <br> <br>
	
    

     """),_display_(Seq[Any](/*126.7*/if(survey.answerFifth3 == null || survey.answerFifth3 == "")/*126.67*/ {_display_(Seq[Any](format.raw/*126.69*/("""
            
        """)))}/*128.11*/else/*128.16*/{_display_(Seq[Any](format.raw/*128.17*/("""
            <input type="radio" name= """),_display_(Seq[Any](/*129.40*/survey/*129.46*/.answerFifth1)),format.raw/*129.59*/(""" value= """),_display_(Seq[Any](/*129.68*/survey/*129.74*/.answerFifth3)),format.raw/*129.87*/(""" > """),_display_(Seq[Any](/*129.91*/survey/*129.97*/.answerFifth3)),format.raw/*129.110*/(""" <br> <br>
        """)))})),format.raw/*130.10*/("""

     """),_display_(Seq[Any](/*132.7*/if(survey.answerFifth4 == null || survey.answerFifth4 == "")/*132.67*/ {_display_(Seq[Any](format.raw/*132.69*/("""

        """)))}/*134.11*/else/*134.16*/{_display_(Seq[Any](format.raw/*134.17*/("""
            <input type="radio" name= """),_display_(Seq[Any](/*135.40*/survey/*135.46*/.answerFifth1)),format.raw/*135.59*/(""" value= """),_display_(Seq[Any](/*135.68*/survey/*135.74*/.answerFifth4)),format.raw/*135.87*/(""" > """),_display_(Seq[Any](/*135.91*/survey/*135.97*/.answerFifth4)),format.raw/*135.110*/(""" <br> <br>
        """)))})),format.raw/*136.10*/("""
     
      <div class="actions">
            <input type="submit" class="btn primary" value="Send">
            <a href=""""),_display_(Seq[Any](/*140.23*/routes/*140.29*/.Application.index)),format.raw/*140.47*/("""" class="btn">Cancel</a>
        </div>
     """)))})),format.raw/*142.7*/("""
    
""")))})))}
    }
    
    def render(survey:Survey) = apply(survey)
    
    def f:((Survey) => play.api.templates.Html) = (survey) => apply(survey)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 15 16:20:10 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/survey/preview.scala.html
                    HASH: ee3f29f53f9652de390f8f4200b3a30ccd3a2700
                    MATRIX: 764->1|857->17|898->24|954->72|993->74|1040->87|1054->93|1100->131|1139->133|1203->161|1218->167|1246->173|1346->237|1361->243|1393->253|1507->331|1522->337|1557->350|1602->359|1617->365|1652->378|1692->382|1707->388|1742->401|1818->441|1833->447|1868->460|1913->469|1928->475|1963->488|2003->492|2018->498|2053->511|2117->540|2186->600|2226->602|2270->628|2283->633|2322->634|2399->675|2414->681|2449->694|2494->703|2509->709|2544->722|2584->726|2599->732|2635->745|2688->766|2733->776|2802->836|2842->838|2874->852|2887->857|2926->858|3003->899|3018->905|3053->918|3098->927|3113->933|3148->946|3188->950|3203->956|3239->969|3292->990|3395->1057|3410->1063|3442->1073|3556->1151|3571->1157|3604->1168|3649->1177|3664->1183|3697->1194|3737->1198|3752->1204|3785->1215|3861->1255|3876->1261|3909->1272|3954->1281|3969->1287|4002->1298|4042->1302|4057->1308|4090->1319|4154->1348|4219->1404|4259->1406|4303->1432|4316->1437|4355->1438|4432->1479|4447->1485|4480->1496|4525->1505|4540->1511|4573->1522|4613->1526|4628->1532|4662->1543|4715->1564|4760->1574|4825->1630|4865->1632|4897->1646|4910->1651|4949->1652|5026->1693|5041->1699|5074->1710|5119->1719|5134->1725|5167->1736|5207->1740|5222->1746|5256->1757|5309->1778|5408->1841|5423->1847|5455->1857|5569->1935|5584->1941|5619->1954|5664->1963|5679->1969|5714->1982|5754->1986|5769->1992|5804->2005|5880->2045|5895->2051|5930->2064|5975->2073|5990->2079|6025->2092|6065->2096|6080->2102|6115->2115|6179->2144|6248->2204|6288->2206|6332->2232|6345->2237|6384->2238|6461->2279|6476->2285|6511->2298|6556->2307|6571->2313|6606->2326|6646->2330|6661->2336|6697->2349|6750->2370|6795->2380|6864->2440|6904->2442|6936->2456|6949->2461|6988->2462|7065->2503|7080->2509|7115->2522|7160->2531|7175->2537|7210->2550|7250->2554|7265->2560|7301->2573|7354->2594|7446->2650|7461->2656|7493->2666|7607->2744|7622->2750|7658->2764|7703->2773|7718->2779|7754->2793|7794->2797|7809->2803|7846->2817|7922->2857|7937->2863|7973->2877|8018->2886|8033->2892|8069->2906|8109->2910|8124->2916|8161->2930|8226->2959|8298->3021|8339->3023|8384->3049|8398->3054|8438->3055|8516->3096|8532->3102|8569->3116|8615->3125|8631->3131|8668->3145|8709->3149|8725->3155|8763->3169|8817->3190|8863->3200|8935->3262|8976->3264|9009->3278|9023->3283|9063->3284|9141->3325|9157->3331|9194->3345|9240->3354|9256->3360|9293->3374|9334->3378|9350->3384|9388->3398|9442->3419|9542->3482|9558->3488|9591->3498|9706->3576|9722->3582|9758->3595|9804->3604|9820->3610|9856->3623|9897->3627|9913->3633|9949->3646|10026->3686|10042->3692|10078->3705|10124->3714|10140->3720|10176->3733|10217->3737|10233->3743|10269->3756|10334->3785|10404->3845|10445->3847|10490->3873|10504->3878|10544->3879|10622->3920|10638->3926|10674->3939|10720->3948|10736->3954|10772->3967|10813->3971|10829->3977|10866->3990|10920->4011|10966->4021|11036->4081|11077->4083|11110->4097|11124->4102|11164->4103|11242->4144|11258->4150|11294->4163|11340->4172|11356->4178|11392->4191|11433->4195|11449->4201|11486->4214|11540->4235|11705->4363|11721->4369|11762->4387|11842->4435
                    LINES: 27->1|30->1|33->4|33->4|33->4|35->6|35->6|35->6|35->6|39->10|39->10|39->10|45->16|45->16|45->16|50->21|50->21|50->21|50->21|50->21|50->21|50->21|50->21|50->21|51->22|51->22|51->22|51->22|51->22|51->22|51->22|51->22|51->22|55->26|55->26|55->26|57->28|57->28|57->28|58->29|58->29|58->29|58->29|58->29|58->29|58->29|58->29|58->29|59->30|61->32|61->32|61->32|63->34|63->34|63->34|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|64->35|65->36|71->42|71->42|71->42|76->47|76->47|76->47|76->47|76->47|76->47|76->47|76->47|76->47|77->48|77->48|77->48|77->48|77->48|77->48|77->48|77->48|77->48|81->52|81->52|81->52|83->54|83->54|83->54|84->55|84->55|84->55|84->55|84->55|84->55|84->55|84->55|84->55|85->56|87->58|87->58|87->58|89->60|89->60|89->60|90->61|90->61|90->61|90->61|90->61|90->61|90->61|90->61|90->61|91->62|96->67|96->67|96->67|101->72|101->72|101->72|101->72|101->72|101->72|101->72|101->72|101->72|102->73|102->73|102->73|102->73|102->73|102->73|102->73|102->73|102->73|106->77|106->77|106->77|108->79|108->79|108->79|109->80|109->80|109->80|109->80|109->80|109->80|109->80|109->80|109->80|110->81|112->83|112->83|112->83|114->85|114->85|114->85|115->86|115->86|115->86|115->86|115->86|115->86|115->86|115->86|115->86|116->87|120->91|120->91|120->91|125->96|125->96|125->96|125->96|125->96|125->96|125->96|125->96|125->96|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|130->101|130->101|130->101|132->103|132->103|132->103|133->104|133->104|133->104|133->104|133->104|133->104|133->104|133->104|133->104|134->105|136->107|136->107|136->107|138->109|138->109|138->109|139->110|139->110|139->110|139->110|139->110|139->110|139->110|139->110|139->110|140->111|145->116|145->116|145->116|150->121|150->121|150->121|150->121|150->121|150->121|150->121|150->121|150->121|151->122|151->122|151->122|151->122|151->122|151->122|151->122|151->122|151->122|155->126|155->126|155->126|157->128|157->128|157->128|158->129|158->129|158->129|158->129|158->129|158->129|158->129|158->129|158->129|159->130|161->132|161->132|161->132|163->134|163->134|163->134|164->135|164->135|164->135|164->135|164->135|164->135|164->135|164->135|164->135|165->136|169->140|169->140|169->140|171->142
                    -- GENERATED --
                */
            