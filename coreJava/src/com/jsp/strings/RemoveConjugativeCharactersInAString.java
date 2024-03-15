package com.jsp.strings;

import java.util.Scanner;

public class RemoveConjugativeCharactersInAString 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scn.next();
		String s2 = "";
		for(int i=0;i<s1.length();i++)
		{
			if(!(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)))
			{
				s2 = s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
		scn.close();
	}
}
