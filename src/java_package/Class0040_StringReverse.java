package java_package;
//reverse the String "Google"

import java.util.Arrays;

public class Class0040_StringReverse {
	public static void main(String[] args) {
		String company = "Google";
		String output = "";
		for (int i = company.length() - 1; i >= 0; i--) {
			char c1 = company.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
	}

}
