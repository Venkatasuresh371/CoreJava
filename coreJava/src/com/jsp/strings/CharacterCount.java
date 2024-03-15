package com.jsp.strings;

public class CharacterCount 
{
	public static void main(String[] args)
	{
		String s1 = "accbbbccccc";
		String s2= "";
		char a[] = s1.toCharArray();
		int i=0;
		while(i<a.length)
		{
			char ch = a[i];
			int count=1;
			while((i<a.length-1) && (a[i+1]==ch))
			{
				count++;
				i++;
			}
			s2=s2+count+ch+" ";
			i++;
		}
	}
}
