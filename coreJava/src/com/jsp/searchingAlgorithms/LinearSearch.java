package com.jsp.searchingAlgorithms;

public class LinearSearch
{
	public static int search(int [] a,int x)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x) return i;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int [] a = {8,5,6,1,9,4,6};
		System.out.println(search(a,7));
	}
}
