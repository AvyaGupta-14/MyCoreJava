package String;

public class String1_Example2 {
	public static void main(String[] args) {

		String str = "hello Hi what's up";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ' || i == str.length()-1) {
				count++;
			}
			
		}

		System.out.println(count);

	}

}
