package java_package;
//using logical operators (AND, OR, NOT)
import java.util.Scanner;

public class Class0017_LogicalOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your score: ");
		int score = scanner.nextInt();
		
		if (!(score > 100)) {
            System.out.println("The score is valid.");
            if (score >= 85) {
    			System.out.println("Congratulations! You have achieved a distinction.");
    		} else if (score >= 35) {

    			if (score < 85 || score >= 35) {
    				System.out.println("You have passed.");
    			}
    		} else {
    			System.out.println("Sorry, try well next time");
    		}
        } else {
            System.out.println("The score is invalid.");
        }

		
		
		scanner.close();
	}

}
