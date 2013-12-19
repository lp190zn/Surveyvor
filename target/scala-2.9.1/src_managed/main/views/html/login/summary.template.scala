
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
object summary extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Login,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(login: Login):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.16*/(""" 

"""),_display_(Seq[Any](/*3.2*/mainAfterlogin(Html("Login Accepted"), nav = "login")/*3.55*/ {_display_(Seq[Any](format.raw/*3.57*/("""
    
    <h4>Hello """),_display_(Seq[Any](/*5.16*/login/*5.21*/.firstname)),format.raw/*5.31*/(""" !</h4>
    
  
    
""")))})))}
    }
    
    def render(login:Login) = apply(login)
    
    def f:((Login) => play.api.templates.Html) = (login) => apply(login)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 03 18:45:08 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/login/summary.scala.html
                    HASH: d6b416035631ff07c96ba69bb4e7347c93b95d47
                    MATRIX: 762->1|853->15|891->19|952->72|991->74|1047->95|1060->100|1091->110
                    LINES: 27->1|30->1|32->3|32->3|32->3|34->5|34->5|34->5
                    -- GENERATED --
                */
            