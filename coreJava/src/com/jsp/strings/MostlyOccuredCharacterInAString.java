package com.jsp.strings;

import java.util.Scanner;

public class MostlyOccuredCharacterInAString
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scn.next();
		String s2="";
		int count=0;
		int count1=0;
		while(s1.length()>0)
		{
			char ch = s1.charAt(0);
			s2=s1.replace(ch+"", "");
			count=s1.length()-s2.length();
			s1=s2;
			if(count>1)
			{
				count1=count;
				System.out.println(ch+" ----> "+count1);
			}
		}
		scn.close();
	}
}
