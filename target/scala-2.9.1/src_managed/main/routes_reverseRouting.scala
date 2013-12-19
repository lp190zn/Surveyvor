// @SOURCE:G:/Programy/eclipse/play-2.0.4/samples/java/forms/conf/routes
// @HASH:197ec5efbbacebf6e060677937a19384511a14c1
// @DATE:Mon Dec 17 15:19:22 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:37
class ReverseAssets {
    


 
// @LINE:37
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseLoginPage {
    


 
// @LINE:16
def submit() = {
   Call("POST", "/register")
}
                                                        
 
// @LINE:14
def blank() = {
   Call("GET", "/register")
}
                                                        
 
// @LINE:15
def edit() = {
   Call("GET", "/register/fakecontact")
}
                                                        

                      
    
}
                            

// @LINE:27
// @LINE:25
class ReverseFillSurvey {
    


 
// @LINE:27
def checkSurvey() = {
   Call("GET", "/checksurvey")
}
                                                        
 
// @LINE:25
def viewSurvey(name:String) = {
   Call("GET", "/surveys/" + implicitly[PathBindable[String]].unbind("name", name))
}
                                                        

                      
    
}
                            

// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
class ReverseCreateSurvey {
    


 
// @LINE:19
def newIndex() = {
   Call("GET", "/createsurvey")
}
                                                        
 
// @LINE:23
// @LINE:22
def preview() = {
   () match {
// @LINE:22
case () if true => Call("POST", "/createsurvey")
                                                                
// @LINE:23
case () if true => Call("GET", "/previewsurvey")
                                                                    
   }
}
                                                        
 
// @LINE:29
def delete(id:Long) = {
   Call("POST", "/surveys/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:34
def update(id:Long) = {
   Call("POST", "/editsurveys/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:33
def edit(id:Long) = {
   Call("GET", "/editsurveys/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:20
def blank() = {
   Call("GET", "/createsurvey/newsurvey")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseRegister {
    


 
// @LINE:11
def submit() = {
   Call("POST", "/login")
}
                                                        
 
// @LINE:9
def blank() = {
   Call("GET", "/login")
}
                                                        
 
// @LINE:10
def edit() = {
   Call("GET", "/users/fakeuser")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:37
class ReverseAssets {
    


 
// @LINE:37
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseLoginPage {
    


 
// @LINE:16
def submit = JavascriptReverseRoute(
   "controllers.LoginPage.submit",
   """
      function() {
      return _wA({method:"POST", url:"/register"})
      }
   """
)
                                                        
 
// @LINE:14
def blank = JavascriptReverseRoute(
   "controllers.LoginPage.blank",
   """
      function() {
      return _wA({method:"GET", url:"/register"})
      }
   """
)
                                                        
 
// @LINE:15
def edit = JavascriptReverseRoute(
   "controllers.LoginPage.edit",
   """
      function() {
      return _wA({method:"GET", url:"/register/fakecontact"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:27
// @LINE:25
class ReverseFillSurvey {
    


 
// @LINE:27
def checkSurvey = JavascriptReverseRoute(
   "controllers.FillSurvey.checkSurvey",
   """
      function() {
      return _wA({method:"GET", url:"/checksurvey"})
      }
   """
)
                                                        
 
// @LINE:25
def viewSurvey = JavascriptReverseRoute(
   "controllers.FillSurvey.viewSurvey",
   """
      function(name) {
      return _wA({method:"GET", url:"/surveys/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", name)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
class ReverseCreateSurvey {
    


 
// @LINE:19
def newIndex = JavascriptReverseRoute(
   "controllers.CreateSurvey.newIndex",
   """
      function() {
      return _wA({method:"GET", url:"/createsurvey"})
      }
   """
)
                                                        
 
// @LINE:23
// @LINE:22
def preview = JavascriptReverseRoute(
   "controllers.CreateSurvey.preview",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"/createsurvey"})
      }
      if (true) {
      return _wA({method:"GET", url:"/previewsurvey"})
      }
      }
   """
)
                                                        
 
// @LINE:29
def delete = JavascriptReverseRoute(
   "controllers.CreateSurvey.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"/surveys/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:34
def update = JavascriptReverseRoute(
   "controllers.CreateSurvey.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/editsurveys/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:33
def edit = JavascriptReverseRoute(
   "controllers.CreateSurvey.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/editsurveys/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:20
def blank = JavascriptReverseRoute(
   "controllers.CreateSurvey.blank",
   """
      function() {
      return _wA({method:"GET", url:"/createsurvey/newsurvey"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseRegister {
    


 
// @LINE:11
def submit = JavascriptReverseRoute(
   "controllers.Register.submit",
   """
      function() {
      return _wA({method:"POST", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:9
def blank = JavascriptReverseRoute(
   "controllers.Register.blank",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:10
def edit = JavascriptReverseRoute(
   "controllers.Register.edit",
   """
      function() {
      return _wA({method:"GET", url:"/users/fakeuser"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:37
class ReverseAssets {
    


 
// @LINE:37
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:16
// @LINE:15
// @LINE:14
class ReverseLoginPage {
    


 
// @LINE:16
def submit() = new play.api.mvc.HandlerRef(
   controllers.LoginPage.submit(), HandlerDef(this, "controllers.LoginPage", "submit", Seq())
)
                              
 
// @LINE:14
def blank() = new play.api.mvc.HandlerRef(
   controllers.LoginPage.blank(), HandlerDef(this, "controllers.LoginPage", "blank", Seq())
)
                              
 
// @LINE:15
def edit() = new play.api.mvc.HandlerRef(
   controllers.LoginPage.edit(), HandlerDef(this, "controllers.LoginPage", "edit", Seq())
)
                              

                      
    
}
                            

// @LINE:27
// @LINE:25
class ReverseFillSurvey {
    


 
// @LINE:27
def checkSurvey() = new play.api.mvc.HandlerRef(
   controllers.FillSurvey.checkSurvey(), HandlerDef(this, "controllers.FillSurvey", "checkSurvey", Seq())
)
                              
 
// @LINE:25
def viewSurvey(name:String) = new play.api.mvc.HandlerRef(
   controllers.FillSurvey.viewSurvey(name), HandlerDef(this, "controllers.FillSurvey", "viewSurvey", Seq(classOf[String]))
)
                              

                      
    
}
                            

// @LINE:34
// @LINE:33
// @LINE:29
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
class ReverseCreateSurvey {
    


 
// @LINE:19
def newIndex() = new play.api.mvc.HandlerRef(
   controllers.CreateSurvey.newIndex(), HandlerDef(this, "controllers.CreateSurvey", "newIndex", Seq())
)
                              
 
// @LINE:22
def preview() = new play.api.mvc.HandlerRef(
   controllers.CreateSurvey.preview(), HandlerDef(this, "controllers.CreateSurvey", "preview", Seq())
)
                              
 
// @LINE:29
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.CreateSurvey.delete(id), HandlerDef(this, "controllers.CreateSurvey", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:34
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.CreateSurvey.update(id), HandlerDef(this, "controllers.CreateSurvey", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:33
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.CreateSurvey.edit(id), HandlerDef(this, "controllers.CreateSurvey", "edit", Seq(classOf[Long]))
)
                              
 
// @LINE:20
def blank() = new play.api.mvc.HandlerRef(
   controllers.CreateSurvey.blank(), HandlerDef(this, "controllers.CreateSurvey", "blank", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseRegister {
    


 
// @LINE:11
def submit() = new play.api.mvc.HandlerRef(
   controllers.Register.submit(), HandlerDef(this, "controllers.Register", "submit", Seq())
)
                              
 
// @LINE:9
def blank() = new play.api.mvc.HandlerRef(
   controllers.Register.blank(), HandlerDef(this, "controllers.Register", "blank", Seq())
)
                              
 
// @LINE:10
def edit() = new play.api.mvc.HandlerRef(
   controllers.Register.edit(), HandlerDef(this, "controllers.Register", "edit", Seq())
)
                              

                      
    
}
                            
}
                    
                