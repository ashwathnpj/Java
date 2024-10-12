package java_package;
//method overloading
public class Class0020_MethodOverloading {
	public static void login(int a) {
		System.out.println("first method is called");
	}

	public static void login(int a, int b) {
		System.out.println("second method is called");

	}

	public static void login(int a, String b) {
		System.out.println("third method is called");

	}

	public static void main(String[] args) {
		login(10);
		login(10,20);
		login(10,"email");

	}

}
