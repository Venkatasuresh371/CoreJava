package com.jsp.methods;

public class RangeOfStrongNumbers 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=500;i++)
		{
			int res = isStrong(i);
			if(i==res)
				System.out.println(i);
		}
	}
	public static int isStrong(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum+=fact;
			n=n/10;
		}
		return sum;
	}
}
