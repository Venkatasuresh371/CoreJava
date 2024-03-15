package com.jsp.loopingStatements;

public class FibonacciSeries3 
{
	public static void main(String[] args)
	{
		int l=10;
		int u=100;
		int a=0;
		int b=1;
		while(a<=u)
		{
			if(a>=l)
			{
				System.out.print(a+" ");
			}
			int c=a+b;
			a=b;
			b=c;

		}
	}
}
