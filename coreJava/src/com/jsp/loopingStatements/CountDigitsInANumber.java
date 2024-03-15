package com.jsp.loopingStatements;

import java.util.Scanner;

public class CountDigitsInANumber 
{
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println(count);
		scn.close();
	}
}
