package com.jsp.strings;

public class ChangeChracterCases 
{
	public static void main(String[] args)
	{
		String s = "SurESh";
		char ch = ' ';
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			char ch1 = s.charAt(i);
			if(ch1>='A' && ch1<='Z')
				ch=(char)(ch1+32);
			else if(ch1>='a' && ch1<='z')
				ch=(char)(ch1-32);
			temp=temp+ch;
		}
		System.out.println(temp);
	}
}