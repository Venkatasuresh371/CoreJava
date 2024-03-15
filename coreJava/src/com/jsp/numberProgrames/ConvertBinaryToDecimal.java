package com.jsp.numberProgrames;

import java.util.Scanner;

public class ConvertBinaryToDecimal
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter binary number");
		long binNum=scn.nextLong();
	    int i=1;
	    long decNum=0;
	    long sum=0;
	    while(binNum>0)
	    {
	    	decNum =(binNum%10)*i;
	    	binNum=binNum/10;
	    	i=i*2;
	    	sum= (sum+decNum);
	    }
		System.out.println("decimal number "+sum);
		scn.close();
	}
}
