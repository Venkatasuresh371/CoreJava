package com.jsp.strings;

public class RemoveDuplicateCharacters 
{
	public static void main(String[] args)
	{
		String s1 = "engineering";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			int ch = s1.charAt(i);
			//if(!s2.contains(ch+""))
			if(s2.indexOf(ch)==-1)
			{
				s2=s2+ch;
			}
		}
		System.out.println(s2);
	}
}
