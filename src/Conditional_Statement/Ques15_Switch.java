package Conditional_Statement;

import java.util.Scanner;

public class Ques15_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A':
			System.out.print("It is vowel");
			break;
		case 'E':
			System.out.print("It is vowel");
			break;
		case 'I':
			System.out.print("It is vowel");
			break;
		case 'O':
			System.out.print("It is vowel");
			break;
		case 'U':
			System.out.print("It is vowel");
			break;
		case 'a':
			System.out.print("It is vowel");
			break;
		case 'e':
			System.out.print("It is vowel");
			break;
		case 'i':
			System.out.print("It is vowel");
			break;
		case 'o':
			System.out.print("It is vowel");
			break;
		case 'u':
			System.out.print("It is vowel");
			break;
		default:
			System.out.print("It is Consonant");
		}
	}
}
