package Arrays;

import java.util.Scanner;

public class Ques2_Array_set2 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");		
		
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nReplace EVEN by 0 0r Odd by 1 Elements:");
		for(int i=0;i<5;i++) {
			if (arr[i]%2 == 0) {
				arr[i] = 0;
				System.out.print(arr[i] + " ");
			}else {
				arr[i] = 1;
				System.out.print(arr[i] + " ");
			}
		}
				
	}
}





