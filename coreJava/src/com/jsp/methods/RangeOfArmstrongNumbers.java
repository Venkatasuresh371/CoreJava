package com.jsp.methods;

public class RangeOfArmstrongNumbers
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=500;i++)
		{
			int res = isArmstrong(i);
			if(i==res)
				System.out.println(i);
		}
	}
	public static int isArmstrong(int n)
	{
		int count = (n+"").length();
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum+=(int)Math.pow(rem, count);
			n/=10;
		}
		return sum;
	}
}
