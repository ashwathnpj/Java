package java_package;
//to count how many white spaces, numeric values are in the String

import java.util.Arrays;

public class Class0065_WhiteSpace {

	public static void main(String[] args) {
		int count_of_whitespaces=0;
		int count_of_digits=0;
		String input="My car name is TATA 2024";
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0; i<input.length();i++) {
			boolean b1=Character.isWhitespace(c1[i]);
			boolean b2=Character.isDigit(c1[i]);
			System.out.println(b1);
			if(b1==true) {
				count_of_whitespaces++;
			}
			if(b2==true) {
				count_of_digits++;
			}
			
		}
		System.out.println("Totally there are "+count_of_whitespaces+ " white spaces in "+input);
		System.out.println("Totally there are "+count_of_digits+ " digits in "+input);
		
	}

}
