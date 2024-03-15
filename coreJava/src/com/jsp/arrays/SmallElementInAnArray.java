package com.jsp.arrays;

public class SmallElementInAnArray
{
	public static void main(String[] args) 
	{
		int a[] = {4,3,6,2,5};
		int small=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("Small element is: "+small);	
	}
}
