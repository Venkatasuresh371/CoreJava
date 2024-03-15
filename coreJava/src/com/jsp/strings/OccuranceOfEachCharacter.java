package com.jsp.strings;

public class OccuranceOfEachCharacter 
{
	public static void main(String[] args)
	{
		int counter[]=new int [256];
		String str="javatpoint";
		for(int i=0;i<str.length();i++)
		{
			counter[str.charAt(i)]++;
		}
		for(int i=0;i<256;i++)
		{
			if(counter[i]!=0)
				System.out.println((char)i+" ---------> "+counter[i] );
		}
	}
}
