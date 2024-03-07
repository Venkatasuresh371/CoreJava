package methodReferences;

@FunctionalInterface
interface MyFunctionData
{
	void getData();
}
public class Demo2
{
	public void myMethod() 
	{
		System.out.println("instance method");
	}
	public static void main(String[] args) 
	{
		Demo2 d = new Demo2();
		MyFunctionData m = d::myMethod;
		m.getData();
	}
}