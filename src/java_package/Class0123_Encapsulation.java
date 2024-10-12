package java_package;
//Encapsulation

class ParentClass1 {
	private String email = "example@gmail.com";

	public void setEmail(String email) {
		this.email = email;

	}

	public String getEmail() {
		return email;

	}
}

public class Class0123_Encapsulation {
	public static void main(String[] args) {
		ParentClass1 a1 = new ParentClass1();
		a1.setEmail("ashwathnpj6@gmail.com");
		System.out.println(a1.getEmail());
	}

}
