package com.jsp.patternProgrames;

import java.util.Scanner;

public class Pattern1 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter size:");
		int n = scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
				if(j!=i)
					System.out.print("* ");
			}
			System.out.println();
		}
		scn.close();
	}
}
