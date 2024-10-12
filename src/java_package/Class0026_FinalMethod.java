package java_package;
//making method as final, we can't override that method 
class SuperClass {
    // Final method
    public final void displayMessage() {
        System.out.println("This is a final method in SuperClass.");
    }
    
}

public class Class0026_FinalMethod extends SuperClass  {
//	public void displayMessage() {
//        System.out.println("This is a overrided method in sub class.");
//    }

	public static void main(String[] args) {
		Class0026_FinalMethod a1=new Class0026_FinalMethod();
		 a1.displayMessage();

	}

}
