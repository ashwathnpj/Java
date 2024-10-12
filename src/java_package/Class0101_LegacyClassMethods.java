package java_package;
//Legacy Class Methods

import java.util.Stack;
import java.util.Vector;


public class Class0101_LegacyClassMethods {

	public static void main(String[] args) {
		Vector cart=new Vector();
		cart.add("nokia");
		cart.add("samsung");
		cart.add("vivo");
		cart.add("apple");
		System.out.println("cart elements are --> "+cart);
		cart.addElement("realme");
		System.out.println("After adding 'realme' in cart, elements are --> "+cart);
		System.out.println("first element is --> "+cart.firstElement());
		System.out.println("last element is --> "+cart.lastElement());
		cart.remove("realme");
		System.out.println("After removing 'realme', the cart elements will be --> "+cart);
		cart.remove(2);
		System.out.println("After removing the 2nd index, the cart elements will be --> "+cart);
		System.out.println("The capacity of cart is now --> "+cart.capacity());
		cart.removeAllElements();
		System.out.println("After removing all the elements, the cart elements will be --> "+cart);
		System.out.println(" ");
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
