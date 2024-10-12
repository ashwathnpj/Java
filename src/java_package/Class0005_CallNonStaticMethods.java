package java_package;
//call multiple non-static methods

public class Class0005_CallNonStaticMethods {

	public void add() {
		System.out.println("First Non Static method is called");
	}

	public void sub() {
		System.out.println("Second Non Static method is called");
	}

	public static void main(String[] args) {
		Class0005_CallNonStaticMethods a1 = new Class0005_CallNonStaticMethods();
		a1.add();
		a1.sub();

	}

}
