package java_package;
//to make a form where the user is able to input his information. 
//The following information is required:
//First name, Email, Password, Gender, Present address, Permanent address, Pin code  

import java.util.Scanner;

public class Class0016_WebsiteCredentials {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your First Name ");
		String a = s1.next();
		System.out.println("Enter your Last Name ");
		String b = s1.next();
		System.out.println("Enter your Email-Id ");
		String c = s1.next();
		System.out.println("Enter your Password ");
		String d = s1.next();
		System.out.println("Enter your Gender ");
		String e = s1.next();
		System.out.println("Enter your Pincode ");
		int g = s1.nextInt();
		System.out.println("Enter your Address ");
		String f = s1.next();
		System.out.println("Thank you.");

	}

}
