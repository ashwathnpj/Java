package java_package;
//two abstract interface
interface Password {
	public void weblogin();

	public void mobilelogin();
}

public class Class0052_Interface implements Password {
	@Override
	public void weblogin() {
		System.out.println("login using website");

	}

	@Override
	public void mobilelogin() {
		System.out.println("login using mobile");

	}

	public static void main(String[] args) {
		Class0052_Interface a1=new Class0052_Interface();
		a1.weblogin();
		a1.mobilelogin();

	}

}
