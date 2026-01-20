package Arrays;
import java.util.Scanner;

public class Ques3_Array1 {

	public static void main(String[] args) {
		int arr[] = new int[12];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int Mul = 1;
		
		for(int i=0; i<12; i++) {
			arr[i] = sc.nextInt();
			Mul = Mul * arr[i];
		}
		System.out.print("Multiply of all 12 elements is: " + Mul);

	}
}



