package com.jsp.loopingStatements;

import java.util.Scanner;

public class ReverseANumber 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int rev=0;
		System.out.println("Original number = "+n);
		while(n!=0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("Reversed number = "+rev);
		scn.close();
	}
}
