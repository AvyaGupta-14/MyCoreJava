package Conditional_Statement;
import java.util.Scanner;


public class Ques17_Switch_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1 = sc.nextInt();

		System.out.print("Enter n2: ");
		int n2 = sc.nextInt();

		System.out.print("Enter an Arithmetic operator b/w (+,-,*,/,%): ");
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		
		case '+':
			int c = n1+n2;
			System.out.print("Sum of two number is " + c);
			break;
		
		case '-':
			int d = n1-n2;
			System.out.print("Difference of two number is " + d);
			break;
		
		case '*':
			int e = n1*n2;
			System.out.print("Multiple of two number is " + e);
			break;
			
		case '/':
			int f = n1/n2;
			System.out.print("Division of two number is " + f);
			break;
		
		case '%':
			int g = n1%n2;
			System.out.print("Modulas of two number is " + g);
			break;
			
		default:
			System.out.println("Invalid input");

		}
	}
}
