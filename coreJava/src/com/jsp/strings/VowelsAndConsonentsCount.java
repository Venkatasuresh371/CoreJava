package com.jsp.strings;

public class VowelsAndConsonentsCount
{
	public static void main(String[] args)
	{
		String s= "suresh";
		int vowelCount=0;
		int consonetCount=0;
		String vowels="aeiouAEIOU";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(vowels.contains(c+""))
				vowelCount++;
			else
				consonetCount++;
		}
		System.out.println("Volwels count = "+vowelCount);
		System.out.println("Consonent count = "+consonetCount);
	}
}
