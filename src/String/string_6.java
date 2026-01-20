package String;

public class string_6 {
// total number of Capital word
		public static void main(String[] args) {
			String str = "HELLO hi what's UP";
			String[] words = str.split(" ");

		    int count = 0;

		   for (String word : words) {
		       if (word.length() > 0 && Character.isUpperCase(word.charAt(0))) {
		    	   count++;
		       }
		   }
		   System.out.print(str);
		   System.out.println("\nTotal number of Capital Word count: " + count);
		}

}
