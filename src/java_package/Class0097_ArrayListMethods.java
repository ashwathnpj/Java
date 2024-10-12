package java_package;
//ArrayList all methods 

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Class0097_ArrayListMethods {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("mobiles");
		a1.add("books");
		a1.add("watches");
		a1.add("printers");
		System.out.println("ArrayList a1 is --> "+a1);
		ArrayList b1=new ArrayList();
		b1.add("clothes");
		b1.add("camera");
		System.out.println("ArrayList b1 is --> "+b1);
		a1.addAll(b1);
		System.out.println("After adding b1 to a1 --> "+a1);
		a1.addAll(2, b1);
		System.out.println("After adding b1 to 2nd index --> "+a1);
		System.out.println("The 1st index value of a1 is--> "+a1.get(1));
		a1.set(6, "laptop");
		System.out.println("After replacing 6th index to laptop of a1 is --> "+a1);
		System.out.println("Is a1 contains the value books --> "+a1.contains("books"));
		System.out.println("Is a1 conatins b1 ? --> "+a1.containsAll(b1));
		a1.ensureCapacity(8);//we can't print,it only modifies the internal capacity
		System.out.println("The index position of mobile in a1 is --> "+a1.indexOf("mobiles"));
		a1.remove(2);
		System.out.println("After removing the 2nd index of a1 --> "+a1);
		a1.removeAll(b1);
		System.out.println("After removing b1 from a1 --> "+a1);
		
		UnaryOperator<String> c1= s -> s.equals("printers") ? "shirts" : s;
        a1.replaceAll(c1); //replaces all printers with shirts
		System.out.println("After replacing all printers with shirts --> "+a1);
		
		a1.clear();
		System.out.println("After clearing a1 --> "+a1);
		System.out.println("Is a1 is empty? --> "+a1.isEmpty());
	}

}
