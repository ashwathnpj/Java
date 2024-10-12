package java_package;
//check override is possible or not by making parent method final

class Parent_Class2 {
	void login() { // final void login() it means that the method cannot be overridden by any
					// subclass.
		System.out.println("email login");
	}
}

public class Class0033_OverRidingFinal extends Parent_Class2 {
	void login() {

		System.out.println("mobile login");
	}

	public static void main(String[] args) {
		Class0033_OverRidingFinal m1 = new Class0033_OverRidingFinal();
		m1.login();
	}

}
