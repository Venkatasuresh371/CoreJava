package com.jsp.numberProgrames;

import java.util.Scanner;

public class ConvertDecimalToBinary 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);;
		System.out.println("enter a decimal number");
		int decNum=scn.nextInt();
		long pos=1,binNum=0;
		while(decNum>0)
		{
			int b=decNum%2;
			binNum=(b*pos)+binNum;
			decNum=decNum/2;
			pos=pos*10;
		}
		System.out.println("the binary number "+binNum);
		scn.close();
	}
}
