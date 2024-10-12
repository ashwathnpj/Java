package java_package;
//Future time 
import java.util.Date;

public class Class0125_FutureTime {

	public static void main(String[] args) {
		Date d1=new Date();
		Date d2=new Date(d1.getTime());
		System.out.println("Current Time is --> "+d2);
		Date d3=new Date(d1.getTime()+(1000*60*60*24*1));
		System.out.println("Future Time will be --> "+d3);
		

	}

}
