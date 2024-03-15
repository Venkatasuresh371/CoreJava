package com.jsp.methods;

public class C 
{
	int i;
	static int j;
	public static void main(String[] args)
	{
		C c1 = new C();
		C c2 = new C();
		c1.i=10;
		c2.i=20;
		System.out.println(c1.i);
		System.out.println(c2.i);
		//c1.j=30;
		C.j=40;
		System.out.println(C.j);
		//System.out.println(c1.j);
		//System.out.println(c2.j);
	}
}
