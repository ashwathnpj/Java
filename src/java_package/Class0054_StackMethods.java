package java_package;
//Utilizing Stack methods push(),pop(),peek() 
import java.util.Stack;

public class Class0054_StackMethods {
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add("nokia");
		s1.add("samsung");
		s1.add("xiaomi");
		s1.add("vivo");
		System.out.println("Initial elements of Stack are : "+s1);
		s1.pop();
		System.out.println("After pop : "+s1);
		s1.push("apple");
		System.out.println("After pushing of apple : "+s1);
		System.out.println("After peek : "+s1.peek()+" (Fetched the last element)");
	}

}
