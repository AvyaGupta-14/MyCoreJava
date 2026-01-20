package Arrays;

import java.util.Scanner;

public class Ques10_Array1 {
	public static void main(String[] args) {
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");		
		
		for(int i=0;i<8;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nMultiply even by 2 or odd by 3 Elements:");
		for(int i=0;i<8;i++) {
			if (arr[i]%2 == 0) {
				arr[i] = arr[i] * 2;
				System.out.print(arr[i] + " ");
			}else {
				arr[i] = arr[i] * 3;
				System.out.print(arr[i] + " ");
			}
		}
				
	}

}
