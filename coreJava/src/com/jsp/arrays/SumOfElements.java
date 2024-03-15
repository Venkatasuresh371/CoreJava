package com.jsp.arrays;

public class SumOfElements
{
	public static void main(String[] args) 
	{
		int a[]= {1,3,5,6,7,9,4};
		int sum=0;
		String s="";
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			s=s+a[i];
			if(i<a.length-1)
			{
				s=s+" + ";
			}
		}
		s=s+" = "+sum;
		System.out.println(s);
	}
}
