package Conditional_Statement;
import java.util.Scanner;

public class Ques4_eligible_not {
	// eligible for marriage or not
	public static void main(String[] args) {
		Scanner EN = new Scanner(System.in);
		System.out.print("Enter the age of person: ");
		int n = EN.nextInt();
		if (n>=21) {
			System.out.println(n + " is eligible for marriage.");
		}
		else {
			System.out.println(n + " is not eligible for marriage.");
		}
			// TODO Auto-generated method stub
	}
}
