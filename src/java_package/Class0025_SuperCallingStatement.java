package java_package;
//super() calling statement for parameterized and non parameterized

class Nation {
	Nation(String NationName) {
		System.out.println("This is the constructor of Nation.");
	}
	
}
class Country extends Nation {

	Country() {
		super("Bharata");
		System.out.println("This is the constructor of Country.");
	}
}

class State extends Country {

	State() {

		super();
		System.out.println("This is the constructor of State.");
	}
}


public class Class0025_SuperCallingStatement {
	public static void main(String[] args) {

		State a1 = new State();
	}

}
