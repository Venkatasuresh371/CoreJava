package multiThreading;

public class ThreadYieldDemo
{
	public static void main(String[] args) 
	{
		Runnable r1 = ()->
		{
			for(int i=1;i<=5;i++)
				System.out.println("i --> "+i);
		};
		Runnable r2 = ()->
		{
			Thread.yield();
			for(int i=1;i<=10;i++)
				System.out.println("i is "+i);
		};
		Runnable r3 = ()->
		{
			for(int i=1;i<=15;i++)
				System.out.println(i);
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		Thread t3 = new Thread(r3);
		t3.start();
	}
}
