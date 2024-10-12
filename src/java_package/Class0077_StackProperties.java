package java_package;
//Stack properties
//index, null, duplicate, sort, dynamic, heterogeneous values

import java.util.Collections;
import java.util.Stack;


public class Class0077_StackProperties {

	public static void main(String[] args) {
		Stack cart=new Stack();
		cart.add("nokia");
		cart.add("samsung");
		cart.add("vivo");
		cart.add("apple");
		System.out.println("Stack follows Indexing --> "+cart);
		cart.add("nokia");
		System.out.println("Stack accepts duplicate values --> "+cart);
		Collections.sort(cart);
		System.out.println("Stack can be sorted using Collections.sort --> "+cart);
		cart.add(null);
		System.out.println("Stack accepts null --> "+cart);
		System.out.println("Stack is a dynamic for storing the elements.");
		cart.add(2000);
		System.out.println("Stack stores heterogeneous values --> "+cart);

	}

}
