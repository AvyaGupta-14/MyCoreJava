package Conditional_Statement;
import java.util.Scanner;

public class Ques6_len_breadth {
	// length or breadth is a square or rectangle
		public static void main(String[] args) {
			Scanner LB = new Scanner(System.in);
			System.out.print("Enter Length of rectangle: ");
			int l = LB.nextInt();
			System.out.print("Enter Breadth of rectangle: ");
			int b = LB.nextInt();
				
			if (l==b) {
				System.out.println("It is a square");
			}
			else {
				System.out.println("It is not a square");
			}
			// TODO Auto-generated method stub
		}
}
