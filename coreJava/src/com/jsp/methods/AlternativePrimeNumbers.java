package com.jsp.methods;

public class AlternativePrimeNumbers
{
	public static void main(String[] args)
	{
		int count=0;
		boolean flag=true;
		for(int i=2;i<=100;i++)
		{
			if(i<=1)
				continue;
			for(int j=2;j<=i/2;j++)
			{
				flag=true;
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				count++;
				if(count%2!=0)
					System.out.println(i);
			}
		}
	}
}