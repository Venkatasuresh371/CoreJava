package com.jsp.recursionProgrames;

public class FibonacciSeries 
{
	static int a=0,b=1,c;
	public static void fibonacci(int n)
	{
		if(n>0)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			fibonacci(n-1);
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		System.out.print(a+" "+b);
		fibonacci(n-2);
	}
}
