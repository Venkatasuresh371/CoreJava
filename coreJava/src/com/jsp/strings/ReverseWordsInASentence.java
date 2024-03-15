package com.jsp.strings;

public class ReverseWordsInASentence
{
	public static void main(String[] args)
	{
		String s1="java is an oop language";
		String s2="";
		char [] a = s1.toCharArray();
		int i=a.length-1;
		int j=a.length-1;
		while(i>=0)
		{
			while(i>=0 && a[i]!=' ')
			{
				i--;
			}
			String temp="";
			int k=i+1;
			while(j>=k)
			{
				temp=temp+a[j];
				j--;
			}
			s2=s2+temp;
			if(i>=0)
				s2+=" ";
			i--;
			j=i;
		}
		System.out.println(s1);
		System.out.println(s2);
	}
	

}
