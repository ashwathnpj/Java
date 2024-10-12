package java_package;
//map properties

import java.util.HashMap;
import java.util.Map;

public class Class0111_MapProperties {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<>();

		// Adding key-value pairs
		m1.put("first name", "Ashwathnarayan");
		m1.put("last name", "Joshi");
		m1.put("Gender", "Male");

		System.out.println("Value for key 'first name' is : " + m1.get("first name"));
		System.out.println("Contains key 'last name' is : " + m1.containsKey("last name"));

		// Removing a key-value pair
		m1.remove("Gender");

		// Display all key-value pairs
		for (Map.Entry<String, String> entry : m1.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}
