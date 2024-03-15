package com.jsp.strings;

public class CheckStringIsPalindromeOrNot
{
	public static void main(String[] args)
	{
		String str = "malayalam";
		String s1 =str.toLowerCase();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		if(s1.equals(s2))
			System.out.println(s1+" is a palindrome string");
		else
			System.out.println(s1+" is not a palindrome string");
	}

}
