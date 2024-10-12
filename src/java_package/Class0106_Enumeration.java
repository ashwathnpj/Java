package java_package;
//program for Enumeration(cursor)

import java.util.Enumeration;
import java.util.Vector;

public class Class0106_Enumeration {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(15.5);
		v.add("Ashwathnarayan Joshi");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
