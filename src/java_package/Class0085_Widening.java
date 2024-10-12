package java_package;
//Widening type casting
public class Class0085_Widening {

	public static void main(String[] args) {
		int num = 100;          // int type
        long longNum = num;     // int to long (implicitly)
        float floatNum = num;   // int to float (implicitly)
        double doubleNum = num; // int to double (implicitly)

        System.out.println("Original int value --> " + num);
        System.out.println("After widening to long --> " + longNum);
        System.out.println("After widening to float --> " + floatNum);
        System.out.println("After widening to double --> " + doubleNum);

	}

}
