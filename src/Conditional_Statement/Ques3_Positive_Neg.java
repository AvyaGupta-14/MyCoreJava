package Conditional_Statement;
import java.util.Scanner;

public class Ques3_Positive_Neg {
	//Positive or negative

	public static void main(String[] args) {
		Scanner PN = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = PN.nextInt();

		if (n>0) {
			System.out.println(n + " is positive number");
		}
		else {
			System.out.println(n + " is negative number");
		}
			// TODO Auto-generated method stub
	}
}
