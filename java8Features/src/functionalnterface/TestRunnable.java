package functionalnterface;

public class TestRunnable 
{
	public static void main(String[] args)
	{
		Runnable r = ()->
		{
			System.out.println("Run Method");
			for (int i=1; i<=10; i++) 
			{
				System.out.println(i);
			}
		};
		Thread thread = new Thread(r);
		thread.start();
	}
}