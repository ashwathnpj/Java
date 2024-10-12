package java_package;
//all access specifier of methods within class

public class Class0027_WithinClass {
	public static void add() {
		System.out.println("Public Method is Accessed");
	}
	protected static void add1() {
		System.out.println("Protected Method is Accessed");
	}
	 static void add2() {
		System.out.println("Default Method is Accessed");
	}
	private static void add3() {
		System.out.println("Private Method is Accessed");
	}
	public static void main(String[] args) {
		add();
		add1();
		add2();
		add3();
		
	}

}
