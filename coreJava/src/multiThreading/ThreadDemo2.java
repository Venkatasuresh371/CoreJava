package multiThreading;

public class ThreadDemo2 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=10;i<=20;i++)
			System.out.println(i);
	}
	public static void main(String[] args)
	{
		ThreadDemo2 demo2 = new ThreadDemo2();
		Thread thread = new Thread(demo2);
		thread.start();
	}
}