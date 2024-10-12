package java_package;
//methods overriding

class Parent_Class {
	void login() {
		System.out.println("email login");
	}
}

public class Class0031_MethodOverRiding extends Parent_Class {
	void login() {

		System.out.println("mobile login, here email login(parent class methods) is overrided");
	}

	public static void main(String[] args) {
		Class0031_MethodOverRiding m1 = new Class0031_MethodOverRiding();
		m1.login();
	}

}
