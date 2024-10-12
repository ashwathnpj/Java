package java_package;
//exception handling using try and catch block 

public class Class0071_ExceptionHandling {

	public static void main(String[] args) throws ArithmeticException {
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException d) {
			System.out.println("Exception Handled");
		}

	}

}
