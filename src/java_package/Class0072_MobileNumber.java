package java_package;

import java.util.Scanner;

public class Class0072_MobileNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int attempts = 3;

		while (attempts > 0) {
			System.out.print("Enter your mobile number: ");
			String input = scanner.nextLine();

			if (input.length() == 10) {
				boolean isValid = true;
				for (char c : input.toCharArray()) {
					if (!Character.isDigit(c)) {
						isValid = false;
						break;
					}
				}

				if (isValid) {
					System.out.println("Mobile number accepted: " + input);
					scanner.close();
					return;
				} else {
					System.out.println("Invalid input. Please enter a 10-digit mobile number.");
				}
			} else {
				System.out.println("Invalid input. Please enter a 10-digit mobile number.");
			}

			attempts--;
			if (attempts > 0) {
				System.out.println("You have " + attempts + " attempt(s) left.");
			}
		}

		System.out.println("Failed to enter a valid mobile number.");
		scanner.close();
	}
}
