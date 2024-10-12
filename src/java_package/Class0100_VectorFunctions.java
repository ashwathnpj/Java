package java_package;
//vector class functions 
import java.util.Vector;

public class Class0100_VectorFunctions {

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

	}

}
