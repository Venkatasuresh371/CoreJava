package com.jsp.dataStructures;

public class Demo3 
{
	public static void main(String[] args) 
	{
		Stack s= new Stack();
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.push(10);
		s.push(20);
		s.push(30);	
		s.push(40);
		s.push(60);
		System.out.println(s.size());
		System.out.println(s);
		s.pop();
		System.out.println(s);
	    System.out.println(s.isEmpty());
	}
}
