package functionalnterface;

import java.util.function.Supplier;

class MySupplier implements Supplier<Integer>
{
	@Override
	public Integer get()
	{
		return 10;
	}
}
public class TestSupplier
{
	public static void main(String[] args)
	{
		Supplier<Integer> supplier = new MySupplier();
		System.out.println(supplier.get());
		
		Supplier<Integer> supplier1 = ()-> 
		{
			return 50;
		};
		System.out.println(supplier1.get());
	}
}