package String;

public class string_3 {
// total number of small letter
	public static void main(String[] args) {
		String str = "hello Hi what's up";
		int count = 0;
		for(int i=0 ; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				count++;
			}
			System.out.print(ch);
			}
			System.out.println("\nTotal number of small letter count: " + count);
	}

}
