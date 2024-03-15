package com.jsp.conditionalStatements;

import java.util.Scanner;

public class LargestAndSmallestDigitInANumber 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int largest=largest(n); 
		System.out.println("largest digit in "+n+" is --> "+largest);
		int smallest=smallest(n); 
		System.out.println("smallest digit in "+n+" is --> "+smallest);
	}
	public static int largest(int n)
	{
		int largest=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem > largest)
				largest=rem;
			n=n/10;
		}	
		return largest;
	}
	public static int smallest(int n)
	{
		int smallest=9;
		while(n!=0)
		{
			int rem=n%10;
			if(rem < smallest)
				smallest=rem;
			n=n/10;
		}	
		return smallest;
	}
	
}
