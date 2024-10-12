package java_package;
//nested try and catch block
import java.util.InputMismatchException;
import java.util.Scanner;

public class Class0048_NestedTryCatch {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter an integer: ");
	            int num1 = scanner.nextInt();

	            try {
	                System.out.print("Enter another integer: ");
	                int num2 = scanner.nextInt();
	                
	                double result = (double) num1 / num2; // This may cause ArithmeticException if num2 is 0
	                System.out.println("Result of division: " + result);
	            } catch (ArithmeticException e) {
	                System.out.println("Error: Cannot divide by zero.");
	            }
	            
	        } catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter an integer.");
	        } finally {
	            scanner.close();
	        }
	    }
}
