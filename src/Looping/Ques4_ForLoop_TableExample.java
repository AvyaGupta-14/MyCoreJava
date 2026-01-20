package Looping;
import java.util.Scanner;

public class Ques4_ForLoop_TableExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int n = sc.nextInt();
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			System.out.println("Table of " + n + " * " + i + " = " + (n*i));
		}
	}
}
