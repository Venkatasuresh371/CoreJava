
package com.jsp.searchingAlgorithms;

import com.jsp.sortingAlgorithms.BubbleSort;

public class BinarySearch 
{
	public static int search(int[] a ,int x)
	{
		int start=0,end=a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if
				(x==a[mid]) return mid;
			else if
				(x<a[mid]) end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int [] a = {3,1,5,1,3,5};
	    BubbleSort.sort(a);
		System.out.println(search(a,1));
	}
	
}
