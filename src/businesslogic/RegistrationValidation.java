package businesslogic;
public class RegistrationValidation{
	public boolean checkUserDetails(String email,String password,String confirmpassword) {
		if((vaildPassword(password,confirmpassword)) && (vaildEmail(email))) {
			return true;
		}
		else {
			return false;
		}
	}
	private boolean vaildPassword(String password, String confirmpassword) {
		// TODO Auto-generated method stub
		System.out.println("Enter password");
		if((password.equals(confirmpassword)) && (password.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})")) && (password!=null)) {
			System.out.println("Enter if statement");
			return true;
		}
		else {
		return false;
		}
	}
	private boolean vaildEmail(String email) {
		// TODO Auto-generated method stub
		if((email.matches(("^[A-Za-z0-9+_.]+@(.+)$")) &&(email!=null))){
			return true;
		}
		else {
		return false;
	}
	
	}
}
