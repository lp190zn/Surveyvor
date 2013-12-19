package controllers;

import java.util.List;

import models.Survey;
import models.UserAnswers;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.templates.ScalaTemplateCompiler.Params;
import views.html.index;
import views.html.signup.form;
import views.html.signup.summary;
import views.html.survey.preview;
import views.html.survey.form2;
import views.html.survey.checkedForm;

public class FillSurvey extends Controller {

	final static Form<Survey> surveyForm = form(Survey.class);
	
		public static String title;
		public static int number = 0;
	
	public static Result viewSurvey(String name) {

		title = name;
	
    	System.out.println(name);
    	System.out.println("som vo viewSurvey");
        
    	List<Survey> surveys = Survey.find.where()
        	    .ilike("title", name).findList();
    	
    	System.out.println(surveys.size());
        
        
        //System.out.println("meno> " + surveys.get(0).title);
           
        
        Survey createdSurvey = new Survey(surveys.get(0).title, surveys.get(0).question1, surveys.get(0).answerFirst1, surveys.get(0).answerFirst2 , surveys.get(0).answerFirst3, surveys.get(0).answerFirst4, surveys.get(0).rightAnswerFirst,
        		surveys.get(0).question2, surveys.get(0).answerSec1, surveys.get(0).answerSec2 , surveys.get(0).answerSec3, surveys.get(0).answerSec4, surveys.get(0).rightAnswerSec,
        		surveys.get(0).question3, surveys.get(0).answerThird1, surveys.get(0).answerThird2 , surveys.get(0).answerThird3, surveys.get(0).answerThird4, surveys.get(0).rightAnswerThird,
        		surveys.get(0).question4, surveys.get(0).answerFourth1, surveys.get(0).answerFourth2 , surveys.get(0).answerFourth3, surveys.get(0).answerFourth4, surveys.get(0).rightAnswerFourth,
        		surveys.get(0).question5, surveys.get(0).answerFifth1, surveys.get(0).answerFifth2 , surveys.get(0).answerFifth3,surveys.get(0).answerFifth4, surveys.get(0).rightAnswerFifth);


            
            //return ok(preview.render(createdSurvey));
            
            
            return ok(form2.render(createdSurvey, surveyForm));

        
    }
	
	public static Result checkSurvey() {

		Form<Survey> filledForm = surveyForm.bindFromRequest();
        
		
		System.out.println("heheh" + title);
		
		List<Survey> surveys = Survey.find.where()
        	    .ilike("title", title).findList();
    	
    	System.out.println(surveys.size());
    	
    	System.out.println("spravna odpoved> " + surveys.get(0).rightAnswerFirst);
		
    	if (!filledForm.field("question1").value().equalsIgnoreCase(surveys.get(0).rightAnswerFirst)) {
    		System.out.println("prva nespravne");
    		filledForm.field("question1"); }
    	else {
    		System.out.println("prva spravne");
    		}
    	
    	if (!filledForm.field("question2").value().equalsIgnoreCase(surveys.get(0).rightAnswerSec)) {
    		System.out.println("druha nespravne");
    		filledForm.field("question2"); }
    	else {
    		System.out.println("druha spravne");
    		}
    	
    	if (!filledForm.field("question3").value().equalsIgnoreCase(surveys.get(0).rightAnswerThird)) {
    		System.out.println("tretia nespravne");
    		filledForm.field("question3"); }
    	else {
    		System.out.println("tretia spravne");
    		}
    	
    	if (!filledForm.field("question4").value().equalsIgnoreCase(surveys.get(0).rightAnswerFourth)) {
    		System.out.println("stvrta nespravne");
    		filledForm.field("question4"); }
    	else {
    		System.out.println("stvrta spravne");
    		}
    	
    	if (!filledForm.field("question5").value().equalsIgnoreCase(surveys.get(0).rightAnswerFifth)) {
    		System.out.println("piata nespravne");
    		filledForm.field("question5"); }
    	else {
    		System.out.println("piata spravne");
    		}

		
        System.out.println(filledForm.field("question1").value());
        System.out.println(filledForm.field("question2").value());
        System.out.println(filledForm.field("question3").value());
        System.out.println(filledForm.field("question4").value());
        System.out.println(filledForm.field("question5").value());
        
        UserAnswers userAnswers = new UserAnswers(surveys.get(0).title, number, filledForm.field("question1").value(), filledForm.field("question2").value(), filledForm.field("question3").value(),filledForm.field("question4").value(),filledForm.field("question5").value());
        userAnswers.save();
        
        number++;
        
        String results = getPoints(filledForm.field("question1").value(),surveys.get(0).rightAnswerFirst, filledForm.field("question2").value(),surveys.get(0).rightAnswerSec, filledForm.field("question3").value(),surveys.get(0).rightAnswerThird, 
        		filledForm.field("question4").value(),surveys.get(0).rightAnswerFourth, filledForm.field("question5").value(),surveys.get(0).rightAnswerFifth);
        
        Survey createdSurvey = new Survey(surveys.get(0).title, surveys.get(0).question1, surveys.get(0).answerFirst1, surveys.get(0).answerFirst2 , surveys.get(0).answerFirst3, surveys.get(0).answerFirst4, surveys.get(0).rightAnswerFirst,
        		surveys.get(0).question2, surveys.get(0).answerSec1, surveys.get(0).answerSec2 , surveys.get(0).answerSec3, surveys.get(0).answerSec4, surveys.get(0).rightAnswerSec,
        		surveys.get(0).question3, surveys.get(0).answerThird1, surveys.get(0).answerThird2 , surveys.get(0).answerThird3, surveys.get(0).answerThird4, surveys.get(0).rightAnswerThird,
        		surveys.get(0).question4, surveys.get(0).answerFourth1, surveys.get(0).answerFourth2 , surveys.get(0).answerFourth3, surveys.get(0).answerFourth4, surveys.get(0).rightAnswerFourth,
        		surveys.get(0).question5, surveys.get(0).answerFifth1, surveys.get(0).answerFifth2 , surveys.get(0).answerFifth3,surveys.get(0).answerFifth4, surveys.get(0).rightAnswerFifth);
            
        return ok(checkedForm.render(createdSurvey, userAnswers, filledForm, results));
	}
	
	public static String getPoints (String user1, String right1, String user2, String right2, String user3, String right3, String user4, String right4, String user5, String right5) {
		
		int i = 0;
		
		if (user1.equals(right1)) {
			i++;
		}
		
		if (user2.equals(right2)) {
			i++;
		}
		
		if (user3.equals(right3)) {
			i++;
		}
		
		if (user4.equals(right4)) {
			i++;
		}
		
		if (user5.equals(right5)) {
			i++;
		}
		
		System.out.println(String.valueOf(i) + " / 5");
		
		return String.valueOf(i) + " / 5";
	}

}