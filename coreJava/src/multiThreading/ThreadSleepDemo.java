package multiThreading;

import java.time.LocalTime;

public class ThreadSleepDemo implements Runnable
{
	public static void main(String[] args)
	{
		ThreadSleepDemo demo = new ThreadSleepDemo();
		Thread thread = new Thread(demo);
		thread.start();
		int startTime=LocalTime.now().getSecond();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int endTime = LocalTime.now().getSecond();
		long timeDifference=(endTime-startTime);
		System.out.println("Time difference between before and after sleep call: "+timeDifference);
	}

	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
}