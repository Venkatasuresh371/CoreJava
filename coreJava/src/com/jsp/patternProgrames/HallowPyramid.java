package com.jsp.patternProgrames;

import java.util.Scanner;

public class HallowPyramid 
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("enter size:");
		int n = scn.nextInt();
		int stars=1;
		int spaces=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
				System.out.print("  ");
			for(int j=1;j<=stars;j++)
			{
				if(j==1||i==n||j==stars)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			spaces--;
			stars+=2;
		}
		scn.close();
	}

}
