package com.jsp.methods;

public class RangeOfPerfectNumbers 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=500;i++)
		{
			int res = isPerfect(i);
			if(i==res)
				System.out.println(i);
		}
	}
    public static int isPerfect(int n)
    {
    	int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		return sum;
    }
}
