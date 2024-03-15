package com.jsp.loopingStatements;

public class FibonacciSeries2 
{
	public static void main(String[] args)
	{
		int n=100;
		int a=0;
		int b=1;
		while(a<=n)
		{
			System.out.print(a+" ");
			int c=a+b;
            a=b;
            b=c;
		}
	}
}
