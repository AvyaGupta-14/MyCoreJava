package Conditional_Statement;
import java.util.Scanner;

public class Ques2_Max_Min {

	public static void main(String[] args) {
// who is maximum code
		Scanner sgr = new Scanner(System.in);
		System.out.print("Enter First number: ");
		int n1 = sgr.nextInt();
		System.out.print("Enter Second number: ");
		int n2 = sgr.nextInt();
		
		if(n1>n2) {
			System.out.println(n1 + " is maximum number");
		} else {
			System.out.println(n2 + " is maximum number");
		}

	}

}
