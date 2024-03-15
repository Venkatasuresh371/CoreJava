package com.jsp.recursionProgrames;

public class Print1To10 
{
	static int n=0;
	public static void count()
	{
		n++;
		if(n<=50)
		{
			System.out.println(n);
			count();
		}
	}
	public static void main(String[] args) 
	{
		count();
	}
}
