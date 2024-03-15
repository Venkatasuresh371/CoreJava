package com.jsp.twoDimensionalArray;

public class TransposeOfAMatrix 
{
	public static void main(String[] args) 
	{
		int [][] a = {
				{2,4,6,7},
				{1,5,8,9},
				{3,8,5,9}
		};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[j][i]=a[i][j];
			}
		}
		for(int [] t:a)
		{
			for(int n:t)
				System.out.print(n+" ");
			System.out.println();
				
		}
		
	}

}
