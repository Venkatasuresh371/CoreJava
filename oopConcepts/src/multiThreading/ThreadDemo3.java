package multiThreading;

public class ThreadDemo3
{
	public static void main(String[] args)
	{
		Runnable r1 = ()->System.out.println("Thread 1 running");
		Runnable r2 = ()->System.out.println("Thread 2 running");
		Runnable r3 = ()->System.out.println("Thread 3 running");
		
		Thread t1 = new Thread(r1);
		t1.setName("Thread1");
		Thread t2 = new Thread(r2);
		t2.setName("Thread2");
		Thread t3 = new Thread(r3);
		t3.setName("Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.getName()+" --> "+t1.threadId()+" --> "+t1.getPriority());
		System.out.println(t2.getName()+" --> "+t2.threadId()+" --> "+t2.getPriority());
		System.out.println(t3.getName()+" --> "+t3.threadId()+" --> "+t3.getPriority());
	}
}