package java_package;
//verifying the given String is Palindrome or not

public class Class0061_StringPalindrome {

	public static void main(String[] args) {
		String word = "madam";
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			char c1 = word.charAt(i);
			output=output+c1;
		}
		System.out.println("The given String is --> "+word);
		System.out.println("Reverse of the given String is --> "+output);
		if(word.equals(output)) {
			System.out.println("The given String is Palindrome");
		}
		else {
			System.out.println("The given String is not Palindrome");
		}
	}

}
