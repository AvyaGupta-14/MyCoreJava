package String;

public class string_1 {
// total number of character
	public static void main(String[] args) {
		String str = "Hello Hi What's Up";
		int count = 0;
		for(int i=0 ; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch != ' ') {
				count++;
			}
			System.out.print(ch);
		}
		System.out.println("\nTotal number of Capital letter count: " + count);
	}
}
