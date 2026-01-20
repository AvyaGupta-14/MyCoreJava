package Conditional_Statement;

import java.util.Scanner;

public class Scanner2_example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value: ");
		int n = sc.nextInt();

		
		if(n>0) {
			System.out.println("hello......1");
			System.out.println("hello......2");
			System.out.println("n is +ve");
			System.out.println("hello......3");
		}else {
			System.out.println("hello......4");
			System.out.println("hello......5");
			System.out.println("n is -ve");
			System.out.println("hello......6");
		}
		

	}

}
