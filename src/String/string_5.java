package String;

public class string_5 {
// total number of word
	public static void main(String[] args) {
		String str = "HELLO Hi What's UP";
		String[] words = str.split(" ");
		
        int count = words.length;
        System.out.println(str);
		System.out.println("\nTotal number of Word Count: " + count);

	}

}
