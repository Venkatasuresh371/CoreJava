package com.jsp.conditionalStatements;

public class NestedIf 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if(a==10)
		{
			if(b!=20)
			{
				System.out.println("b = "+b);
			}
			else
			{
				System.out.println("b = "+b);
			}
			System.out.println("a = "+a);
		}
	}
}
