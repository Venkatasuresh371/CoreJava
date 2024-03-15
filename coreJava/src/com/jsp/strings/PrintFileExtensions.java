package com.jsp.strings;

public class PrintFileExtensions 
{
	public static void main(String[] args)
	{
		String fileName = "resume.pdf";
		int index =fileName.indexOf('.');
		if(index>0) 
		{
			String extension = fileName.substring(index+1);
			System.out.println("File extension is : "+extension);
		}
	}
}