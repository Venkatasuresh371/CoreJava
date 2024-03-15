package com.jsp.twoDimensionalArray;

public class SumOfDiagonalElements 
{
	public static void main(String []args)
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
		int length=a.length;
		for(int i=0;i<length;i++)
		{
			sum=sum+a[i][i];
			if((length%2)!=0 && (i==length/2))
				continue;
			sum=sum+a[i][length-1-i];
		}
		System.out.println("Sum is : "+sum);
	}
}
