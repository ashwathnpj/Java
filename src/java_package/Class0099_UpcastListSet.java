package java_package;
//ArrayList to List,LinkedHashSet to Set and using add() method

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Class0099_UpcastListSet {

	public static void main(String[] args) {
		List a1 = new ArrayList();
		a1.add("mobiles");
		a1.add("books");
		a1.add("watches");
		a1.add("printers");
		System.out.println("a1 is --> " + a1);
		Set b1 = new LinkedHashSet();
		b1.add("mobiles");
		b1.add("books");
		b1.add("watches");
		b1.add("printers");
		System.out.println("b1 is --> " + b1);

	}

}
