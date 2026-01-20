package Arrays;

import java.util.Scanner;

public class Ques6_Array_set2 {
	public static void main(String[] args) {
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt(); 
		boolean num = true;
		
		
		for(int i=0;i<8;i++) {
			if(n % i == 0) {
				num=false;
				break;
				  
			}
		}
		
		if(num) {
			System.out.print("Prime number");
		}else {
			System.out.print("Not prime number");
		}
	}

}
