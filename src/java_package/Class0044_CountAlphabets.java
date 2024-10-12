package java_package;
//to count how many alphabets are in the String

import java.util.Arrays;

public class Class0044_CountAlphabets {
	
	public static void main(String[] args) {
		int count_of_aplha=0;
		String input="50cent";
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0; i<input.length();i++) {
			boolean b1=Character.isAlphabetic(c1[i]);
			System.out.println(b1);
			if(b1==true) {
				count_of_aplha++;
			}
			
		}
		System.out.println("Totally there are "+count_of_aplha+ " alphabets in "+input);
	}
	

}
