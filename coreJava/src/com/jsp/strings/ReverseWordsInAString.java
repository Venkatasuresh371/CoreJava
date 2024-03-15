package com.jsp.strings;

public class ReverseWordsInAString 
{
	public static void main(String[] args) {
		String str="welcome to java world";
		String s2="";
		System.out.println(str.length());
		String [] arr = str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			s2=s2+arr[i];
			if(i!=0)
				s2=s2+" ";
		}
		System.out.println(s2);
	}
}
