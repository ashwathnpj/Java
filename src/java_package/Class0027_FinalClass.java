package java_package;

//making class as final, we can't make relation with final class
final class SuperClass2 {
	// Final class
	public void displayMessage() {
		System.out.println("This is a final class method in SuperClass, we can't make relation with final class");
	}

}

public class Class0027_FinalClass // extends SuperClass2
{
	public static void main(String[] args) {
		SuperClass2 a1 = new SuperClass2();
		a1.displayMessage();
	}

}
