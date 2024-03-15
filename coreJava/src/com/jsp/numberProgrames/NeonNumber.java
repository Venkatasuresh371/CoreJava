package com.jsp.numberProgrames;

import java.util.Scanner;

public class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int sqrt=(int)Math.pow(n,2);
		int sqrtSum=0;
		while(sqrt>0)
		{
			int rem = sqrt%10;
			sqrtSum = sqrtSum+rem;
			sqrt/=10;
		}
		if(n==sqrtSum)
			System.out.println(n+" is a neon number");
		else
			System.out.println(n+" is not a neon number");
		scn.close();
	}
}
