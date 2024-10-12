package java_package;
//order of execution in between SIB, IIB, Constructor and Main method

public class Class0118_SIBOrder {

	// Static Initialization Block (SIB)
	static {
		System.out.println("Static Initialization Block (SIB) executed.");
	}

	// Instance Initialization Block (IIB)
	{
		System.out.println("Instance Initialization Block (IIB) executed.");
	}

	// Constructor
	public Class0118_SIBOrder() {
        System.out.println("Constructor executed.");
    }

	public static void main(String[] args) {
		System.out.println("Main method started.");

		Class0118_SIBOrder a1 = new Class0118_SIBOrder();
		
	}
}
