package com.jsp.strings;

public class CheckPalindromeOrNot 
{
	public static void main(String [] args)
	{
		String s="malayalam";
		String s1="abcd";
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome(s1));
	}
	public static boolean isPalindrome(String s)
	{
		s=s.toLowerCase();
		char [] a =s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j)
		{
			if(a[i]!=a[j]) return false;
			i++;
			j--;
		}
		return true;
	}
}
