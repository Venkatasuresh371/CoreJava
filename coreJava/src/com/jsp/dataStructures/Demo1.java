package com.jsp.dataStructures;

public class Demo1 
{
	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
		System.out.println(l);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50,2);
		System.out.println(l);
		l.remove(2);
		System.out.println("size "+l.size());
		for(int i=0;i<l.size();i++)
		{
			int n=(Integer)l.get(i);
			System.out.println(n);
		}
	}
}
