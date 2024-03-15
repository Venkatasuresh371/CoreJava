package com.jsp.strings;

public class CountNumberOfRepeatedWordsInAString
{
	public static void main(String[] args) 
	{
		String str = "geeks for geeks is a computer portal website for geeks";
		int count=1;
		String str1=str.toLowerCase();
		String a[] =str1.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					a[j]=" ";
				}
			}
			if(a[i]!=" " && count>0)
			{
				System.out.println(a[i]+"---->"+count);
				count=1;
			}
		}
	}
}