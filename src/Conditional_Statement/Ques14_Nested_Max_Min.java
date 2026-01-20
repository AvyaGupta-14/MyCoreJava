package Conditional_Statement;
import java.util.Scanner;

public class Ques14_Nested_Max_Min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first value: ");
		int n1 = sc.nextInt();
		System.out.print("Enter second value: ");
		int n2 = sc.nextInt();
		System.out.print("Enter third value: ");
		int n3 = sc.nextInt();
		
		if (n1> n2) {
			if(n1>n3) {
				System.out.println(n1+" is maximun");
			} else {
				System.out.println(n2 + " is maximum");
			}
		} else if(n2 > n3) {
			System.out.println(n2 + " is maximum");
		} else {
			System.out.println(n3 + " is maximum");
		}
		// TODO Auto-generated method stub

	}
}
