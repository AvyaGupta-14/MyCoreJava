package Multithreading_Ques;


class MyThreadds extends Thread
{
	public MyThreadds(String name) {
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
public class Mujltithreading_Ex5 {
	public static void main(String[] args) {
		MyThreadds t1 = new MyThreadds("Task-1");
		t1.start();
		try {
			t1.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyThreadds t2 = new MyThreadds("Task-2");
		t2.start();
		
		try {
			t2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyThreadds t3 = new MyThreadds("Task-3");
		t3.start();
		System.err.println(Thread.currentThread().getName());

	}

}	

