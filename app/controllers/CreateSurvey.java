package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import models.*;
import views.html.index;

import views.html.survey.*;
import java.util.*;



public class CreateSurvey extends Controller {
	
	
	public static Result newIndex() {
        return ok(newIndex.render(Survey.all()));
    }
	
	
	/**
     * Defines a form wrapping the Contact class.
     */ 
    final static Form<Survey> newForm = form(Survey.class);
    
    
 
  
    /**
     * Display a blank form.
     */ 
    public static Result blank() {
        return ok(form.render(newForm));
    }
    
    /**
     * Not used
     */
    public static Result submit() {
    	
        Form<Survey> filledForm = newForm.bindFromRequest();
        
        
        
        // Check repeated password
        if(!filledForm.field("question").valueOr("").isEmpty()) {
            if(!filledForm.field("answer").valueOr("").isEmpty()) {
                filledForm.reject("question", "Question or answers are empty");
            }
        }
        
        if(filledForm.hasErrors()) {
            return badRequest(form.render(filledForm));
        } else {
        	Survey createdSurvey = new Survey(filledForm.get().title, filledForm.get().question1, filledForm.get().answerFirst1, filledForm.get().answerFirst2 , filledForm.get().answerFirst3, filledForm.get().answerFirst4, filledForm.get().rightAnswerFirst,
        	filledForm.get().question2, filledForm.get().answerSec1, filledForm.get().answerSec2 , filledForm.get().answerSec3, filledForm.get().answerSec4, filledForm.get().rightAnswerSec,
        	filledForm.get().question3, filledForm.get().answerThird1, filledForm.get().answerThird2 , filledForm.get().answerThird3, filledForm.get().answerThird4, filledForm.get().rightAnswerThird,
        	filledForm.get().question4, filledForm.get().answerFourth1, filledForm.get().answerFourth2 , filledForm.get().answerFourth3, filledForm.get().answerFourth4, filledForm.get().rightAnswerFourth,
        	filledForm.get().question5, filledForm.get().answerFifth1, filledForm.get().answerFifth2 , filledForm.get().answerFifth3, filledForm.get().answerFifth4, filledForm.get().rightAnswerFifth);

            createdSurvey.save();
            
            return ok(summary.render(createdSurvey));
        }  
    }
        /**
         * Handle the form submission.
         */
    
    	public static Result delete(Long id) {
    		Survey.find.ref(id).delete();
    		flash("success", "Survey has been deleted");
    		return ok(newIndex.render(Survey.all()));
    		}
    
    	
    	public static Result edit(Long id) {
    		
    		System.out.println("som tu");
    		
    		
    		Form<Survey> filledForm = form(Survey.class).fill(
    		Survey.find.byId(id)
    		);
    		return ok(editForm.render(id, filledForm));
    		}

    	public static Result update(Long id) {
    		Form<Survey> surveyForm = form(Survey.class).bindFromRequest();
    		if(surveyForm.hasErrors()) {
    		return badRequest(editForm.render(id, surveyForm));
    		}
    		surveyForm.get().update(id);
    		flash("success", "Survey " + surveyForm.get().title + " has been updated");
    		return ok(newIndex.render(Survey.all()));
    		}
    	
    	
        public static Result preview() {
        	Form<Survey> filledForm1 = newForm.bindFromRequest();
            
            
            
            // Check repeated password
             if(!filledForm1.field("question").valueOr("").isEmpty()) {
               if(!filledForm1.field("answer").valueOr("").isEmpty()) {
                    filledForm1.reject("question", "Question or answers are empty");
                }
            }
             
             if(!filledForm1.field("rightAnswerFirst").value().equals(filledForm1.field("answerFirst1").value()) && !filledForm1.field("rightAnswerFirst").value().equals(filledForm1.field("answerFirst2").value()) &&
            		 !filledForm1.field("rightAnswerFirst").value().equalsIgnoreCase(filledForm1.field("answerFirst3").value()) && !filledForm1.field("rightAnswerFirst").value().equalsIgnoreCase(filledForm1.field("answerFirst4").value())){
            		 filledForm1.reject("rightAnswerFirst", "Field Right answer is not correct");

            		 }

            		 if(!filledForm1.field("rightAnswerSec").value().equalsIgnoreCase(filledForm1.field("answerSec1").value()) && !filledForm1.field("rightAnswerSec").value().equalsIgnoreCase(filledForm1.field("answerSec2").value()) &&
            		 !filledForm1.field("rightAnswerSec").value().equalsIgnoreCase(filledForm1.field("answerSec3").value()) && !filledForm1.field("rightAnswerSec").value().equalsIgnoreCase(filledForm1.field("answerSec4").value())){
            		 filledForm1.reject("rightAnswerSec", "Field Right answer is not correct");

            		 }

            		 if(!filledForm1.field("rightAnswerThird").value().equalsIgnoreCase(filledForm1.field("answerThird1").value()) && !filledForm1.field("rightAnswerThird").value().equalsIgnoreCase(filledForm1.field("answerThird2").value()) &&
            		 !filledForm1.field("rightAnswerThird").value().equalsIgnoreCase(filledForm1.field("answerThird3").value()) && !filledForm1.field("rightAnswerThird").value().equalsIgnoreCase(filledForm1.field("answerThird4").value())){
            		 filledForm1.reject("rightAnswerThird", "Field Right answer is not correct");

            		 }

            		 if(!filledForm1.field("rightAnswerFourth").value().equalsIgnoreCase(filledForm1.field("answerFourth1").value()) && !filledForm1.field("rightAnswerFourth").value().equalsIgnoreCase(filledForm1.field("answerFourth2").value()) &&
            		 !filledForm1.field("rightAnswerFourth").value().equalsIgnoreCase(filledForm1.field("answerFourth3").value()) && !filledForm1.field("rightAnswerFourth").value().equalsIgnoreCase(filledForm1.field("answerFourth4").value())){
            		 filledForm1.reject("rightAnswerFourth", "Field Right answer is not correct");

            		 }
            		 if(!filledForm1.field("rightAnswerFifth").value().equalsIgnoreCase(filledForm1.field("answerFifth1").value()) && !filledForm1.field("rightAnswerFifth").value().equalsIgnoreCase(filledForm1.field("answerFifth2").value()) &&
            		 !filledForm1.field("rightAnswerFifth").value().equalsIgnoreCase(filledForm1.field("answerFifth3").value()) && !filledForm1.field("rightAnswerFifth").value().equalsIgnoreCase(filledForm1.field("answerFifth4").value())){
            		 filledForm1.reject("rightAnswerFifth", "Field Right answer is not correct");

            		 }
             
             //if (!filledForm1.field("rightAnswer").valueOr("").isEmpty()) {
             //    filledForm1.reject("rightAnswer", "Field Right answer is empty");
             //}
             
                 
                 
            if(filledForm1.hasErrors()) {
                return badRequest(form.render(filledForm1));
            } else {
            	      	        	
            	Survey createdSurvey = new Survey(filledForm1.get().title, filledForm1.get().question1, filledForm1.get().answerFirst1, filledForm1.get().answerFirst2 , filledForm1.get().answerFirst3, filledForm1.get().answerFirst4, filledForm1.get().rightAnswerFirst,
            			filledForm1.get().question2, filledForm1.get().answerSec1, filledForm1.get().answerSec2 , filledForm1.get().answerSec3, filledForm1.get().answerSec4, filledForm1.get().rightAnswerSec,
                    	filledForm1.get().question3, filledForm1.get().answerThird1, filledForm1.get().answerThird2 , filledForm1.get().answerThird3, filledForm1.get().answerThird4, filledForm1.get().rightAnswerThird,
                    	filledForm1.get().question4, filledForm1.get().answerFourth1, filledForm1.get().answerFourth2 , filledForm1.get().answerFourth3, filledForm1.get().answerFourth4, filledForm1.get().rightAnswerFourth,
                    	filledForm1.get().question5, filledForm1.get().answerFifth1, filledForm1.get().answerFifth2 , filledForm1.get().answerFifth3, filledForm1.get().answerFifth4, filledForm1.get().rightAnswerFifth);

                createdSurvey.save();
                
                return ok(summary.render(createdSurvey));
            }  
        }
            
            
            
            }
