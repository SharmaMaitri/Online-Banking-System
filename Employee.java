
import java.io.Serializable;


public class Employee implements Serializable {
	  
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String email;
    private String repassword;
    private String password;
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
   
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
   
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
  
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}