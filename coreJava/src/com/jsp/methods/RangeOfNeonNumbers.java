package com.jsp.methods;

public class RangeOfNeonNumbers 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			int res=isNeon(i);
			if(i==res)
				System.out.println(i);
		}
	}
	public static int isNeon(int n)
	{
		int sqrt=(int)Math.pow(n,2);
		int sqrtSum=0;
		while(sqrt>0)
		{
			int rem = sqrt%10;
			sqrtSum = sqrtSum+rem;
			sqrt/=10;
		}
		return sqrtSum;
	}
}
