package java_package;
//parameterized non-static method using  parameters try to call in main method      
public class Class0019_CallParameterized {
	
	public void add(int a){
		System.out.println("non-static method using  parameters called in main method, parameter value is "+a);
	}

	public static void main(String[] args) {
		Class0019_CallParameterized a1=new Class0019_CallParameterized();
		a1.add(10);

	}

}
