package com.jsp.operators;

import java.util.Scanner;

public class TernaryOperator
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter age of the person");
		int n=scn.nextInt();
		String s=(n>18)?"the person is eligible for married":"the person is not eligible for married";
		scn.close();
		System.out.println(s);
	}
}
