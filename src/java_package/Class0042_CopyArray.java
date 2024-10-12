package java_package;
//to copy one array in to another array using iteration

import java.util.Arrays;

public class Class0042_CopyArray {
	public static void main(String[] args) {
		int input[] = new int[3];
		input[0]=10;
		input[1]=20;
		input[2]=30;
		int output[]=new int[3];
		for(int i=0;i<=2;i++) {
			output[i]=input[i]; //copied
		}
		System.out.println("Input Array --> "+Arrays.toString(input));
		System.out.println("Output Array --> "+Arrays.toString(output));
	}

}
