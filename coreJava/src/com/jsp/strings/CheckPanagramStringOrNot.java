package com.jsp.strings;

import java.util.Scanner;

public class CheckPanagramStringOrNot 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.next();
		System.out.println(s.length());
		if(panagram(s))
			System.out.println(s+" is a panagram string");
		else
			System.out.println(s+" is not a panagram string");
		scn.close();
	}
	public static boolean panagram(String s) 
	{
		for(char c='a';c<='z';c++)
		{
			if(s.contains(c+"")) return true;
		}
		return false;
	}
}
