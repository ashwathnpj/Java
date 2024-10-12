package java_package;
//DownCasting from super class to sub class

class Youtube1 {
	public void login() {
		System.out.println("Youtube Login Page");
	}

	public void signup() {
		System.out.println("Youtube Signup Page");
	}
}

public class Class0090_DownCasting extends Youtube1 {
	public void instaLogin() {
		System.out.println("Instagram Login Page");
	}

	public void instaSignup() {
		System.out.println("Instagram  Signup Page");
	}

	public static void main(String[] args) {
		Youtube1 a1=new Class0090_DownCasting();
		Class0090_DownCasting a2=(Class0090_DownCasting) a1;
		//down casting is not possible, without up casting
		a1.login();
		a1.signup();
		a2.instaLogin();
		a2.instaSignup();
	}

}
