package java_package;
//multiple level inheritance using interface

interface Interface1 {
	void methodA();
}

interface Interface2 {
	void methodB();
}

public class Class0054_MultipleLevelInterface implements Interface1, Interface2 {

	@Override
	public void methodA() {
		System.out.println("Implementation of methodA from Interface1");

	}

	@Override
	public void methodB() {
		System.out.println("Implementation of methodB from Interface2");

	}

	public static void main(String[] args) {
		Class0054_MultipleLevelInterface a1 = new Class0054_MultipleLevelInterface();
		a1.methodA();
		a1.methodB();

	}

}
