package com.jsp.conditionalStatements;

import java.util.Scanner;

public class SecondLargestDigitInANumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num, reminder, Largest= 0,Sec_Largest=0;
		System.out.println("Enter the Number :");
		num=sc.nextInt();  
		while (num != 0)
		{
			reminder = num % 10;  
			if (Largest<reminder)   
			{
				Sec_Largest=Largest;  
				Largest = reminder;   
			}
			else if(reminder>=Sec_Largest) 
				Sec_Largest=reminder;  
			num = num / 10;  
		}

		System.out.println("The Second Largest Digit is "+ Sec_Largest);
		sc.close();
	}
}

