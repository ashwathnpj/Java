package java_package;
//all access specifier of methods within same package 
//two classes never be public in same .java file

class WithinPackage{
	public static void add() {
		System.out.println("Public Method is Accessed");
	}
	protected static void add1() {
		System.out.println("Protected Method is Accessed");
	}
	 static void add2() {
		System.out.println("Default Method is Accessed");
	}
	private static void add3() {
		System.out.println("Private Method is Accessed");
	}
}


public class Class0028_WithinPackage {
	public static void main(String[] args) {
		WithinPackage.add();
		WithinPackage.add1();
		WithinPackage.add2();
		//WithinPackage.add3();//private method not accessible
		
	}

}
