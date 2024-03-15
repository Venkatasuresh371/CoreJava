package com.jsp.methods;

import java.util.Scanner;

public class ScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a text");
		//String txt1=scn.next();
		String txt2=scn.nextLine();
		//System.out.println(txt1);
		System.out.println(txt2);
		scn.close();
	}
}
