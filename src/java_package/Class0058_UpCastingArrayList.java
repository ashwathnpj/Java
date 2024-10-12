package java_package;
//UpCasting ArrayList to List and LinkedHashSet to Set 

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Class0058_UpCastingArrayList {
	public static void main(String[] args) {
		List a1=new ArrayList();
		a1.add("mobiles");
		a1.add("books");
		a1.add("watches");
		a1.add("printers");
		System.out.println("After UpCasting ArrayList to List --> " +a1);
		Set b1=new LinkedHashSet();
		b1.add("laptop");
		b1.add("smartphones");
		b1.add("headphones");
		System.out.println("After UpCasting LinkedHashSet to Set --> " +b1);
	}

}
