package com.jsp.arrays;

public class ReverseAnArray
{
	public static void main(String[] args) 
	{
		int a[] = {1,3,4,5,6,7};
		for(int n:a)
			System.out.print(n+" ");
		System.out.println();
		System.out.println("***************");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}	
	}
}
