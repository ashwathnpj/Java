package java_package;
//LinkedList properties
//index, null, duplicate, sort, dynamic, heterogeneous values

import java.util.Collections;
import java.util.LinkedList;

public class Class0075_LinkedListProperties {

	public static void main(String[] args) {
		LinkedList cart=new LinkedList();
		cart.add("nokia");
		cart.add("samsung");
		cart.add("vivo");
		cart.add("apple");
		System.out.println("LinkedList follows Indexing --> "+cart);
		cart.add("nokia");
		System.out.println("LinkedList accepts duplicate values --> "+cart);
		Collections.sort(cart);
		System.out.println("LinkedList can be sorted using Collections.sort --> "+cart);
		cart.add(null);
		System.out.println("LinkedList accepts null --> "+cart);
		System.out.println("LinkedList is a dynamic array for storing the elements.");
		cart.add(2000);
		System.out.println("LinkedList stores heterogeneous values --> "+cart);

	}

}
