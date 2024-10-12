package java_package;
//constructor overloading
public class Class0022_ConstructorOverloading {

		Class0022_ConstructorOverloading() {
			System.out.println("First Constructor is called");
		}

		Class0022_ConstructorOverloading(int a) {
			System.out.println("Second Constructor is called");

		}

		public static void main(String[] args) {
			new Class0022_ConstructorOverloading();
			new Class0022_ConstructorOverloading(10);

		}

	}
