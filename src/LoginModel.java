
public class LoginModel {
	public boolean authenticate(String user, String pwd) {
		if(pwd.length()==0 || pwd.trim()=="") {
			return false;
		}
		return true;
		
	}
}
