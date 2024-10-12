package java_package;
//LinkedList all methods 

import java.util.Iterator;
import java.util.LinkedList;

public class Class0057_LinkedListMethods {
	public static void main(String[] args) {
		LinkedList a1 = new LinkedList();
		a1.add("mobiles");
		a1.add("books");
		System.out.println("ArrayList a1 is --> " + a1);
		a1.clear();
		System.out.println("After clearing ArrayList a1 will be --> " + a1);
		a1.add("mobiles");
		a1.add("books");
		a1.add("watches");
		a1.add("printers");
		System.out.println("ArrayList a1 after adding mobiles and books --> " + a1);
		LinkedList b1 = new LinkedList();
		b1.add("clothes");
		b1.add("camera");
		System.out.println("ArrayList b1 is --> " + b1);
		a1.addAll(b1);
		System.out.println("After adding b1 to a1 --> " + a1);
		a1.addFirst("clothes");
		System.out.println("After adding clothes to first --> " + a1);
		a1.addLast("shirts");
		System.out.println("After adding shirts to last --> " + a1);
		System.out.println("Is a1 contains watches? --> " + a1.contains("watches"));
		System.out.println("The first value of a1 is --> " + a1.getFirst());
		System.out.println("The last value of a1 is --> " + a1.getLast());
		
		System.out.print("Elements in reverse order is ");
		Iterator c1 = a1.descendingIterator();
		while (c1.hasNext()) {
			System.out.print(c1.next() + ",");
		}

		

	}

}
