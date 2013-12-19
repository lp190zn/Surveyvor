
package views.html

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Html("Surveyvor login"))/*1.31*/ {_display_(Seq[Any](format.raw/*1.33*/("""
    
    <h2>Register</h2>
    
    <p>
        Create new account
    </p>
    
    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*10.31*/routes/*10.37*/.Register.blank)),format.raw/*10.52*/("""">Register »</a>
    </p>
    
    <h2>Sign Up</h2>
    
    <p>
        Login to existing account
    </p>
    
    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*20.31*/routes/*20.37*/.LoginPage.blank)),format.raw/*20.53*/("""">Login »</a>
    </p>
    
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 17 23:34:27 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/index.scala.html
                    HASH: a0572e908590b7331504261134949a844c731626
                    MATRIX: 828->1|865->30|904->32|1060->152|1075->158|1112->173|1299->324|1314->330|1352->346
                    LINES: 30->1|30->1|30->1|39->10|39->10|39->10|49->20|49->20|49->20
                    -- GENERATED --
                */
            