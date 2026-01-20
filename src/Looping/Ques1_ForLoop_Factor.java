package Looping;
import java.util.Scanner;

public class Ques1_ForLoop_Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int n1 = sc.nextInt();
		
		System.out.print("Factor of " + n1 + " is ");
		for(int i=1; i<=n1; i++) {
			if(n1 % i == 0) {
				System.out.print(i + " ");
			}
		}	
	
	}

}


