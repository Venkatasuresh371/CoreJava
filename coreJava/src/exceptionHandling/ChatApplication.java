package exceptionHandling;

import java.io.IOException;

public class ChatApplication
{
	public static void main(String[] args)
	{
		try 
		{
			if(wifiIsGone())
			{
				throw new IOException("Wi-Fi Connection Lost!");
			}
		} catch (Exception e) 
		{
			System.out.println("Oops! Wi-Fi Connection Lost.Please check and try again,");
		}
	}
	public static boolean wifiIsGone()
	{
		return true;
	}
}