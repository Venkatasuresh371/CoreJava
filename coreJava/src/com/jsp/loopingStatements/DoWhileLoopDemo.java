package com.jsp.loopingStatements;

public class DoWhileLoopDemo
{
	public String findElementInArr(int arr[],int elementTobeFound)
	{
	    int i=0;
	    do
	    {
	        if(arr[i]==elementTobeFound)
	        {
	            System.out.println(elementTobeFound+" IS PRESENT IN THE ARRAY ");
	            return "PRESENT";
	        }
	        i++;
	    }while(i<arr.length);
	 
	    return "SORRY!.... "+elementTobeFound+ " IS NOT PRESENT IN THE ARRAY";
	 }
	public static void main(String[] args) 
	{
		int a[]= {34,568,3298,549,23,45};
		DoWhileLoopDemo demo = new DoWhileLoopDemo();
		String findElementInArr = demo.findElementInArr(a,9);
		System.out.println(findElementInArr);
	}
}