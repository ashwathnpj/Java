package java_package;
//nested if else block
import java.util.Scanner;

public class Class0016_NestedIfElse {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the marks you got : ");
		double score=s1.nextDouble();
		if (score >= 35) {
			if(score>=85){
				System.out.println("Congratulations! You have passed and distinction");
			}else {
				System.out.println("Congratulations! You have passed");
			}
		} else {
			System.out.println("Enter the correct score");
		}
	}

}
