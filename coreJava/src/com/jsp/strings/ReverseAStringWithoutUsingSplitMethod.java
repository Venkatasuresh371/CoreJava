package com.jsp.strings;

public class ReverseAStringWithoutUsingSplitMethod
{
	public static void main(String[] args) 
	{
		String s1 ="java is an oop language";
		String s2 ="";
		int i=0;
		while (i<s1.length())
		{
			while (i<s1.length() && s1.charAt(i)==' ')
			{
				i++;
			}
			int start = i;
			while (i<s1.length() && s1.charAt(i)!=' ') 
			{
				i++;
			}
			int end=i;
			for(int j=end-1;j>=start;j--) 
			{
				s2 = s2 + s1.charAt(j);
			}
			if(i<s1.length())
			{
				s2=s2+' ';
			}
		}
		System.out.println(s1);
		System.out.println();
		System.out.println(s2);

	}
}
