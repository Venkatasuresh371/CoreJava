package com.jsp.strings;

public class SumNumbersInAString 
{
	public static void main(String[] args)
	{
		String s = "suresh@2001346";
		int sum = 0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int num =ch-48;
				sum=sum+num;
			}
		}
		System.out.println(sum);
	}
}
