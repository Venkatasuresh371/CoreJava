package com.jsp.strings;

public class Demo3
{
	public static void main(String[] args)
	{
		String s="This is a test String";
		String[] s1=s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			if(i%2!=0)
			{
				String word=s1[i];
				String str = "";
				for(int j=word.length()-1;j>=0;j--)
				{
					str+=word.charAt(j);
				}
				s2=s2+str+" ";
			}
			else
			{
				String word=s1[i];
				String s3=word.toUpperCase();
				s2=s2+s3+" ";
			}
		}
		System.out.println(s2);
	}
}
