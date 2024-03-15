package com.jsp.methods;

public class LargestPrimeNumber 
{
	public static void main(String[] args) 
	{
		boolean flag=true;
		for(int i=100;i>=1;i--)
		{
			if(i<=1)
				continue;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
