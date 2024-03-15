package com.jsp.strings;

public class ReverseEachWordInASentence 
{
	public static void main(String[] args) 
	{
		String  str="welcome to java oops";
		String [] s1=str.split(" ");
		String s2="";
		for(int i=s1.length-1;i>=0;i--)
		{
			s2=s2+s1[i]+" ";
		}
		System.out.println(s2.substring(0,s2.length()-1));	
	}
}
