package String;

public class Extra {

	public static void main(String[] args) {

		String str = "Hello HI whats up";
		int  capLetterCount = 0, smLetterCount = 0, totalLetters = 0, smWord = 0, capWord = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ' || i == str.length() - 1) {
				
				if (capLetterCount == totalLetters) {
					capWord++;
				}
				if (smLetterCount == totalLetters) {
					smWord++;
				}
				totalLetters = 0;
				smLetterCount = 0;
				capLetterCount = 0;
			} else {
				totalLetters++;

				if (ch >= 'A' && ch <= 'Z') {
					capLetterCount++;
				}
				if (ch >= 'a' && ch <= 'z') {
					smLetterCount++;
				}
			}
		}
		System.out.println("Total Capital words are : " + capWord);
		System.out.println("Total Small words are : " + smWord);
	}
}

