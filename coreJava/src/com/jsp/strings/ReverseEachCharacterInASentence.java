package com.jsp.strings;

public class ReverseEachCharacterInASentence 
{
	public static void main(String[] args) 
	{
		String s1="java is easy";
		String[] words=s1.split(" ");
		String s2="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reversedWord = "";
			for(int j=word.length()-1;j>=0;j--)
			{
				reversedWord+=word.charAt(j);
			}
			s2=s2+reversedWord+" ";
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
