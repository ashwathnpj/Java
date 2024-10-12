package java_package;
//LinkedHashSet properties
//index, null, duplicate, sort, dynamic, heterogeneous values

import java.util.LinkedHashSet;

public class Class0081_LinkedHashSetProperties {

	public static void main(String[] args) {
		LinkedHashSet cart=new LinkedHashSet();
		cart.add("nokia");
		cart.add("samsung");
		cart.add("vivo");
		cart.add("apple");
		System.out.println("LinkedHashSet follows Indexing --> "+cart);
		cart.add("nokia");
		System.out.println("LinkedHashSet not accepts duplicate values --> "+cart);
		//Collections.sort(cart);
		System.out.println("LinkedHashSet can't be sorted using Collections.sort, can be sorted by Converting LinkedHashSet to TreeSet");
		cart.add(null);
		System.out.println("LinkedHashSet accepts null --> "+cart);
		System.out.println("LinkedHashSet is a dynamic for storing the elements.");
		cart.add(2000);
		System.out.println("LinkedHashSet stores heterogeneous values --> "+cart);

	}

}
