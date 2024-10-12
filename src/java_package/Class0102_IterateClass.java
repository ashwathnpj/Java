package java_package;
//Iterate any collection class using Iterator

import java.util.ArrayList;
import java.util.Iterator;

public class Class0102_IterateClass {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("mobiles");
		a1.add("books");
		a1.add("watches");
		a1.add("printers");
		System.out.println("After iterating using iterator :");
		Iterator i1=a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
