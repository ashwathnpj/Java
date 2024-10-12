package java_package;
//to reverse Array using iteration

import java.util.Arrays;

public class Class0043_ArrayReverse {

	public static void main(String[] args) {
		int [] age=new int[3];
		age[0]=10;
		age[1]=20;
		age[2]=30;
		
		int [] output =new int[3];
		for(int i=age.length-1;i>=0;i--) {
			output[age.length - 1 - i]=age[i];
			
		}
		System.out.println("Our given array is --> "+Arrays.toString(age));
		System.out.println("Reverse of the given array is --> "+Arrays.toString(output));
	}

}
