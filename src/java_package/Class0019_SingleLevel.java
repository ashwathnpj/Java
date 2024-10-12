package java_package;
//to implement Single Level Inheritance(Class) 

class Father {
	static void house() {
		System.out.println("house output");
	}
}

public class Class0019_SingleLevel extends Father{
	static void bike() {
		System.out.println("bike output");
	}

	public static void main(String[] args) {
		bike();
		house();
	}

	

}
