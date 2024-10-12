package java_package;
//StringBuffer three Constructors

public class Class0108_StringBufferConstructor {
	public static void main(String[] args) {
		// Constructor with a no argument
		StringBuffer sb1 = new StringBuffer();
        sb1.append("mobiles ");
        System.out.println("StringBuffer sb1 (default constructor) : " + sb1 );

        // Constructor with a string argument
        StringBuffer sb2 = new StringBuffer("firstname ");
        sb2.append("lastname.");
        System.out.println("StringBuffer sb2 (with string): " + sb2);

        // Constructor with a capacity argument
        StringBuffer sb3 = new StringBuffer(30);
        sb3.append("mobiles ");
        sb3.append("and laptops");
        System.out.println("StringBuffer sb3 (with capacity 30): " + sb3);
        System.out.println("Capacity after appending: " + sb3.capacity());
	}

}
