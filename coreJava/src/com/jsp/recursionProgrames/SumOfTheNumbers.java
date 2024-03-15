package com.jsp.recursionProgrames;

import java.util.Scanner;

public class SumOfTheNumbers 
{
	public static long sum(long n)
	{
		if(n!=0)
			return n+sum(n-1);
		else
			return n;
	}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		long n = scn.nextLong();
		long result = sum(n);
		System.out.println(result);
		scn.close();
	}
}
