package com.jsp.strings;

public class CountWordsInAString 
{
	public static void main(String[] args)
	{
		String words = "One Two Three";
		int countWords = words.split(" ").length;
		System.out.println(countWords);
	}
}
