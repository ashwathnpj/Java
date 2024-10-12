package java_package;
//continue keyword 

public class Class0119_Continue {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue; // Skip at i == 3
			}
			System.out.println(i);
		}

	}
}