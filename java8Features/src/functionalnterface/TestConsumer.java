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
		
		Consumer<String> consumer1 =(s)-> System.out.println("consumer1 : "+s.length());
		Consumer<String> consumer2 =(s)-> System.out.println("consumer2 : "+s.concat(" paleti"));
		Consumer<String> consumer3 =(s)-> System.out.println("consumer3 : "+s.toUpperCase());
		
		consumer1.andThen(consumer2).andThen(consumer3).accept("suresh");
	}
}