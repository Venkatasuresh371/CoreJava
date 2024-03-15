package com.jsp.searchingAlgorithms;

import com.jsp.sortingAlgorithms.BubbleSort;

public class BinarySearchUsingRecursion 
{
	public static int search(int[] a ,int x,int start,int end)
	{
		if(start>end) return -1;
		int mid=(start+end)/2;
		if(x==a[mid])
			return mid;
		else if(x<a[mid])
			return search(a,x,start,mid-1); 
		else
			return search(a,x,mid+1,end);
	}
	public static void main(String[] args)
	{
		int [] a = {3,1,5,1,3,5};
		BubbleSort.sort(a);
		System.out.println(search(a,3,0,a.length-1));
	}
}
