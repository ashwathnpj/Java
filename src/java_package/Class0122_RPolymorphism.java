package java_package;
//Run Time polymorphism 

class Super_Class1 {
	public void register() {
		System.out.println("1");
	}

	public void login() {
		System.out.println("2");
	}

}

public class Class0122_RPolymorphism extends Super_Class1 {
	public void register() {
		System.out.println("3");
	}

	public void login() {
		System.out.println("4");
	}

	public static void main(String[] args) {

		Class0122_RPolymorphism a1 = new Class0122_RPolymorphism();

		a1.register();
		a1.login();
	}

}
