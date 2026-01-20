package Looping;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=13;
		boolean b=false;
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0) {
				b=true;
				break;
			}
		}
		if(b) {
			System.out.print("Prime");
		}else {
			System.out.print("Not Prime");
		}

	}
}
