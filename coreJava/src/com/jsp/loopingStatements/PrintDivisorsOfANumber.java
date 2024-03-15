package com.jsp.loopingStatements;

import java.util.Scanner;

public class PrintDivisorsOfANumber 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		System.out.println("divisors of "+n);
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
		scn.close();
	}
}
