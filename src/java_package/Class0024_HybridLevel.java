package java_package;
//hybrid level inheritance with 4 classes,method to any class,
//check whether it is achievable or not?

class Grandparent {
	void newGrandparent() {
		System.out.println("Grandparent class");
	}
}

class Class1 extends Grandparent {
	void newClass1() {
		System.out.println("Class1 class");
	}
}

class Parent extends Grandparent {
	void newParent() {
		System.out.println("Parent class");
	}
}

class Child extends Parent {
	void newChild() {
		System.out.println("Child class");
	}
}


public class Class0024_HybridLevel {
	public static void main(String[] args) {
		Child child = new Child();

		child.newGrandparent();
		child.newParent();
		child.newChild();
		/* child.newClass1();//It will show Error */
		

	}

}
