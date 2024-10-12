package java_package;
//stringbuffer methods

public class Class0100_StringBuffer {
	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer();
		// Using insert() method
		b1.insert(0, "Electronics ");
		System.out.println("After insert: " + b1);

		// Using append() method
		b1.append("mobiles");
		System.out.println("After append: " + b1);

		// Using replace() method
		b1.replace(0, 11, "Devices");
		System.out.println("After replace: " + b1);

		// Using delete() method
		b1.delete(8, 15);
		System.out.println("After delete: " + b1);

		// Using substring() method
		String substr = b1.substring(0, 6);
		System.out.println("Substring: " + substr);

		// Using charAt() method
		char ch = b1.charAt(0);
		System.out.println("Character at index 0: " + ch);

		// Using setCharAt() method
		b1.setCharAt(0, 'B');
		System.out.println("After setCharAt: " + b1);

		// Using length() method
		int length = b1.length();
		System.out.println("Length: " + length);

		// Using capacity() method
		int capacity = b1.capacity();
		System.out.println("Capacity: " + capacity);

		// Using ensureCapacity() method
		b1.ensureCapacity(50);
		System.out.println("Capacity after ensureCapacity: " + b1.capacity());

		// Using reverse() method
		b1.reverse();
		System.out.println("After reverse: " + b1);

		// Using toString() method
		String str = b1.toString();
		System.out.println("StringBuffer to String: " + str);

	}
}
