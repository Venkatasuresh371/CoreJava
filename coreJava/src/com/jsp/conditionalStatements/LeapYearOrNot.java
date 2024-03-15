package com.jsp.conditionalStatements;

import java.util.Scanner;

public class LeapYearOrNot
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the year");
		int y = scn.nextInt();
		if((y%400==0)||(y%100!=0 && y%4==0))
			System.out.println(y+" is a leap year");
		else
			System.out.println(y+" is not a leap year");
		scn.close();
	}

}
