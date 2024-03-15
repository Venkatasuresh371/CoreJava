package com.jsp.loopingStatements;

public class GCDOfTwoNumbers
{
	public static void main(String[] args)
	{
		int a=100;
		int b=200;
		int n=a>b?a:b;
		while(true)
		{
			if(a%n==0 && b%n==0)
				break;
			n--;
		}
		System.out.println("GCD of "+a+" and "+b+" is "+n);
	}
}
