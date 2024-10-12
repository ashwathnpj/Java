package java_package;
//Iterate Map using entrySet.iterator
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class0116_EntrySetIterator {

	public static void main(String[] args) {
		Map<String, String> data = new HashMap<>();

		// Add some key-value pairs to the map
		data.put("Name", "Ashwathnarayan");
		data.put("Occupation", "Test Engineer");
		data.put("Country", "India");
		data.put("Email", "ashwathnpj6@gmail.com");

		Iterator<Map.Entry<String, String>> i1 = data.entrySet().iterator();

		while (i1.hasNext()) {
			Map.Entry<String, String> e1 = i1.next();
			String key = e1.getKey();
			String value = e1.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}

	}

}
