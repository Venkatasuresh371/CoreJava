package com.jsp.methods;

public class PrimeNumberRange
{
	public static void main(String[] args)
	{
		int a=0;
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
			{
				a++;
				if(a%2!=0)
				System.out.println(i);
			}
		}
		
	}

}
