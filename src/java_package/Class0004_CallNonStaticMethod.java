package java_package;
//call non-static method

public class Class0004_CallNonStaticMethod {
	
	public void add() {
		System.out.println("Non Static method is called");
	}
	
	public static void main(String[] args) {
		Class0004_CallNonStaticMethod a1 = new Class0004_CallNonStaticMethod();
		a1.add();

	}

	

}
