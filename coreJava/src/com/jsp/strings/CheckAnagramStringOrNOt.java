package com.jsp.strings;

import java.util.Scanner;

public class CheckAnagramStringOrNOt 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scn.next();
		String s2=scn.next();
		if(anagram(s1, s2))
			System.out.println(s1+" and "+s2+" are anagram strings");
		else
			System.out.println(s1+" and "+s2+" are not a anagram strings");
	}
	public static boolean anagram(String s1,String s2)
	{
		while(true)
		{
			if(s1.length()==0 && s2.length()==0)
				return true;
			if(s1.length()!=s2.length())
				return false;
			char c=s1.charAt(0);
			s1=s1.replaceAll(c+"", "");
			s2=s2.replaceAll(c+"", "");
		}
	}

}
