package java_package;
//Narrowing type casting

public class Class0086_Narrowing {

	public static void main(String[] args) {
		double doubleNum = 100.04; // double type
		long longNum = (long) doubleNum; // double to long (explicitly)
		int intNum = (int) longNum; // long to int (explicitly)

		System.out.println("Original double value --> " + doubleNum);
		System.out.println("After narrowing to long --> " + longNum);
		System.out.println("After narrowing to int --> " + intNum);
	}

}
