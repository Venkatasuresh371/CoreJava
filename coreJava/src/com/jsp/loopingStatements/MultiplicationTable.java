package com.jsp.loopingStatements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a value");
		int a=scn.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+" X "+i+" = "+(a*i));
		}
		scn.close();
	}
}
