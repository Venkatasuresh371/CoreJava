package com.jsp.twoDimensionalArray;

public class SumOfEachRow 
{
	public static void main(String[] args) 
	{
		int [][] a = {
				{1,3,4},
				{2,5,6},
				{4,8,9}
		};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				sum+=a[i][j];
			System.out.println("sum of "+i+" row is:"+sum);
			sum=0;
		}
		System.out.println();
	}
}
