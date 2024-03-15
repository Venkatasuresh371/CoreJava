package com.jsp.conditionalStatements;

import java.util.Scanner;

public class IfStatement
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the age");
		int n = scn.nextInt();
		if(n>21)
		{
			System.out.println("person is ready to get married");
		}
		System.out.println("hello world...............!");
		scn.close();
	}
}
