package java_package;
//try catch handling inside 1 try block
public class Class0072_TryCatchHandling {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException d) {
			System.out.println("catch block executed.");
		}

	}

}
