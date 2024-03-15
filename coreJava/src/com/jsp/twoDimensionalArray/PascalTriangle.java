package com.jsp.twoDimensionalArray;

public class PascalTriangle
{
	public static int [][] pascalTriangle(int size)
	{
		int [][] a = new int [size][size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0 || i==j)
					a[i][j]=1;
				else
					a[i][j]=a[i-1][j-1] + a[i-1][j];
			}
		}
		return a;
	}
	public static void main(String[] args)
	{
		int [][] a=pascalTriangle(5);
		int spaces=5;
		for(int [] t:a)
		{
			for(int i=1;i<spaces;i++)
				System.out.print(" ");
			for(int n:t)
				System.out.print(n+" ");
			System.out.println();
			spaces--;
		}
	}
}
