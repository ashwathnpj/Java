package java_package;
//using switch case 

import java.util.Scanner;

public class Class0128_Switch {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter your choice (1-7): ");
        int dayNumber = s1.nextInt();
		switch (dayNumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid input. Please enter a number between 1 and 7.");
			break;
		}
	}

}
