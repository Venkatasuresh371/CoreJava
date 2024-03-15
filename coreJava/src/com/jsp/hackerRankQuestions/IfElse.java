package com.jsp.hackerRankQuestions;

import java.util.Scanner;

public class IfElse
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n%2==1)
			System.out.println("Weird");
		else if(n%2==0 && (n>=2 && n<=6))
			System.out.println("Not Weird");
		else if(n%2==0 && (n>=6 && n<=20))
			System.out.println("Not Weird");
		else
			System.out.println("Not Weird");
		scn.close();
	}
}