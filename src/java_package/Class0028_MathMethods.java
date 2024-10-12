package java_package;
//math class(final) and its methods(static) 

public class Class0028_MathMethods {
	public static void main(String[] args) {
		// Absolute value
        int number = -10;
        System.out.println("Absolute value of " + number + " is " + Math.abs(number));

        // Square root
        double num = 16.0;
        System.out.println("Square root of " + num + " is " + Math.sqrt(num));

        // Power
        double base = 2.0;
        double exponent = 3.0;
        System.out.println(base + " raised to the power of " + exponent + " is " + Math.pow(base, exponent));

        // Random number
        double randomValue = Math.random(); // Returns a double between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println("Random value is " + randomValue);

        // Using Math class global variables
        System.out.println("Value of PI is " + Math.PI);
        System.out.println("Value of Euler's number is " + Math.E);
	}

}
