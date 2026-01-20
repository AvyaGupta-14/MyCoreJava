package Conditional_Statement;
import java.util.Scanner;

public class Ques16_Switch_Vowel_Consonant {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a char: ");
		char ch = sc.next().charAt(0);

		switch(ch) {
		case 'A' : case 'E' : case 'I' : case 'O' : case 'U' : case 'a' : case 'e' : case 'i': case 'o' : case 'u':
			System.out.println("It is vowel");
			break;
		default:
			System.out.println("It's a consonant..........");
		}

	}
	

}
