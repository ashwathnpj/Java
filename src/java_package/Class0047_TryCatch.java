package java_package;
//if I give 2 as input then, it throw InputMismatchException.
//and I handled it from try and catch block 
import java.util.InputMismatchException;
import java.util.Scanner;

public class Class0047_TryCatch {
	public static void main(String[] args) {
//		Scanner s1=new Scanner(System.in);
//		System.out.println("Are you male? say, true or false : ");
//		boolean name=s1.nextBoolean();
//		System.out.println("You are male is --> "+name);
		//if I give 2 as input then, it throw InputMismatchException. 
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Are you male? say, true or false : ");
		try {
			boolean name1=s2.nextBoolean();
			System.out.println("You are male is --> "+name1);
		}
		catch(InputMismatchException a) {
			System.out.println("I handled the InputMismatchException");
		}
		
		
		
	}
	
	

}
