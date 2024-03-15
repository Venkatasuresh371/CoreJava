package com.jsp.numberProgrames;

import java.util.Scanner;

public class CheckArmstrongNumber 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int temp=n;
		int count = (n+"").length();
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum+=(int)Math.pow(rem, count);
			n/=10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is an armstrong number");
		}
		else
		{
			System.out.println(temp+" is not an armstrong number");
		}
		scn.close();
	}
}
