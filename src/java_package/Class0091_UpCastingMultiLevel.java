package java_package;
//UpCasting from sub class to super class in multilevel inheritance 
class Facebook3 {
	public void post() {
		System.out.println("Facebook Post Page");
	}
}

class Instagram3 extends Facebook3 {
	public void share() {
		System.out.println("Instagram Share Page");
	}
}

public class Class0091_UpCastingMultiLevel extends Instagram3 {
	public void instaLogin() {
		System.out.println("Instagram Login Page");
	}

	public void instaSignup() {
		System.out.println("Instagram  Signup Page");
	}

	public static void main(String[] args) {
		Instagram3 a1 = new Class0091_UpCastingMultiLevel();//up casting from sub class to super class
		a1.post();//super most class methods accessed 
		a1.share();//super class methods accessed 
		
	}

}
