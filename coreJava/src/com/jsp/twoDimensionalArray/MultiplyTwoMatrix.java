package com.jsp.twoDimensionalArray;

public class MultiplyTwoMatrix 
{
	public static int[][] multiply(int[][]a,int[][]b)
	{
		int len=a.length;
		int [][] c=new int[len][len];
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				for(int k=0;k<len;k++)
				{
					c[i][j] = c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		return c;
	}
	public static void main(String [] args)
	{
		int [][] a = {
				{1,3,4},
				{2,5,6},
				{4,8,9}
		};
		int [][] b = {
				{4,3,6},
				{2,5,2},
				{4,3,6}
		};
		int [][] c=multiply(a,b);
		for(int [] temp:c)
		{
			for(int n:temp)
				System.out.print(n+" ");
			System.out.println();
		}
	}
}
