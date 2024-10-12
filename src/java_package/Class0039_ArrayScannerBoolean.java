package java_package;
//Array for boolean and double data type and 
//write down their values from scanner class 


import java.util.Arrays;
import java.util.Scanner;

public class Class0039_ArrayScannerBoolean {
	public static void main(String[] args) {
		System.out.println("Enter three double data type numbers");
		double weight[]=new double[3];
		Scanner s1=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			weight[i]=s1.nextDouble();
			
		}
		System.out.println("Output for double data type in array --> "+Arrays.toString(weight));
		
		System.out.println("Enter three boolean data type input");
		boolean gender[]=new boolean[3];
		for(int i=0; i<3; i++) {
			gender[i]=s1.nextBoolean();
			
		}
		System.out.println("Output for boolean data type in array --> "+ Arrays.toString(gender));
		
	}
}
