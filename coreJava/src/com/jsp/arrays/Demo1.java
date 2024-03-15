package com.jsp.arrays;

public class Demo1 
{
	public static void main(String[] args) 
	{
		int [] a = {1,4,2,4,5,6,8};
		int [] b = {2,5,3,6,7,8,9,1};
		for(int n:a)
			System.out.print(n+" ");
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
