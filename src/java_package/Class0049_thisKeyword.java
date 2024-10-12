package java_package;
//this keyword (assign the value from local to global variable) 
public class Class0049_thisKeyword {
	String name; 
	int age;
	public Class0049_thisKeyword(String name, int age) {
 
        this.name = name;
        this.age = age;
    }

	public static void main(String[] args) {
		Class0049_thisKeyword a1=new Class0049_thisKeyword("Ashwathnarayan Joshi", 28);
		
		System.out.println(a1.name);
		System.out.println(a1.age);

	}

}
