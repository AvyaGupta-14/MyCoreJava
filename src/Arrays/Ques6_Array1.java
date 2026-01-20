package Arrays;

import java.util.Scanner;

public class Ques6_Array1 {

	public static void main(String[] args) {
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int n=0;
		
		
		for(int i=0;i<8;i++) {
			arr[i] = sc.nextInt();
			if (i%2 == 1) {
				System.out.print("\nElements of " + i + " odd position is " + arr[i] + " ");
			}
		
		}

	}
}
