package java_package;
//UpCasting from sub class to super class in multilevel inheritance 
class Facebook4 {
	public void post() {
		System.out.println("Facebook Post Page");
	}
}

class Instagram4 extends Facebook4 {
	public void share() {
		System.out.println("Instagram Share Page");
	}
}

public class Class0092_UpCastingMultiLevel1 extends Instagram4 {
	public void instaLogin() {
		System.out.println("Instagram Login Page");
	}

	public void instaSignup() {
		System.out.println("Instagram  Signup Page");
	}

	public static void main(String[] args) {
		Facebook4 a1 = new Class0092_UpCastingMultiLevel1();//up casting from sub class to super most class
		a1.post();//only super most class methods accessed
		
		
	}

}


