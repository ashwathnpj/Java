package java_package;

//multilevel inheritance for non-static methods

	class Superr_class{
		 void add() {
			System.out.println("Super Class is output");
		}
	}
	class Subb_class extends Superr_class{
		 void sub() {
			System.out.println("Sub Class is output");
		}
		
	}

public class Class0021_MultiLevelNS extends Subb_class{
	
	 void mul() {
		System.out.println("Child Class is output");
	}
	public static void main(String[] args) {
		Class0021_MultiLevelNS  a1=new Class0021_MultiLevelNS();
		a1.add();
		a1.sub();
		a1.mul();
		
	}

}
