package java_package;
//PriorityQueue properties
//index, null, duplicate, sort, dynamic, heterogeneous values

import java.util.PriorityQueue;

public class Class0078_PriorityQueueProperties {

	public static void main(String[] args) {
		PriorityQueue cart=new PriorityQueue();
		cart.add("nokia");
		cart.add("samsung");
		cart.add("vivo");
		cart.add("apple");
		System.out.println("PriorityQueue not follows Indexing --> "+cart);
		cart.add("nokia");
		System.out.println("PriorityQueue accepts duplicate values --> "+cart);
		//Collections.sort(cart);
		System.out.println("PriorityQueue can't be sorted using Collections.sort, can be sorted by Converting PriorityQueue to ArrayList");
		//cart.add(null);
		System.out.println("PriorityQueue not accept nulls --> "+cart);
		System.out.println("PriorityQueue is a dynamic for storing the elements.");
		//cart.add(2000);
		System.out.println("PriorityQueue doesnot stores heterogeneous values");

	}

}
