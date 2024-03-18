package multiThreading;

public class ThreadDemo1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
	public static void main(String[] args)
	{
		ThreadDemo1 demo1 = new ThreadDemo1();
		demo1.start();
	}
}