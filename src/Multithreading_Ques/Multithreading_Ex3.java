package Multithreading_Ques;

//interface Runnable
//{
//	public void run(); // ---> start();
//}
//class Thread implements Runnable
//{
//	@Override
//	public void run() {
//	}
//	public void start(); 
//}
//class MyThread extends Thread
//{
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//	}
//}


/*

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
public class Multithreading_Ex3 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("Task-1");
		t1.start();
		System.err.println(Thread.currentThread().getName());

	}

}
*/



class MyThreadd implements Runnable
{
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
public class Multithreading_Ex3 {
	public static void main(String[] args) {
//		MyThreadd task = new MyThreadd();
//		Thread t1 = new Thread(task,"New-Task");
		
		Thread t1 = new Thread(new MyThreadd(),"New-Task");
		t1.start();
		
		System.err.println(Thread.currentThread().getName());
	}

}