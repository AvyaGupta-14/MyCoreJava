package Multithreading_Ques;

class MyThreadss extends Thread
{
	public MyThreadss(String name) {
		super(name);
	}
	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			
			System.err.println(Thread.currentThread().getName()+"  :  "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Multithreading_Ex7 {
	public static void main(String[] args) {
		MyThreadss t1 = new MyThreadss("Mera Thread1");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		
		
		MyThreadss t2 = new MyThreadss("Mera Thread2");
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyThreadss t3 = new MyThreadss("Mera Thread3");
		t3.start();
		System.err.println(Thread.currentThread().getName());

	}

}	
