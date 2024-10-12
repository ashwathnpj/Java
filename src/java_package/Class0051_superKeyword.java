package java_package;
//super keyword (in overriding, parent class implementation along with child class) 
class Instagram {
	public void login() {
System.out.println("Instagram email login");
	}

	public void password() {
		System.out.println("Instagram email password");
	}
}

public class Class0051_superKeyword extends Instagram{
	public void login() {
		super.login();
		System.out.println("Instagram mobile number login");
	}

	public void password() {
		super.password();
		System.out.println("Instagram mobile number password");
	}

	public static void main(String[] args) {
		Class0051_superKeyword a1=new Class0051_superKeyword();
		a1.login();
		a1.password();
		

	}

}
