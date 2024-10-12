package java_package;
//LinkedList  getFirst(),getLast() methods

import java.util.LinkedList;

public class Class0094_LinkedListMethods1 {

	public static void main(String[] args) {
		LinkedList a1 = new LinkedList();
		a1.add("mobiles");
		a1.add("books");
		a1.add("watches");
		a1.add("printers");
		System.out.println("LinkedList a1 is --> " + a1);
		System.out.println("The first value of a1 is --> " + a1.getFirst());
		System.out.println("The last value of a1 is --> " + a1.getLast());

	}

}
