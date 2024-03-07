package methodReferences;

@FunctionalInterface
interface MyFuction
{
	public void m1();
}
public class Demo1
{
	public static void data()
	{
		System.out.println("static method");
	}
	public static void main(String[] args)
	{
		MyFuction f = ()->System.out.println("get method in inteface");
		f.m1();
		//method reference to static method
		MyFuction m = Demo1::data;
		m.m1();
	}
}