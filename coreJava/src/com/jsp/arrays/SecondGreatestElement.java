package com.jsp.arrays;

public class SecondGreatestElement 
{
	public static void main(String[] args) 
	{
		int a[] = {4,3,6,3,2,5,5,8,7};
		int s1=a[0];
		int s2=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>s1)
			{
				s2=s1;    
				s1=a[i]; 
			}
			else if(a[i]>s2 || s1==s2)
			{
				s2=a[i]; 
			}
		}
		System.out.println("Second greatest element is "+s2);
	}
}
