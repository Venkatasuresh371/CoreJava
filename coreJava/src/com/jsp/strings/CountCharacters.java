package com.jsp.strings;

public class CountCharacters
{
	public static void main(String[] args) 
	{
		String s = "Suresh@#$2001";
		int number = 0;
		int alphabets = 0;
		int symbol = 0;
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
				alphabets++;
			else if(ch>='0' && ch <='9')
				number++;
			else
				symbol++;
		}
		System.out.println("Alphabets = "+alphabets);
		System.out.println("Numbers = "+number);
		System.out.println("Symbols = "+symbol);
	}
}
