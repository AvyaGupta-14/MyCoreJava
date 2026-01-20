package Arrays;

import java.util.Scanner;

public class Ques3_Array_set2 {

	public static void main(String[] args) {
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int count=0;
		
		for(int i=0;i<8;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<8;i++) {
			count = count + 1;
			
		}
				
		System.out.println("\nCount of all Elements: " + count);
		
				
	}
}
