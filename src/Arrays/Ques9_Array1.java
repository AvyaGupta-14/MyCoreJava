package Arrays;

import java.util.Scanner;

public class Ques9_Array1 {

	public static void main(String[] args) {
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");		
		
		for(int i=0;i<8;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nReplace ODD Number Of Elements:");
		for(int i=0;i<8;i++) {
			if (arr[i]%2 == 1) {
				arr[i] = arr[i] * arr[i] * arr[i];
				System.out.print(arr[i] + " ");
			}
		}
				
	}

}
