package java_package;
//StringBuilder Constructors
public class Class0110_StringBuilderConstructors {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
        sb1.append("mobiles ");
        System.out.println("StringBuilder sb1 (default constructor): " + sb1);

        // Constructor with a string argument
        StringBuilder sb2 = new StringBuilder("books ");
        sb2.append("and mobiles.");
        System.out.println("StringBuilder sb2 (with string): "+ sb2.toString());

        // Constructor with a capacity argument
        StringBuilder sb3 = new StringBuilder(50);
        sb3.append("printers ");
        sb3.append("and watches.");
        System.out.println("StringBuilder sb3 (with capacity 50): " + sb3.toString());
        System.out.println("Capacity after appending: " + sb3.capacity());
	}
}
