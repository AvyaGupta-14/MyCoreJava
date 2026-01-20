package Conditional_Statement;
import java.util.Scanner;

public class Ques11_Ladder_Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int marks = sc.nextInt();
		
		if(marks>=90 && marks<=100) {
			System.out.print("A+ Grade");
		}else if(marks>=70 && marks<=89) {
			System.out.print("B+ Grade");
		}else if(marks>=60 && marks<=69) {
			System.out.print("First Grade");
		}else if(marks>=33 && marks<=39) {
			System.out.print("Just Pass");
		}else if(marks>=0 && marks<=32) {
			System.out.print("Fail");
		}else {
			System.out.print("Invalid Input");
		}
	}

}
