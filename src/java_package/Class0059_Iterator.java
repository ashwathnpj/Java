package java_package;
//iterate using iterator and listiterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Class0059_Iterator {
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
		System.out.println("After iterating forward using Listiterator :");
		ListIterator i2=a1.listIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("After iterating backward using Listiterator :");
		while (i2.hasPrevious()) {
            System.out.println(i2.previous());
        }
	}

}
