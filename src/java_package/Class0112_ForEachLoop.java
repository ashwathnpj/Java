package java_package;
//for each loop 

import java.util.ArrayList;
import java.util.List;

public class Class0112_ForEachLoop {
	public static void main(String[] args) {
		List<Integer> n1 = new ArrayList();
        n1.add(1);
        n1.add(2);
        n1.add(3);
        n1.add(4);
        n1.add(5);
        
        // Using a for-each loop to iterate over the list
        System.out.println("Numbers in the list:");
        for (Integer n2 : n1) {
            System.out.println(n2);
	}

}
}
