package java_package;
//Vector properties
//index, null, duplicate, sort, dynamic, heterogeneous values
import java.util.Collections;
import java.util.Vector;


public class Class0076_VectorProperties {

	public static void main(String[] args) {
		Vector cart=new Vector();
		cart.add("nokia");
		cart.add("samsung");
		cart.add("vivo");
		cart.add("apple");
		System.out.println("Vector follows Indexing --> "+cart);
		cart.add("nokia");
		System.out.println("Vector accepts duplicate values --> "+cart);
		Collections.sort(cart);
		System.out.println("Vector can be sorted using Collections.sort --> "+cart);
		cart.add(null);
		System.out.println("Vector accepts null --> "+cart);
		System.out.println("Vector is a dynamic for storing the elements.");
		cart.add(2000);
		System.out.println("Vector stores heterogeneous values --> "+cart);

	}

}
