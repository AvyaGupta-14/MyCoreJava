package Arrays;
import java.util.Scanner;

public class Ques1_Array1 {

	public static void main(String[] args) {
		int arr[] = new int[15];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input of 15 numbers: ");
			

		for (int i = 0; i<15;  i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Display 15 elements: ");
		for (int i = 0; i<15;  i++) {
			System.out.print(arr[i] + " ");
			
		}
		

	}

}
