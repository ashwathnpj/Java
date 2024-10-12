package java_package;
// throw and throws 

public class Class0069_ThrowThrows {

	public static void main(String[] args) throws IllegalArgumentException {
		int number = -10;
		if (number < 0) {
			throw new IllegalArgumentException("Negative number not allowed.");
		}
		System.out.println("Number is valid.");
	}

}
