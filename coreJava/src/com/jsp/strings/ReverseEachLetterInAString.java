package com.jsp.strings;

public class ReverseEachLetterInAString 
{
	public static void main(String[] args) 
	{
		String input = "java is a oop language";
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		System.out.println(input1);
		input1.reverse();
		System.out.println(input1);
	}
}


