package Arrays;

import java.util.Scanner;

public class Ques1_Array_set2 {
	public static void main(String[] args) {
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<8;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nDisplay Even Elements:");
		for(int i=0;i<8;i++) {
			if (arr[i]%2 == 0) {
				System.out.print(arr[i] + " ");
				sum = sum + arr[i];
			}
		}
		System.out.println("\nAdd Even Elements:");
		System.out.print(sum + " ");
		
		
		System.out.println("\nDisplay ODD Elements:");
		for(int i=0;i<8;i++) {
			if (arr[i]%2 == 1) {
				System.out.print(arr[i] + " ");
				sum1 = sum1 + arr[i];
			}
		}
		System.out.println("\nAdd ODD Elements:");
		System.out.print(sum1 + " ");
		
				
	}
}
