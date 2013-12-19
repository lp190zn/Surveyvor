package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.*;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;

@Entity 
public class User extends Model {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -7176705388012784778L;


	@Id
	public Long id;
	
	@Required
    @MinLength(4)
    public String username;
    
    @Required
    @Email
    public String email;
    
    @Required
    @MinLength(6)
    public String password;

    @Valid
    public Profile profile;
    
    public static Finder<Long,User> find = new Finder<Long,User>(Long.class,User.class); 
    
    public User() {}
    
    public User(String username, String email, String password, Profile profile) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.profile = profile;
    }
    
    
    
    public static class Profile {
        
        @Required
        public String country;
        
        public String address;
        
        @Min(18) @Max(100)
        public Integer age;
        
        public Profile() {}
        
        public Profile(String country, String address, Integer age) {
            this.country = country;
            this.address = address;
            this.age = age;
        }
        
    }
    
}