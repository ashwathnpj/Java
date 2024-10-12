package java_package;
//all access specifier of methods outside package without becoming sub-class
//sub-class means relation

import java_package2.Class0030_OusidePackage4;

public class Class0030_OusidePackage2 extends Class0030_OusidePackage4{
	public static void main(String[] args) {
		Class0030_OusidePackage4 c1=new Class0030_OusidePackage4();
		c1.add();
//		c1.add1();protected methods are not accessible
//		c1.add2();defualt methods are not accessible
//		c1.add3();private methods are not accessible
		
	}

}
