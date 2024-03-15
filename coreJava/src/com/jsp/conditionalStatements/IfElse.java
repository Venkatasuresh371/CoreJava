package com.jsp.conditionalStatements;

import java.util.Scanner;

public class IfElse 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		if(n%2==0)
			System.out.println(n+" is an even number");
		else
			System.out.println(n+" is an odd number");
		scn.close();
	}
}
