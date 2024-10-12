package java_package;
//date and current time 

import java.util.Date;

public class Class0124_CurrentTime {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		String human = d1.toString();
		System.out.println(human);
		System.out.println("Current Time is " + human.substring(11, 19));

	}

}
