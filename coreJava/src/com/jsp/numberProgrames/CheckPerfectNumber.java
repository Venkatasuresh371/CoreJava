package com.jsp.numberProgrames;

import java.util.Scanner;

public class CheckPerfectNumber 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(n==sum)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");
		scn.close();
	}
}
