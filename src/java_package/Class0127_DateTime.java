package java_package;
//today date in Indian format and Current Time 

import java.util.Date;

public class Class0127_DateTime {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		String human=d1.toString();
		System.out.println(human);
		System.out.println("Current Time is "+human.substring(11, 16));
		System.out.println("Today Date is --> "+human.substring(8, 11)+"/"+human.substring(4, 7)+"/"+human.substring(23));
	}

}
