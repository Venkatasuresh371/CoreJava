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
		System.out.println(predicate.test("Hello java"));
		
		Predicate<String> p = (s)->
		{
			if(s.length()>= 5)
				return true;
			else
				return false;
		};
		System.out.println(p.test("hi"));
	}
}