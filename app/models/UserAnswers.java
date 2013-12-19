package models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints.*;
import play.db.ebean.Model;


@Entity 
public class UserAnswers extends Model {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5176304544177364406L;

	@Id
	public Long id;
	
	@Required
	public int number;
	
    @Required
	public String Surveytitle;
	

	@Required
    public String answerFirst;
	
	@Required
    public String answerSec;
	
	@Required
    public String answerThird;
	
	@Required
    public String answerFourth;
	
	@Required
    public String answerFifth;
	   
    
    
	/**
     * Generic query helper for entity Company with id Long
     */
    public static Model.Finder<Long,UserAnswers> find = new Model.Finder<Long,UserAnswers>(Long.class, UserAnswers.class);
    
    public static List<UserAnswers> all() {
  	  return find.all();
  	}

    
    public UserAnswers(String Surveytitle, int number, String answerFirst,String answerSec, String answerThird, String answerFourth, String answerFifth)
    
    {
	this.answerFirst = answerFirst;
	this.answerSec = answerSec;
	this.answerThird = answerThird;
	this.answerFourth = answerFourth;
	this.answerFifth = answerFifth;
	this.number = number;
    }

}