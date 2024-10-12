package java_package;
//two interface and multi-level inheritance

interface InterfaceA {
	void methodA();
}

interface InterfaceB extends InterfaceA {
	void methodB();
}

public class Class0053_MultiLevelInterface implements InterfaceB {

	@Override
	public void methodA() {
		System.out.println("Implementation of methodA from InterfaceA");

	}

	@Override
	public void methodB() {
		System.out.println("Implementation of methodB from InterfaceB");

	}

	public static void main(String[] args) {
		Class0053_MultiLevelInterface a1=new Class0053_MultiLevelInterface();
		a1.methodA();
		a1.methodB();
	}

}
