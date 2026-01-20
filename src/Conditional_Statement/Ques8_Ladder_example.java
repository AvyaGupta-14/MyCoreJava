package Conditional_Statement;

import java.util.Scanner;

public class Ques8_Ladder_example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.print("ONE");
		} else if(n == 2) {
			System.out.print("TWO");
		} else if(n == 3) {
			System.out.print("THREE");
		} else if(n == 4) {
			System.out.print("FOUR");
		} else if(n == 5) {
			System.out.print("FIVE");
		} else if(n == 6) {
			System.out.print("SIX");
		} else if(n == 7) {
			System.out.print("SEVEN");
		} else if(n == 8) {
			System.out.print("EIGHT");
		} else {
			System.out.print("Invalid Input");
		}
	}
}
