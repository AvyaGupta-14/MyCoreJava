package Looping;

public class Ques5_ForLoop_Pattern {

	public static void main(String[] args) {
		for(int i=1; i<=11; i++) {
			if(i % 2 == 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}

/*
public class Ques5_ForLoop_Pattern {

	public static void main(String[] args) {
		for(int i=1; i<=11; i++) {
			int rem = i%2;
			if(rem == 1) {                       //print even number = 0, odd = 1
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}
*/

