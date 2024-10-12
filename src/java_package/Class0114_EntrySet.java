package java_package;
//Iterate Map using entrySet()

import java.util.HashMap;
import java.util.Map;

public class Class0114_EntrySet {
	public static void main(String[] args) {
		Map<String, String> data = new HashMap<>();

		// Add some key-value pairs to the map
		data.put("Name", "Ashwathnarayan");
		data.put("Occupation", "Automation Engineer");
		data.put("Country", "India");
		data.put("Email", "ashwathnpj6@gmail.com");

		for (Map.Entry<String, String> entry : data.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}
}