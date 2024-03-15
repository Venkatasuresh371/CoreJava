package com.jsp.numberProgrames;

import java.util.Scanner;

public class CheckPrimeOrNot 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		if(n<=1)
		{
			System.out.println(n+" is not a prime number");
			return;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				return;
			}
		}
		System.out.println(n+" is a prime number");
		scn.close();
		
	}

}
