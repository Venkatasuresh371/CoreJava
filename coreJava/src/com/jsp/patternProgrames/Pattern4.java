package com.jsp.patternProgrames;

import java.util.Scanner;

public class Pattern4 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter size:");
		int n = scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				int num = ((i-1)*n)+1;
				for(int j=1;j<=n;j++)
				{
					System.out.print(num+"  ");
					num++;
				}
			}
			else
			{
				int num =i*n;
				for(int j=1;j<=n;j++)
				{
					System.out.print(num+"  ");
					num--;
				}
			}
			System.out.println();
		}
		scn.close();
	}
}
