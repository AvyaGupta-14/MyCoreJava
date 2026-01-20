package Conditional_Statement;
import java.util.Scanner;

public class Ques12_Ladder_Electricity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int u = sc.nextInt();
		int bill;
		
		if(u>=1 && u<=100) {
			bill = u * 2;
			System.out.print(bill);
		}else if(u>=101 && u<=200) {
			bill = (100*2)+(u-100)*5;
			System.out.print(bill);
		}else if(u>=201 && u<=300) {
			bill = (100*2)+(100*5)+(u-200)*7;
			System.out.print(bill);
		}else if(u>=301 && u<=400) {
			bill = (100*2)+(100*5)+(100*7)+(u-300)*10;
			System.out.print(bill);
		}else if(u>=401 && u<=500) {
			bill = (100*2)+(100*5)+(100*7)+(100*10)+(u-400)*12;
			System.out.print(bill);
		}else if(u>500) {
			bill = (100*2)+(100*5)+(100*7)+(100*10)+(100*12)+(u-500)*15;
			System.out.print(bill);
		}else {
			System.out.print("Invalid Input");
		}
		// TODO Auto-generated method stub
	}
}
