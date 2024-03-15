package com.jsp.dataStructures;

public class Demo2 
{
	public static void main(String[] args) 
	{
		SingleLinkedList l = new SingleLinkedList();
		System.out.println(l);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(60);
	    System.out.println(l);
	    l.reverse();
		l.add(2, 50);
		System.out.println(l);
		System.out.println("size "+l.size());
		l.remove(3);
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));
	}
}
