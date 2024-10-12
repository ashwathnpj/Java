package java_package;
//StringBuilder Methods

public class Class0109_StringBuilderMethods {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		// Append strings
		sb.append("mobiles ");
		sb.append("books ");
		sb.append("printers ");
		sb.append("watches ");
		System.out.println("After append: " + sb.toString());

		// Insert a string at a specific index
		sb.insert(13, " and ");
		System.out.println("After insert: " + sb.toString());

		// Replace a substring
		sb.replace(8, 13, "laptops");
		System.out.println("After replace: " + sb.toString());

		// Delete a substring
		sb.delete(30, 39);
		System.out.println("After delete: " + sb.toString());

		// substring
		String substr = sb.substring(0, 15);
		System.out.println("Substring: " + substr);

		// character at a specific index
		char ch = sb.charAt(5);
		System.out.println("Character at index 5: " + ch);

		// length
		int length = sb.length();
		System.out.println("Length: " + length);

		// current capacity
		int capacity = sb.capacity();
		System.out.println("Capacity: " + capacity);

		// Ensure a minimum capacity
		sb.ensureCapacity(100);
		System.out.println("Capacity after ensureCapacity: " + sb.capacity());

		// Convert StringBuilder to a String
		String str = sb.toString();
		System.out.println("StringBuilder to String: " + str);

		// Reverse the StringBuilder content
		sb.reverse();
		System.out.println("After reverse: " + sb.toString());

	}

}
