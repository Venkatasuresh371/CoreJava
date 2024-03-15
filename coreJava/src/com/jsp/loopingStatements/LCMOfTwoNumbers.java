package com.jsp.loopingStatements;

public class LCMOfTwoNumbers 
{
	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		int n=a>b?a:b;
		while(true)
		{
			if(n%a==0 && n%b==0)
				break;
			n++;
		}
		System.out.println("LCM of "+a+" and "+b+" is "+n);
	}
}
