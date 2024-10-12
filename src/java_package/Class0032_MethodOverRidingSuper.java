package java_package;
//method overriding using super keyword
//here parent class is not suppressed
//getting parent class method along with child class method 

class Parent_Class1 {
	void login() {
		System.out.println("email login");
	}
}
public class Class0032_MethodOverRidingSuper extends Parent_Class1{
	void login() {
		super.login();
		System.out.println("mobile login");
	}

	public static void main(String[] args) {
		Class0032_MethodOverRidingSuper m1 = new Class0032_MethodOverRidingSuper();
		m1.login();
	}

}
