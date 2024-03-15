package com.jsp.recursionProgrames;

import java.util.Scanner;

public class SumOfDigitsInANumber 
{
	public static int sum(int n)
	{
		if(n==0) return 0;
		return n%10 + sum(n/10);
	}
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int result =sum(n);
		System.out.println("sum of digits in "+n+" = "+result);
		scn.close();
	}
}
