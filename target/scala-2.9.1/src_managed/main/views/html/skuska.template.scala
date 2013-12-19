
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
object skuska extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Survey],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(surveys: List[Survey]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Html("my page"))/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/surveys/*7.17*/.size())),format.raw/*7.24*/(""" surveys</h1>
    
    <ul>
        """),_display_(Seq[Any](/*10.10*/for(survey <- surveys) yield /*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
            <li>
                """),_display_(Seq[Any](/*12.18*/survey/*12.24*/.title)),format.raw/*12.30*/("""
                
                
            </li>
        """)))})),format.raw/*16.10*/("""
    </ul>
    

    
""")))})))}
    }
    
    def render(surveys:List[Survey]) = apply(surveys)
    
    def f:((List[Survey]) => play.api.templates.Html) = (surveys) => apply(surveys)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 14 20:00:10 CET 2012
                    SOURCE: G:/Programy/eclipse/play-2.0.4/samples/java/forms/app/views/skuska.scala.html
                    HASH: dc49272b337dc492777bf80faa97e2e8d86bf180
                    MATRIX: 762->1|878->24|906->43|942->45|971->66|1010->68|1060->83|1075->90|1103->97|1176->134|1214->156|1254->158|1325->193|1340->199|1368->205|1462->267
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|39->10|39->10|39->10|41->12|41->12|41->12|45->16
                    -- GENERATED --
                */
            