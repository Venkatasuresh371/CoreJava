package defaultMethods;

import java.util.Optional;

public class OptionalClassDemo
{
	public static void main(String[] args)
	{
	String s1 = "Hello";
	String s2 = null;
	
	Optional<String> o1 = Optional.ofNullable(s1);
	Optional<String> o2 = Optional.ofNullable(s2);
	System.out.println(o1.isPresent()); //true
	System.out.println(o2.isPresent()); //false
	System.out.println();
	System.out.println(o1.orElse("world"));//Hello
	System.out.println(o2.orElse("world"));//world
	System.out.println();
	System.out.println(o1.get());//Hello
	System.out.println();
	System.out.println(o1.isEmpty()); //false
	System.out.println(o2.isEmpty()); //true
	System.out.println();
	o1.ifPresent(s -> System.out.println(s.toUpperCase()));//HELLO
	}
}