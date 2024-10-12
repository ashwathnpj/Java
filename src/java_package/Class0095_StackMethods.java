package java_package;
//stack methods 

import java.util.Stack;

public class Class0095_StackMethods {

	public static void main(String[] args) {
		Stack a1=new Stack();
		a1.add("nokia");
		a1.add("samsung");
		a1.add("vivo");
		a1.add("apple");
		System.out.println("Stack elements are --> "+a1);
		a1.push("realme");
		System.out.println("After pushing 'realme', Stack elements are --> "+a1);
		a1.pop();
		System.out.println("By removing the last element, Stack elements are-->"+a1);
		System.out.println("Fetching the last element without removing it from Stack --> "+a1.peek());
		

	}

}
