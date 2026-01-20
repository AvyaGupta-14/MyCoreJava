package String;

public class string_7 {

	public static void main(String[] args) {

		String str = "Hello HI whats up ";

		int  capLetterCount = 0, smLetterCount = 0, totalLetters = 0, smWord = 0, capWord = 0, prsmLetterCount=0, prCapLetterCount=0, prWord=0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ' ' || i == str.length() - 1) {
				
				if (capLetterCount == totalLetters) {
					capWord++;
				}
				if (smLetterCount == totalLetters) {
					smWord++;
				}
				if (prCapLetterCount == 1 && prsmLetterCount == totalLetters-1) {
					prWord++;
				}

				totalLetters = 0;
				smLetterCount = 0;
				capLetterCount = 0;
				prCapLetterCount = 0;
				prsmLetterCount= 0;

			} else {
				totalLetters++;

				if (ch >= 'A' && ch <= 'Z') {
					capLetterCount++;
				}
				if (ch >= 'a' && ch <= 'z') {
					smLetterCount++;
				}
				if (ch >= 'A' && ch >='Z' ) {
					prCapLetterCount++;
				}else {
					prsmLetterCount++;
				}

			}
		}
		System.out.println(str);
		System.out.println("Total Capital words are : " + capWord);
		System.out.println("Total Small words are : " + smWord);
		System.out.println("Total Proper words are : " + prWord);


	}
}
