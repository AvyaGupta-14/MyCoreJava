package Conditional_Statement;
import java.util.Scanner;

public class Ques7_Salary_Discount {
	// salary or discount
		public static void main(String[] args) 
		{
			Scanner Sc = new Scanner(System.in);
			System.out.print("Enter your salary: ");
			double salary = Sc.nextDouble();
			System.out.print("Enter your years of service: ");
			int years = Sc.nextInt();
			
			if (years > 5) {
				double bonus = salary * 0.05;
				System.out.println("Bonus Amount:" + ( salary + bonus));
			}else {
				System.out.println("no bonus applicable.");
			}
		}
}

