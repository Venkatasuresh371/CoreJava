package functionalnterface;

import java.util.function.Function;

class MyFunction implements Function<Integer,Integer>
{
	@Override
	public Integer apply(Integer t) 
	{
		return t*t;
	}
}
public class TestFunction 
{
	public static void main(String[] args) 
	{
		Function<Integer,Integer> function = new MyFunction();
		System.out.println(function.apply(10));
		
		Function<Integer,Integer> function1 = (a)-> { return a+10; };
		Function<Integer,Integer> function2 = (a)-> { return a-20; };
		Function<Integer,Integer> function3 = (a)-> { return a*30; };
		
		System.out.println(function1.apply(5));
		System.out.println(function2.apply(50));
		System.out.println(function3.apply(5));
	}

}
