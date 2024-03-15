package com.jsp.methods;

public class RangeOfNevenNumbers
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			int res=isNeven(i);
			if(i%res==0)
				System.out.println(i);
		}
	}
	public static int isNeven(int n)
	{

		int sum =0;
		while(n>0)
		{
			int rem=n%10;
			sum = sum+rem;
			n=n/10;
		}
		return sum;
	}
}
