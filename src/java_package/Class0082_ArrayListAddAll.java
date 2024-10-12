package java_package;

import java.util.ArrayList;

public class Class0082_ArrayListAddAll {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("nokia");
		a1.add("samsung");
		a1.add("vivo");
		System.out.println("ArrayList a1 is --> "+a1);
		ArrayList b1 = new ArrayList();
		b1.add("realme");
		b1.add("apple");
		System.out.println("ArrayList b1 is --> "+b1);
		a1.addAll(1, b1);
		System.out.println("After adding b1 to a1 at index 1 --> "+a1);

	}

}
