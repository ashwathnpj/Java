package java_package;
//Using Scanner Class please execute below problems:
//Area of circle, Circumference of circle, Area of square, Area of rectangle, 
//Area of triangle, Area of trapezium, Circumference of square, 
//Circumference of rectangle, Circumference of triangle, Circumference of trepezium

import java.util.Scanner;

public class Class0018_ScannerAllAreas {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double radius = s1.nextDouble();
		double area = Math.PI * radius * radius;
		double circum = 2 * Math.PI * radius;
		System.out.println("Area of the circle is: " + area);
		System.out.println("Circumference of the Circle is: " + circum);

		System.out.print("Enter the side of square: ");
		double side = s1.nextDouble();
		double area1 = side * side;
		double circum1 = 4 * side;
		System.out.println("Area of the Square is : " + area1);
		System.out.println("Circumference of square is : " + circum1);

		System.out.print("Enter the length of rectangle: ");
		double side1 = s1.nextDouble();
		System.out.print("Enter the breadth of rectangle: ");
		double side2 = s1.nextDouble();
		double area3 = side1 * side2;
		double circum3 = 2 * (side1 + side2);
		System.out.println("Area of the rectangle is : " + area3);
		System.out.println("Circumference of rectangle is : " + circum3);

		System.out.print("Enter the breadth of triangle : ");
		double b1 = s1.nextDouble();
		System.out.print("Enter the height of triangle : ");
		double h1 = s1.nextDouble();
		System.out.print("Enter the second side of triangle : ");
		double ss1 = s1.nextDouble();
		System.out.print("Enter the third side of triangle : ");
		double ss2 = s1.nextDouble();
		double area4 = 0.5 * b1 * h1;
		double circum4 = b1 + ss1 + ss2;
		System.out.println("Area of the triangle is : " + area4);
		System.out.println("Circumference of triangle is : " + circum4);

		System.out.print("Enter the first base value of trapezium : ");
		double fb = s1.nextDouble();
		System.out.print("Enter the second base value of trapezium : ");
		double sb = s1.nextDouble();
		System.out.print("Enter the height of trapezium : ");
		double height1 = s1.nextDouble();
		System.out.print("Enter the other side value of trapezium : ");
		double x = s1.nextDouble();
		System.out.print("Enter the last side value of trapezium : ");
		double y = s1.nextDouble();
		double area5 = (fb + sb) * 0.5 * height1;
		double circum5 = fb + sb + x + y;
		System.out.println("Area of the trapezium is : " + area5);
		System.out.println("Circumference of trapezium is : " + circum5);

	}


}
