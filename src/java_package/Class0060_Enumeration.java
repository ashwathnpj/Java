package java_package;
//Iterate using Enumeration

import java.util.Enumeration;
import java.util.Vector;

public class Class0060_Enumeration {

	public static void main(String[] args) {
		Vector a1=new Vector();
		a1.add("mobiles");
		a1.add("books");
		a1.add("watches");
		a1.add("printers");
		 Enumeration e1=a1.elements();
		 System.out.println("After iterating using Enumeration:");
	        while (e1.hasMoreElements()) {
	            System.out.println(e1.nextElement());
	        }
	}

}
