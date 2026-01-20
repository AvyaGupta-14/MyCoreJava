package Arrays;

import java.util.Scanner;

public class Ques4_Array_set2 {

	public static void main(String[] args) {
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");		
		
		for(int i=0;i<8;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nReplace all  Elements by 0 :");
		/*for(int i=0;i<8;i++) {
			if (arr[i]%2 == 0) {
				arr[i] = 0;
				System.out.print(arr[i] + " ");
			}else {
				arr[i] = 0;
				System.out.print(arr[i] + " ");
			}
		}
			*/	
		
		
		for(int i=0;i<8;i++) {
			arr[i]=0;
		}
		for(int i=0;i<8;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
