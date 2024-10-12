package java_package;
//Iterate Map keys using keySet()

import java.util.HashMap;
import java.util.Map;

public class Class0113_KeySet {
	public static void main(String[] args) {
		Map<String, String> data = new HashMap<>();

        // Add some key-value pairs to the map
        data.put("Name", "Ashwathnarayan");
        data.put("Occupation", "Automation Engineer");
        data.put("Country", "India");
        data.put("Email", "ashwathnpj6@gmail.com");

        System.out.println("Keys in the map:");
        for (String key : data.keySet()) {
            System.out.println("Key: " + key);
	}

}
}