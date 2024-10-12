package java_package;
//HashSet properties
//index, null, duplicate, sort, dynamic, heterogeneous values

import java.util.Collections;
import java.util.HashSet;

public class Class0079_HashSetProperties {

	public static void main(String[] args) {
		HashSet cart=new HashSet();
		cart.add("nokia");
		cart.add("samsung");
		cart.add("vivo");
		cart.add("apple");
		System.out.println("HashSet not follows Indexing --> "+cart);
		cart.add("nokia");
		System.out.println("HashSet not accepts duplicate values --> "+cart);
		//Collections.sort(cart);
		System.out.println("HashSet can't be sorted using Collections.sort, can be sorted by Converting HashSet to ArrayList");
		cart.add(null);
		System.out.println("HashSet accepts null --> "+cart);
		System.out.println("HashSet is a dynamic for storing the elements.");
		cart.add(2000);
		System.out.println("HashSet stores heterogeneous values --> "+cart);

	}

}
