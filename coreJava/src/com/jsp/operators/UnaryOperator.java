package com.jsp.operators;

public class UnaryOperator 
{
	public static void main(String[] args)
	{
    int a=10;
    System.out.println(a++);
    System.out.println(++a);
    System.out.println(--a);
    System.out.println(a--);
    int b=a++ + ++a + --a + a--;
    System.out.println(a);
    System.out.println(b);
	}
}
