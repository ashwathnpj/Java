package java_package;
//try, catch and finally block

public class Class0073_TryCatchFinally {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException d) {
			System.out.println("catch block executed.");
		}
		finally {
			System.out.println("finally block will always execute.");
		}

	}

}
