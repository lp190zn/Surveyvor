package controllers;

import java.util.List;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Page;

import play.*;
import play.mvc.*;
import play.data.*;
import scala.collection.parallel.ParIterableLike.Find;

import views.html.*;
import views.html.login.*;



import models.*;

public class LoginPage extends Controller {
    
    /**
     * Defines a form wrapping the Contact class.
     */ 
    final static Form<Login> contactForm = form(Login.class);
  
    /**
     * Display a blank form.
     */ 
    public static Result blank() {

    	return ok(form.render(contactForm));
    }
  
    public static Result edit() {
        Login existingContact = new Login(
            "Fake", "Contact");
        return ok(form.render(contactForm.fill(existingContact)));
    }
  
    /**
     * Handle the form submission.
     */
    public static Result submit() {
        Form<Login> filledForm = contactForm.bindFromRequest();
        
        List<User> users = User.find.where()
        	    .ilike("username", filledForm.get().firstname).ilike("password", filledForm.get().password).findList();
        
        if(filledForm.hasErrors() || users.size() == 0) {
            
        	filledForm.reject("firstname", "Please, check login...");
        	filledForm.reject("password", "Please, check password...");
        	return badRequest(form.render(filledForm));

        } else {
            Login created = filledForm.get();
            
            return ok(summary.render(created));

        }
    }
  
}