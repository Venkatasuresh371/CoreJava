package com.jsp.arrays;

public class SecondSmallestElement 
{
	public static void main(String[] args) 
	{
		int a[] = {6,7,7,6,7,2};
		int s1=a[0];
		int s2=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<s1)
			{
				s2=s1;
				s1=a[i];
			}
			else if(a[i]<s2 || s1==s2)
			{
				s2=a[i];
			}
		}
		System.out.println("Second smallest element is "+s2);
	}
}
