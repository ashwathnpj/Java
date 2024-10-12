package java_package;
//some methods of String class

public class Class0035_StringMethods1 {
	public static void main(String[] args) {
		String name="Ashwathnarayan";
		String name1=" Ashwathnarayan ";
		String name2="Ashwathnarayan";
		String name3="ashwathnarayan";
		String name4="Ashwathnarayan Joshi";
		System.out.println("The length of the String is "+name.length());
		System.out.println("The lowercase of the String is "+name.toLowerCase());
		System.out.println("The uppercase of the String is "+name.toUpperCase());
		System.out.println("The index of character 's' in String is "+name.indexOf('s'));
		System.out.println("The character at 5th index in String is "+name.charAt(5));
		System.out.println("The trim of the String is "+name1.trim());
		System.out.println("The answer for name and name2 Strings are equal is "+name2.equals(name));
		System.out.println("If we ignore the case of String, the answer for name and name3 Strings are equal is "+name3.equalsIgnoreCase(name));
		System.out.println("The String Contains 'Joshi' is "+name4.contains("Joshi"));
		System.out.println("The Sub String from 15th index is "+name4.substring(15));
		System.out.println("The Sub String from 7th to 14th index is "+name4.substring(7, 14));
	
	}

}
