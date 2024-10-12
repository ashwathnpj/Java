package java_package;
//UpCasting from sub class to super class

class Youtube{
	public void login() {
		System.out.println("Youtube Login Page");
	}
	public void signup() {
		System.out.println("Youtube Signup Page");
	}
}

public class Class0089_UpCasting extends Youtube{
	public void instaLogin() {
		System.out.println("Instagram Login Page");
	}
	public void instaSignup() {
		System.out.println("Instagram  Signup Page");
	}
	

	public static void main(String[] args) {
		Youtube a1=new Class0089_UpCasting();
		System.out.println("Sub class converted to Super Class ");
		a1.login();
		a1.signup();
		
		//a1.instaLogin(); //only parent class methods can accessed
		//a1.instaSignup();//only parent class methods can accessed

	}

}
