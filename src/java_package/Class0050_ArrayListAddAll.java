package java_package;
//addAll method(index int,collection c) program in Arraylist
import java.util.ArrayList;

public class Class0050_ArrayListAddAll {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add("nokia");
		a1.add("samsung");
		a1.add("xiaomi");
		a1.add("vivo");
		ArrayList a2=new ArrayList();
		a2.add("oneplus");
		a2.add("apple");
		a1.addAll(1, a2);
		System.out.println(a1);
	}

}
