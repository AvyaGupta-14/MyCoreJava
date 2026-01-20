package Looping;
import java.util.Scanner;

public class Ques7_while_Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int n1 = sc.nextInt();
		
		System.out.print("Factor of " + n1 + " is ");
		int i=1;
		while(i<=n1) {
			if (n1 % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

	}

}
