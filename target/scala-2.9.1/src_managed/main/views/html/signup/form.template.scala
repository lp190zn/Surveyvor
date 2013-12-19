
package views.html.signup

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
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(signupForm: Form[User]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.11*/("""
    Register <small><a href=""""),_display_(Seq[Any](/*7.31*/routes/*7.37*/.Register.edit)),format.raw/*7.51*/("""">Or edit an existing user</a></small>
""")))};
Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "New Registration")/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
    
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.Register.submit)/*12.50*/ {_display_(Seq[Any](format.raw/*12.52*/("""
        
        <fieldset>
            <legend>Account informations</legend>
            
            """),_display_(Seq[Any](/*17.14*/inputText(
                signupForm("username"), 
                '_label -> "Username", 
                '_help -> "Please choose a valid username.",
                '_error -> signupForm.globalError
            ))),format.raw/*22.14*/("""
            
            """),_display_(Seq[Any](/*24.14*/inputText(
                signupForm("email"), '_label -> "Email",
                '_help -> "Enter a valid email address."
            ))),format.raw/*27.14*/("""
            
            """),_display_(Seq[Any](/*29.14*/inputPassword(
                signupForm("password"), 
                '_label -> "Password",
                '_help -> "A password must be at least 6 characters. "
            ))),format.raw/*33.14*/("""
            
            """),_display_(Seq[Any](/*35.14*/inputPassword(
                signupForm("repeatPassword"), 
                '_label -> "Repeat password",
                '_help -> "Please repeat your password again.",
                '_error -> signupForm.error("password")
            ))),format.raw/*40.14*/("""
            
        </fieldset>
        
        <fieldset>
            
            <legend>Contact informations</legend>
            
            """),_display_(Seq[Any](/*48.14*/select(
                signupForm("profile.country"), 
                options = options(Countries.list),
                '_default -> "--- Choose a country ---",
                '_label -> "Country",
                '_error -> signupForm("profile.country").error.map(_.withMessage("Please select your country"))
            ))),format.raw/*54.14*/("""
            
            """),_display_(Seq[Any](/*56.14*/textarea(
                signupForm("profile.address"), 
                '_label -> "Address", 'cols -> 50
            ))),format.raw/*59.14*/("""
            
            """),_display_(Seq[Any](/*61.14*/inputText(
                signupForm("profile.age"), 
                '_label -> "Age", 'class -> "mini",
                '_showConstraints -> false
            ))),format.raw/*65.14*/("""
              
        </fieldset>
        
        <fieldset>
            
            """),_display_(Seq[Any](/*71.14*/checkbox(
                signupForm("accept"), 
                '_label -> None, '_text -> "You aggree the Terms and conditions",
                '_showConstraints -> false
            ))),format.raw/*75.14*/("""
            
            
        </fieldset>
        
        <div class="actions">
            <input type="submit" class="btn primary" value="Sign Up">
            <a href=""""),_display_(Seq[Any](/*82.23*/routes/*82.29*/.Application.index)),format.raw/*82.47*/("""" class="btn">Cancel</a>
        </div>
        
    """)))})),format.raw/*85.6*/("""
    
""")))})))}
    }
    
    def render(signupForm:Form[User]) = apply(signupForm)
    
    def f:((Form[User]) => play.api.templates.Html) = (signupForm) => apply(signupForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 15 15:13:01 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/signup/form.scala.html
                    HASH: 444203e1eccf5bcc676e12d9075ec157d49ab8c2
                    MATRIX: 765->1|899->80|911->85|978->89|1044->120|1058->126|1093->140|1172->25|1200->78|1227->180|1265->183|1311->220|1351->222|1397->233|1412->239|1459->277|1499->279|1640->384|1878->600|1941->627|2101->765|2164->792|2365->971|2428->998|2691->1239|2878->1390|3227->1717|3290->1744|3433->1865|3496->1892|3681->2055|3807->2145|4016->2332|4230->2510|4245->2516|4285->2534|4370->2588
                    LINES: 27->1|32->6|32->6|34->6|35->7|35->7|35->7|37->1|39->5|40->8|42->10|42->10|42->10|44->12|44->12|44->12|44->12|49->17|54->22|56->24|59->27|61->29|65->33|67->35|72->40|80->48|86->54|88->56|91->59|93->61|97->65|103->71|107->75|114->82|114->82|114->82|117->85
                    -- GENERATED --
                */
            