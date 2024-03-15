package com.jsp.conditionalStatements;

import java.util.Scanner;

public class SwitchStatement 
{
	public static void main(String[] args) 
	{
		System.out.println("enter payment option");
		String option = new Scanner(System.in).next();
		switch(option)
		{
		case "debit card":
			System.out.println("paid from debit card");
			break;
		case "credit card":
			System.out.println("paid through credit card");
			break;
		case "upi":
			System.out.println("paid through upi");
			break;
		default:
			System.out.println(option+" is not supported");
		}
	}
}
