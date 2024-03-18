package com.jsp.loopingStatements;

public class ForLoopDemo
{
	public String findElementInArr(int arr[], int elementTobeFound) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] == elementTobeFound) 
			{
				return elementTobeFound+" IS PRESENT IN THE ARRAY ";
			}
		}
		return "SORRY!.... " + elementTobeFound + " IS NOT PRESENT IN THE ARRAY";
	}

	public static void main(String[] args) {
		int a[] = { 34, 568, 3298, 549, 23, 45 };
		WhileLoopDemo demo = new WhileLoopDemo();
		String findElementInArr = demo.findElementInArr(a,99);
		System.out.println(findElementInArr);
	}
}