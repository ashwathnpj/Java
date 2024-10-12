package java_package;
//this() calling statement

public class Class0026_thisCallingStatement {
	Class0026_thisCallingStatement(int age) {
		System.out.println(age);

	}
	Class0026_thisCallingStatement(double weight) {
		this(20);
		System.out.println(weight);

	}
	Class0026_thisCallingStatement(String name) {
		this(20.5);
		System.out.println(name);

	}
	public static void main(String[] args) {
		new Class0026_thisCallingStatement("Ashwathnarayan");
	}

}
