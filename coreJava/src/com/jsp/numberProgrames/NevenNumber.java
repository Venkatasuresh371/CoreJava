package com.jsp.numberProgrames;

import java.util.Scanner;

public class NevenNumber 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		if(n<=0)System.out.println("enter positive valiues");
		else
		{
			int temp = n;
			int sum =0;
			while(n>0)
			{
				int rem=n%10;
				sum = sum+rem;
				n=n/10;
			}
			if(temp%sum==0)System.out.println(temp+" is a neven number");
			else System.out.println(temp+" is not a neven number");
		}
		scn.close();
	}
}
