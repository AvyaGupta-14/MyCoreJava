package Multithreading_Ques;

class MyThread extends Thread
{
	public MyThread(String name) {
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
public class Multithreading_Ex4 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("Task-1");
		t1.start();
		MyThread t2 = new MyThread("Task-2");
		t2.start();
		MyThread t3 = new MyThread("Task-3");
		t3.start();
		System.err.println(Thread.currentThread().getName());

	}

}	