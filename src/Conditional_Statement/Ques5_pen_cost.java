package Conditional_Statement;
import java.util.Scanner;

public class Ques5_pen_cost {
	// pen cost and discount
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a value: ");
			double cost = sc.nextDouble();
			
			double total = 70 * cost;
			double discount;
			
			if(total > 1000) {
				discount = total * 0.20;
				System.out.print("After 20% discount");
			}else {
				discount = total * 0.10;
				System.out.println("After 10% discount");
			}
			//double finalAmount = total - discount;
			
		}

}
