package java_package;
//Array size is 5 and only 3 values assigned
import java.util.Arrays;

public class Class0084_ArrayBlank {

	public static void main(String[] args) {
		int[] a1=new int[5];
		a1[0]=100;
		a1[1]=200;
		a1[2]=300;
		System.out.println(Arrays.toString(a1));
		System.out.println("If we don't assign the value of some indexes "
				+ "then it stores zero by default");

	}

}
