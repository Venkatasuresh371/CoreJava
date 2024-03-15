package com.jsp.twoDimensionalArray;

public class SmallestAndLargesElementInAnArray
{
	public static void main(String[] args) 
	{
		int [][] a = {
				{2,4,6,7},
				{1,5,8,9},
				{3,8,5,9}
		};
		int small = a[0][0];
		int highest = a[0][0];
		int j;
		for(int i=0;i<a.length;i++)
		{
			for( j=0;j<a[i].length;j++)
			{
				if(small>a[i][j])
					small=a[i][j];
				if(highest<a[i][j])
					highest=a[i][j];
			}
			System.out.print("Smallest element: "+small);
			System.out.println();
			System.out.print("highest element: "+highest);
			System.out.println();
		}
		small=a[0][0];
		highest=a[0][0];
	}
}
