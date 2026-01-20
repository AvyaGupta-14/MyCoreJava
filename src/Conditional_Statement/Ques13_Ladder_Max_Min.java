package Conditional_Statement;
import java.util.Scanner;

public class Ques13_Ladder_Max_Min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first value");
		int n1 = sc.nextInt();
		System.out.print("Enter second value");
		int n2 = sc.nextInt();
		System.out.print("Enter third value");
		int n3 = sc.nextInt();
		if (n1> n2 && n1 > n3) {
			System.out.println(n1+"is maximun");
			
		} else if(n2 > n1 && n2 > n3) {
			System.out.println(n2 + "is maximum");
		} else if(n3 > n1 && n3 > n2) {
			System.out.println(n3 + "is maximum");
		} else {
			System.out.println("other is maximum");
		}
	}
}
