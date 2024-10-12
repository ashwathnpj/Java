package java_package;
//Iterate Map value values()
import java.util.HashMap;
import java.util.Map;

public class Class0115_Values {

	public static void main(String[] args) {
		Map<String, String> data = new HashMap<>();

		// Add some key-value pairs to the map
		data.put("Name", "Ashwathnarayan");
		data.put("Occupation", "Automation Engineer");
		data.put("Country", "India");
		data.put("Email", "ashwathnpj6@gmail.com");

		for (String value : data.values()) {
			System.out.println(value);

		}

	}
}