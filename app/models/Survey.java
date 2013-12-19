package models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints.*;
import play.db.ebean.Model;


@Entity 
public class Survey extends Model {
	
	private static final long serialVersionUID = -7176705388012784778L;
	
	@Id
	public Long id;
    @Required
	public String title;
	
    @Required
    public String question1;
	@Required
    public String answerFirst1;
	@Required
    public String answerFirst2;
	
    public String answerFirst3;
	
    public String answerFirst4;
    
    @Required
    public String rightAnswerFirst;
	
    @Required
    public String question2;
	@Required
    public String answerSec1;
	@Required
    public String answerSec2;
	
    public String answerSec3;
	
    public String answerSec4;
    
    @Required
    public String rightAnswerSec;
    
    @Required
    public String question3;
	@Required
    public String answerThird1;
	@Required
    public String answerThird2;
	
    public String answerThird3;
	
    public String answerThird4;
    
    @Required
    public String rightAnswerThird;
    
    @Required
    public String question4;
	@Required
    public String answerFourth1;
	@Required
    public String answerFourth2;
	
    public String answerFourth3;
	
    public String answerFourth4;
    
    @Required
    public String rightAnswerFourth;
    
    @Required
    public String question5;
	@Required
    public String answerFifth1;
	@Required
    public String answerFifth2;
	
    public String answerFifth3;
	
    public String answerFifth4;
    
    @Required
    public String rightAnswerFifth;
    
    
    
	/**
     * Generic query helper for entity Company with id Long
     */
    public static Model.Finder<Long,Survey> find = new Model.Finder<Long,Survey>(Long.class, Survey.class);
    
    public static List<Survey> all() {
  	  return find.all();
  	}

    
    public Survey(String title,String question1,String answerFirst1, String answerFirst2, String answerFirst3 ,String answerFirst4, String rightAnswerFirst,
    		String question2,String answerSec1, String answerSec2, String answerSec3 ,String answerSec4, String rightAnswerSec,
    		String question3,String answerThird1, String answerThird2, String answerThird3 ,String answerThird4, String rightAnswerThird,
    		String question4,String answerFourth1, String answerFourth2, String answerFourth3 ,String answerFourth4, String rightAnswerFourth,
    		String question5,String answerFifth1, String answerFifth2, String answerFifth3 ,String answerFifth4, String rightAnswerFifth
    		
    		) {
		this.title = title;
		this.question1=question1;
    	this.answerFirst1 = answerFirst1;
        this.answerFirst2= answerFirst2;
        this.answerFirst3 = answerFirst3;
        this.answerFirst4 = answerFirst4;
        this.rightAnswerFirst = rightAnswerFirst;
        
		this.question2=question2;
    	this.answerSec1 = answerSec1;
        this.answerSec2= answerSec2;
        this.answerSec3 = answerSec3;
        this.answerSec4 = answerSec4;
        this.rightAnswerSec = rightAnswerSec;
        
        this.question3=question3;
    	this.answerThird1 = answerThird1;
        this.answerThird2= answerThird2;
        this.answerThird3 = answerThird3;
        this.answerThird4 = answerThird4;
        this.rightAnswerThird = rightAnswerThird;
        
        this.question4=question4;
    	this.answerFourth1 = answerFourth1;
        this.answerFourth2= answerFourth2;
        this.answerFourth3 = answerFourth3;
        this.answerFourth4 = answerFourth4;
        this.rightAnswerFourth = rightAnswerFourth;
        
        this.question5=question5;
    	this.answerFifth1 = answerFifth1;
        this.answerFifth2= answerFifth2;
        this.answerFifth3 = answerFifth3;
        this.answerFifth4 = answerFifth4;
        this.rightAnswerFifth = rightAnswerFifth;
 
      
    }

}