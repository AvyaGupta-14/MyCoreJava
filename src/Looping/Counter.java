package Looping;

public class Counter {

	public static void main(String[] args) {
		int n=13, counter=0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				counter++;
			}
		}
		if(counter == 2) {
			System.out.print("Right!!!!");
		}else {
			System.out.print("Wrong!!!!");
		}

	}

}
