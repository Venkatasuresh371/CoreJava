package com.jsp.strings;

// Replace a string with out using replace method

public class ReplaceAStringWithOutUsingReplaceMethod 
{
	public static void replace(String str,String old_word,String new_word)
	{
		System.out.println(str);
		String s1[] = str.split(" ");
		String new_str="";
		for(String words:s1)
		{
			if(words.equals(old_word))
				new_str+=new_word+" ";
			else
				new_str+=words+" ";
		}
		System.out.println();
		System.out.println(new_str);
	}
	public static void main(String[] args) 
	{
		String str="my name is suresh";
		String old_word = "my";
		String new_word="his";
		replace(str, old_word, new_word);
	}
}
