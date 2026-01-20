package Arrays;
import java.util.Scanner;

public class Ques4_Array1 {

	public static void main(String[] args) {
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int sq=1;
		
		for(int i=0;i<8;i++) {
			arr[i] = sc.nextInt();
			sq = arr[i] * arr[i];
			System.out.println("Square of " + arr[i] + " number is : " + sq );
		}

	}

}
