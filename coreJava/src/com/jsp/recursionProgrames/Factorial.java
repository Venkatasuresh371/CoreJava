package com.jsp.recursionProgrames;

import java.util.Scanner;

public class Factorial 
{
	public static long fact(long n)
	{
		if(n==0 || n==1) return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		long n = scn.nextLong();
		long result = fact(n);
		System.out.println(n+"! = "+result);
		scn.close();
	}

}
