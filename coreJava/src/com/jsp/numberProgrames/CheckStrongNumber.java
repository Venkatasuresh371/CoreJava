package com.jsp.numberProgrames;

import java.util.Scanner;

public class CheckStrongNumber 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int temp = n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum+=fact;
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+" is a strong number");
		else
			System.out.println(temp+" is not a strong number");
		scn.close();
	}
}
