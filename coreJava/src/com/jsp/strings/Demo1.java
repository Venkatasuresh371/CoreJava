package com.jsp.strings;

public class Demo1 
{
	public static void main(String[] args) 
	{
     String s="hello world";
     System.out.println(s.length());
     System.out.println("**************");
     for(int i=0;i<s.length();i++)
     {
    	 char c=s.charAt(i);
    	 System.out.println(c);
     }
     System.out.println("**************");
     char [] a = s.toCharArray();
     for(char ch : a)
    	 System.out.print(ch);
	}
}
