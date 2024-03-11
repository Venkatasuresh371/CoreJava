package accessModifiers;

import accessModifiers1.Demo2;

public class DefaultModifierDemo
{
	public static void main(String[] args) 
	{
		Demo2 d2 = new Demo2();
//		System.out.println(d2.a); variable a is in another package with default modifier so we cannot access.
//		d2.m3(); method m3() is in another package with default modifier so we cannot access.
	}

}
