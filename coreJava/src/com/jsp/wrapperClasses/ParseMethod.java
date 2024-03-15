package com.jsp.wrapperClasses;

public class ParseMethod 
{
	public static void main(String[] args) 
	{
		String s="35";
		int a= Integer.parseInt(s);
		System.out.println(a);
		String s2="36565.78";
		double d=Double.parseDouble(s2);
		System.out.println(d);
		String s3="123";
		System.out.println(Integer.parseInt(s3));
	}
}
