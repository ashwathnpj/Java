package java_package;
//to calculate the area and circumference of a circle in different methods and then calling them in the main method 

public class Class0014_AreaCircumference {
	public static void area() {
		float pi=3.142f;
		int radius=25;
		float area=pi*radius*radius;
		System.out.println("Area of circle is "+ area);
	}
	
	public static void circumference() {
		float pi=3.142f;
		int radius=25;
		float circum=2*pi*radius;
		System.out.println("Area of circumference is "+ circum);
	}
	
	public static void main(String[] args) {
		area();
		circumference();
	}

}
