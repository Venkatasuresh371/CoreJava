package com.jsp.arrays;

public class HighestElementInAnArray 
{
	public static void main(String[] args)
	{
		int a[] = {4,3,6,3,2,5};
		int highest=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>highest)
			{
				highest=a[i];
			}
		}
		System.out.println("Highest element is: "+highest);
	}
}
