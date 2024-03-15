package com.jsp.sortingAlgorithms;

public class SelectionSort 
{
	public static void sort(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min_index = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min_index])
				{
					min_index=j;
				}
			}
			if(i!=min_index)
			{
				int temp=a[min_index];
				a[min_index] = a[i];
				a[i]=temp;
			}
		}
	}
	public static void main(String[] args)
	{
		int [] a= {9,5,1,5,3,2};
		sort(a);
		for(int n:a)
			System.out.print(n+" ");
	}

}
