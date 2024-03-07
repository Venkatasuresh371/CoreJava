package defaultMethods;

interface A1
{
	default void def()
	{
		System.out.println("default method of interface A");
	}
	public void m1();
	public static void m2()
	{
		System.out.println("static method of interface A");
	}
}
interface B1
{
	default void def1()
	{
		System.out.println("default method of interface B");
	}
	public void m2();
}
class C implements A1,B1
{
	@Override
	public void m2()
	{
		System.out.println("overriden method of interface A1");
	}

	@Override
	public void m1() 
	{
		System.out.println("overriden method of interface B1");
	}

//	@Override
//	public void def() 
//	{
//		A1.super.def();
//	}
	
	
//	@Override
//	public void def() 
//	{
//		System.out.println("default method of C class");
//	}
}
public class Demo2
{
	public static void main(String[] args)
	{
		A1 a1 = new C();
		a1.m1();
		a1.def();

		
		B1 b1 = new C();
		b1.m2();
		b1.def1();
		
		
	}
}