package Arrays;

import java.util.Scanner;

public class Ques11_Array1 {
	public static void main(String[] args) {
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<8;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nCount Even or Odd Elements:");
		for(int i=0;i<8;i++) {
			if (arr[i]%2 == 0) {
				evencount = evencount + 1;
			}else {
				oddcount = oddcount + 1;
			}
		}
		
		System.out.println("\nEven Elements: " + evencount);
		System.out.println("\nOdd Elements: " + oddcount);
		
				
	}

}
