package com.jsp.twoDimensionalArray;

public class Demo3
{
	public static void main(String[] args) 
	{
		int [][] a= {
				{1,3,4,5},
				{3,6,7},
				{1,4,6,9},
				{1,3}
		};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
