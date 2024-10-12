package java_package;
//forward iterate using listiterator

import java.util.ArrayList;
import java.util.ListIterator;

public class Class0103_ForwardListIterator {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("mobiles");
		a1.add("books");
		a1.add("watches");
		a1.add("printers");
		System.out.println("After iterating forward using Listiterator :");
		ListIterator i2 = a1.listIterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
