
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
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(contactForm: Form[Login]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.11*/("""
    Login <small><a href=""""),_display_(Seq[Any](/*7.28*/routes/*7.34*/.LoginPage.edit)),format.raw/*7.49*/(""""></a></small>
""")))};
Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "contact")/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
    
    """),_display_(Seq[Any](/*12.6*/if(contactForm.hasErrors)/*12.31*/ {_display_(Seq[Any](format.raw/*12.33*/("""
        <div class="alert-message error">
            <p><strong>Oops</strong> Please fix all errors</p>
        </div>
    """)))})),format.raw/*16.6*/("""
    
    """),_display_(Seq[Any](/*18.6*/helper/*18.12*/.form(action = routes.LoginPage.submit, 'id -> "form")/*18.66*/ {_display_(Seq[Any](format.raw/*18.68*/("""
        
        <fieldset>

            
            """),_display_(Seq[Any](/*23.14*/inputText(
                contactForm("firstname"), 
                '_label -> "Login"
            ))),format.raw/*26.14*/("""
            
            """),_display_(Seq[Any](/*28.14*/inputPassword(
                contactForm("password"), 
                '_label -> "Password"
            ))),format.raw/*31.14*/("""
            
            
            
        </fieldset>

            
        </fieldset>
        
        <div class="actions">
            <input type="submit" class="btn primary" value="Login">
            <a href=""""),_display_(Seq[Any](/*42.23*/routes/*42.29*/.Application.index)),format.raw/*42.47*/("""" class="btn">Cancel</a>
        </div>
        
    """)))})),format.raw/*45.6*/("""
    
    
    
""")))})))}
    }
    
    def render(contactForm:Form[Login]) = apply(contactForm)
    
    def f:((Form[Login]) => play.api.templates.Html) = (contactForm) => apply(contactForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 03 18:45:08 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/login/form.scala.html
                    HASH: 6d9256e7df4db11be0dfcc259c21a561d2c1b8ba
                    MATRIX: 765->1|901->82|913->87|980->91|1043->119|1057->125|1093->140|1148->27|1176->80|1203->156|1241->159|1278->187|1318->189|1364->200|1398->225|1438->227|1595->353|1641->364|1656->370|1719->424|1759->426|1851->482|1975->584|2038->611|2168->719|2427->942|2442->948|2482->966|2567->1020
                    LINES: 27->1|32->6|32->6|34->6|35->7|35->7|35->7|37->1|39->5|40->8|42->10|42->10|42->10|44->12|44->12|44->12|48->16|50->18|50->18|50->18|50->18|55->23|58->26|60->28|63->31|74->42|74->42|74->42|77->45
                    -- GENERATED --
                */
            