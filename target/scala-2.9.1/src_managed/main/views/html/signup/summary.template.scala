
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
object summary extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html("Account created!"), nav = "signup")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
    
    <h2>Your account:</h2>
    
    <h6>Username</h6>
    
    <p>
        """),_display_(Seq[Any](/*10.10*/user/*10.14*/.username)),format.raw/*10.23*/("""
    </p>
    
    <h6>Email</h6>
    
    <p>
        """),_display_(Seq[Any](/*16.10*/user/*16.14*/.email)),format.raw/*16.20*/("""
    </p>
    
    <h6>Password</h6>
    
    <p>
        """),_display_(Seq[Any](/*22.10*/user/*22.14*/.password)),format.raw/*22.23*/("""
    </p>
    
    <h2>Additional informations:</h2>
    
    <h6>Country</h6>
    
    <p>
        """),_display_(Seq[Any](/*30.10*/user/*30.14*/.profile.country)),format.raw/*30.30*/("""
    </p>
    
    <h6>Address</h6>
    
    <p>
        """),_display_(Seq[Any](/*36.10*/if(user.profile.address == null || user.profile.address == "")/*36.72*/ {_display_(Seq[Any](format.raw/*36.74*/("""
            <em>Not specified</em>
        """)))}/*38.11*/else/*38.16*/{_display_(Seq[Any](format.raw/*38.17*/("""
            """),_display_(Seq[Any](/*39.14*/user/*39.18*/.profile.address)),format.raw/*39.34*/("""
        """)))})),format.raw/*40.10*/("""
    </p>
    
    <h6>Age</h6>
    
    <p>
        """),_display_(Seq[Any](/*46.10*/if(user.profile.age == null)/*46.38*/ {_display_(Seq[Any](format.raw/*46.40*/("""
            <em>Not specified</em>
        """)))}/*48.11*/else/*48.16*/{_display_(Seq[Any](format.raw/*48.17*/("""
            """),_display_(Seq[Any](/*49.14*/user/*49.18*/.profile.age)),format.raw/*49.30*/("""
        """)))})),format.raw/*50.10*/("""
    </p>
    
""")))})))}
    }
    
    def render(user:User) = apply(user)
    
    def f:((User) => play.api.templates.Html) = (user) => apply(user)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 03 18:45:08 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/signup/summary.scala.html
                    HASH: 09fe5d9a5571a333a5ec0e90fbd013d1ff01ed64
                    MATRIX: 762->1|851->13|888->16|942->62|981->64|1099->146|1112->150|1143->159|1235->215|1248->219|1276->225|1371->284|1384->288|1415->297|1552->398|1565->402|1603->418|1697->476|1768->538|1808->540|1872->586|1885->591|1924->592|1974->606|1987->610|2025->626|2067->636|2157->690|2194->718|2234->720|2298->766|2311->771|2350->772|2400->786|2413->790|2447->802|2489->812
                    LINES: 27->1|30->1|32->3|32->3|32->3|39->10|39->10|39->10|45->16|45->16|45->16|51->22|51->22|51->22|59->30|59->30|59->30|65->36|65->36|65->36|67->38|67->38|67->38|68->39|68->39|68->39|69->40|75->46|75->46|75->46|77->48|77->48|77->48|78->49|78->49|78->49|79->50
                    -- GENERATED --
                */
            