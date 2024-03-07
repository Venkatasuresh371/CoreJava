package defaultMethods;

interface A
{
	public void m1();
	public void m2();
	public static void m3()
	{
		System.out.println("m3 method");
	}
	default void m4()
	{
		System.out.println("m4 method");
	}
}
class AImplmentation implements A
{
	@Override
	public void m1() 
	{
		System.out.println("implementation of m1 method");
	}
	@Override
	public void m2()
	{
		System.out.println("implementation of m2 method");
	}
}
public class Demo1
{
	public static void main(String[] args) 
	{
		A a = new AImplmentation();
		a.m1();
		a.m2();
		A.m3();
		a.m4();
	}
}