package Multithreading_Ques;

public class Multithreading {
	
	public void m1() {
		for(int i=0; i<3; i++) {
			System.out.println("Multithreading.m1()");
		}
		
	}
	
	public void m2() {
		System.out.println("Multithreading.m2()");
	}
	
		public static void main(String[] args) {
		Multithreading m = new Multithreading();
		m.m1();
		m.m2();
	}
}
