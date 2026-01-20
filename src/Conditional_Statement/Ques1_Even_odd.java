package Conditional_Statement;

import java.util.Scanner;

public class Ques1_Even_odd {

	public static void main(String[] args) {
			// Even or odd number

			Scanner EO = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int n = EO.nextInt();
							
			if (n%2 == 0) {
				System.out.println(n + " is even number");
			}
			else {
				System.out.println(n + " is odd number");
			}
				// TODO Auto-generated method stub

	}

}
