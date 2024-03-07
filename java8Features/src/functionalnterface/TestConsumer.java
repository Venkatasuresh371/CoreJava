package functionalnterface;

import java.util.function.Consumer;

class MyConsumer implements Consumer<String>
{
	@Override
	public void accept(String t)
	{
		System.out.println(t);
	}
}
public class TestConsumer 
{
	public static void main(String[] args) 
	{
		Consumer<String> consumer = new MyConsumer();
		consumer.accept("welcome to java 8 features");
		
		Consumer<String> consumer1=(s)->
		{
			System.out.println(s.length());
		};
		consumer1.accept("hi suresh");
	}
}