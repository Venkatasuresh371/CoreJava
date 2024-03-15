package com.jsp.conditionalStatements;

import java.util.Scanner;

public class IfElseIf
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a , b and c values");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if((a>b)&&(a>c))
			System.out.println(a+" is a greatest number");
		else if((a<b)&&(c<b))
			System.out.println(b+" is a greatest number");
		else
			System.out.println(c+" is a greatest number");
		scn.close();
	}
}
