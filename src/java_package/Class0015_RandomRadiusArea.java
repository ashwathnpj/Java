package java_package;
//to find the area of a circle using a for loop where radius is coming from math.random and pi is coming from math.pi 
//and the loop has to execute 10 times.

public class Class0015_RandomRadiusArea {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			double radius = Math.random();

			double area = Math.PI * radius * radius;

			System.out.println("Areas are " + area);
		}
	}

}
