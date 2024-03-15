package com.jsp.strings;

public class ReverseEachWordAndReverseWordsInSentence
{
	public static void main(String[] args)
	{
		String s="java is super";
		String[] words=s.split(" ");
		String s2="";
		for(int i=words.length-1;i>=0;i--)
		{
			String word=words[i];
			String reversedWord ="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reversedWord+=word.charAt(j);
			}
			s2=s2+reversedWord+" ";
		}
		System.out.println(s);
		System.out.println(s2);
	}
}
