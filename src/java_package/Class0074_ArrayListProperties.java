package java_package;
//ArrayList properties
//index, null, duplicate, sort, dynamic, heterogeneous values
import java.util.ArrayList;
import java.util.Collections;

public class Class0074_ArrayListProperties {

	public static void main(String[] args) {
		ArrayList cart=new ArrayList();
		cart.add("nokia");
		cart.add("samsung");
		cart.add("vivo");
		cart.add("apple");
		System.out.println("ArrayList follows Indexing --> "+cart);
		cart.add("nokia");
		System.out.println("ArrayList accepts duplicate values --> "+cart);
		Collections.sort(cart);
		System.out.println("ArrayList can be sorted using Collections.sort --> "+cart);
		cart.add(null);
		System.out.println("ArrayList accepts null --> "+cart);
		System.out.println("ArrayList is a dynamic array for storing the elements.");
		cart.add(2000);
		System.out.println("ArrayList stores heterogeneous values --> "+cart);
	}

}
