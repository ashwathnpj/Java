package java_package;
//Compile Time polymorphism 
public class Class0121_CPolymorphism {
	public int add(int a, int b) {
		return a + b;
	}
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Class0121_CPolymorphism a1 = new Class0121_CPolymorphism();
		
		System.out.println("Sum of 5 and 10 is " + a1.add(5, 10));

		System.out.println("Sum of 5, 10, and 15 is " + a1.add(5, 10, 15));

		System.out.println("Sum of 5.5 and 10.5 is " + a1.add(5.5, 10.5));

	}

}
