package com.jsp.twoDimensionalArray;

public class Demo2 
{
	public static void main(String[] args) 
	{
		int [][] a= {
				{1,3,4,5},
				{3,6,7},
				{1,4,6,9},
				{1,3}
		};
		for(int[]t:a)
		{
			for(int n:t)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}
