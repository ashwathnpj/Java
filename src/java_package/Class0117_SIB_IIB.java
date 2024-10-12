package java_package;
//SIB and IIB

public class Class0117_SIB_IIB {
	// Static Initialization Block (SIB)
	static {
		System.out.println("Static Initialization Block (SIB) executed.");
	}

	// Instance Initialization Block (IIB)
	{
		System.out.println("Instance Initialization Block (IIB) executed.");
	}

	public static void main(String[] args) {
		new Class0117_SIB_IIB();

	}

}
