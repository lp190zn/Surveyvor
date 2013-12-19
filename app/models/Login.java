package models;

import java.util.*;

import javax.persistence.*;
import javax.validation.*;

import play.data.validation.Constraints.*;
import play.db.jpa.JPA;

@Entity 
@SequenceGenerator(name = "users_seq", sequenceName = "users_seq")
public class Login {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
	public Long id;
    
	@Required
    public String firstname = "";
    
    @Required
    public String password = "";
    
   
    public Login() {}
    
    public Login(String firstname, String password) {
        this.firstname = firstname;
        this.password = password;

        }
    
    public static Login findByName(String name) {
        return JPA.em().find(Login.class, name);
    }
    
    
}
    
