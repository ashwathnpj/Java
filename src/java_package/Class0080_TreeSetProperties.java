package java_package;
//TreeSet properties
//index, null, duplicate, sort, dynamic, heterogeneous values
//index, null, duplicate, sort, dynamic, heterogeneous values
//index, null, duplicate, sort, dynamic, heterogeneous values
import java.util.TreeSet;

public class Class0080_TreeSetProperties {

	public static void main(String[] args) {
		TreeSet cart=new TreeSet();
		cart.add("nokia");
		cart.add("samsung");
		cart.add("vivo");
		cart.add("apple");
		System.out.println("TreeSet not follows Indexing --> "+cart);
		cart.add("nokia");
		System.out.println("TreeSet not accepts duplicate values --> "+cart);
		System.out.println("TreeSet sorted by default"+cart);
		//cart.add(null);
		System.out.println("TreeSet not accept null --> "+cart);
		System.out.println("TreeSet is a dynamic for storing the elements.");
		//cart.add(2000);
		System.out.println("TreeSet not stores heterogeneous values");

	}

}
