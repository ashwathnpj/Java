package java_package;
//conditional operators

public class Class0008_ConditionalOperators {

	public static void main(String[] args) {
		int number = 25;
		boolean isEven = (number % 2 == 0);
		boolean isPositive = (number > 0);

		if (isEven && isPositive) {
			System.out.println(number + " is even and positive.");
		} else if (isEven && !isPositive) {
			System.out.println(number + " is even but not positive.");
		} else if (!isEven && isPositive) {
			System.out.println(number + " is odd and positive.");
		} else {
			System.out.println(number + " is odd and not positive.");
		}
	}

}
