package com.jsp.strings;

public class RevesreAWordsInAPlaceWithoutUsingSplitMethod
{
	public static void main(String[] args) 
	{
		String s1="java is a oop language";
		System.out.println(s1);
		String s2="";
		char [] a = s1.toCharArray();
		int i=0;
		int j=0;
		while(i<a.length)
		{
			while(i<a.length && a[i]!=' ')
			{
				i++;
			}
			String temp="";
			int k=i-1;
			while(k>=j)
			{
				temp=temp+a[k];
				k--;
			}
			s2=s2+temp;
			if(i>0)
				s2+=" ";
			i++;
			j=i;
		}
		System.out.println();
		System.out.println(s2);
	}
}
