package functionalnterface;

import java.util.function.Predicate;

class MyPredicate implements Predicate<String>
{
	@Override
	public boolean test(String t)
	{
		System.out.println(t+" java is awesome");
		return true;
	}
}

public class TestPredicate 
{
	public static void main(String[] args) 
	{
		Predicate<String> predicate = new MyPredicate();
		System.out.println(predicate.test("Hello dear"));
		
		Predicate<String> p = (s)->
		{
			System.out.println(s+" java is awesome");
			return true;
		};
		System.out.println(p.test("hi "));
	}
}