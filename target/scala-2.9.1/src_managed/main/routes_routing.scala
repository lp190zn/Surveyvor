// @SOURCE:G:/Programy/eclipse/play-2.0.4/samples/java/forms/conf/routes
// @HASH:197ec5efbbacebf6e060677937a19384511a14c1
// @DATE:Mon Dec 17 15:19:22 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Register_blank1 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:10
val controllers_Register_edit2 = Route("GET", PathPattern(List(StaticPart("/users/fakeuser"))))
                    

// @LINE:11
val controllers_Register_submit3 = Route("POST", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:14
val controllers_LoginPage_blank4 = Route("GET", PathPattern(List(StaticPart("/register"))))
                    

// @LINE:15
val controllers_LoginPage_edit5 = Route("GET", PathPattern(List(StaticPart("/register/fakecontact"))))
                    

// @LINE:16
val controllers_LoginPage_submit6 = Route("POST", PathPattern(List(StaticPart("/register"))))
                    

// @LINE:19
val controllers_CreateSurvey_newIndex7 = Route("GET", PathPattern(List(StaticPart("/createsurvey"))))
                    

// @LINE:20
val controllers_CreateSurvey_blank8 = Route("GET", PathPattern(List(StaticPart("/createsurvey/newsurvey"))))
                    

// @LINE:22
val controllers_CreateSurvey_preview9 = Route("POST", PathPattern(List(StaticPart("/createsurvey"))))
                    

// @LINE:23
val controllers_CreateSurvey_preview10 = Route("GET", PathPattern(List(StaticPart("/previewsurvey"))))
                    

// @LINE:25
val controllers_FillSurvey_viewSurvey11 = Route("GET", PathPattern(List(StaticPart("/surveys/"),DynamicPart("name", """.+"""))))
                    

// @LINE:27
val controllers_FillSurvey_checkSurvey12 = Route("GET", PathPattern(List(StaticPart("/checksurvey"))))
                    

// @LINE:29
val controllers_CreateSurvey_delete13 = Route("POST", PathPattern(List(StaticPart("/surveys/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:33
val controllers_CreateSurvey_edit14 = Route("GET", PathPattern(List(StaticPart("/editsurveys/edit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:34
val controllers_CreateSurvey_update15 = Route("POST", PathPattern(List(StaticPart("/editsurveys/edit/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:37
val controllers_Assets_at16 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/login""","""controllers.Register.blank()"""),("""GET""","""/users/fakeuser""","""controllers.Register.edit()"""),("""POST""","""/login""","""controllers.Register.submit()"""),("""GET""","""/register""","""controllers.LoginPage.blank()"""),("""GET""","""/register/fakecontact""","""controllers.LoginPage.edit()"""),("""POST""","""/register""","""controllers.LoginPage.submit()"""),("""GET""","""/createsurvey""","""controllers.CreateSurvey.newIndex()"""),("""GET""","""/createsurvey/newsurvey""","""controllers.CreateSurvey.blank()"""),("""POST""","""/createsurvey""","""controllers.CreateSurvey.preview()"""),("""GET""","""/previewsurvey""","""controllers.CreateSurvey.preview()"""),("""GET""","""/surveys/$name<.+>""","""controllers.FillSurvey.viewSurvey(name:String)"""),("""GET""","""/checksurvey""","""controllers.FillSurvey.checkSurvey()"""),("""POST""","""/surveys/$id<[^/]+>/delete""","""controllers.CreateSurvey.delete(id:Long)"""),("""GET""","""/editsurveys/edit/$id<[^/]+>""","""controllers.CreateSurvey.edit(id:Long)"""),("""POST""","""/editsurveys/edit/$id<[^/]+>""","""controllers.CreateSurvey.update(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Register_blank1(params) => {
   call { 
        invokeHandler(_root_.controllers.Register.blank(), HandlerDef(this, "controllers.Register", "blank", Nil))
   }
}
                    

// @LINE:10
case controllers_Register_edit2(params) => {
   call { 
        invokeHandler(_root_.controllers.Register.edit(), HandlerDef(this, "controllers.Register", "edit", Nil))
   }
}
                    

// @LINE:11
case controllers_Register_submit3(params) => {
   call { 
        invokeHandler(_root_.controllers.Register.submit(), HandlerDef(this, "controllers.Register", "submit", Nil))
   }
}
                    

// @LINE:14
case controllers_LoginPage_blank4(params) => {
   call { 
        invokeHandler(_root_.controllers.LoginPage.blank(), HandlerDef(this, "controllers.LoginPage", "blank", Nil))
   }
}
                    

// @LINE:15
case controllers_LoginPage_edit5(params) => {
   call { 
        invokeHandler(_root_.controllers.LoginPage.edit(), HandlerDef(this, "controllers.LoginPage", "edit", Nil))
   }
}
                    

// @LINE:16
case controllers_LoginPage_submit6(params) => {
   call { 
        invokeHandler(_root_.controllers.LoginPage.submit(), HandlerDef(this, "controllers.LoginPage", "submit", Nil))
   }
}
                    

// @LINE:19
case controllers_CreateSurvey_newIndex7(params) => {
   call { 
        invokeHandler(_root_.controllers.CreateSurvey.newIndex(), HandlerDef(this, "controllers.CreateSurvey", "newIndex", Nil))
   }
}
                    

// @LINE:20
case controllers_CreateSurvey_blank8(params) => {
   call { 
        invokeHandler(_root_.controllers.CreateSurvey.blank(), HandlerDef(this, "controllers.CreateSurvey", "blank", Nil))
   }
}
                    

// @LINE:22
case controllers_CreateSurvey_preview9(params) => {
   call { 
        invokeHandler(_root_.controllers.CreateSurvey.preview(), HandlerDef(this, "controllers.CreateSurvey", "preview", Nil))
   }
}
                    

// @LINE:23
case controllers_CreateSurvey_preview10(params) => {
   call { 
        invokeHandler(_root_.controllers.CreateSurvey.preview(), HandlerDef(this, "controllers.CreateSurvey", "preview", Nil))
   }
}
                    

// @LINE:25
case controllers_FillSurvey_viewSurvey11(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(_root_.controllers.FillSurvey.viewSurvey(name), HandlerDef(this, "controllers.FillSurvey", "viewSurvey", Seq(classOf[String])))
   }
}
                    

// @LINE:27
case controllers_FillSurvey_checkSurvey12(params) => {
   call { 
        invokeHandler(_root_.controllers.FillSurvey.checkSurvey(), HandlerDef(this, "controllers.FillSurvey", "checkSurvey", Nil))
   }
}
                    

// @LINE:29
case controllers_CreateSurvey_delete13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.CreateSurvey.delete(id), HandlerDef(this, "controllers.CreateSurvey", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:33
case controllers_CreateSurvey_edit14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.CreateSurvey.edit(id), HandlerDef(this, "controllers.CreateSurvey", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:34
case controllers_CreateSurvey_update15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.CreateSurvey.update(id), HandlerDef(this, "controllers.CreateSurvey", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:37
case controllers_Assets_at16(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                