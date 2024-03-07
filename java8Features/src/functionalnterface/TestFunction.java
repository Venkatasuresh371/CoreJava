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
		
		Function<Integer,Integer> function1 = (a)->
		{
			return a*10;
		};
		System.out.println(function1.apply(5));
	}

}
