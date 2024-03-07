package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Suresh","Karthik","Harsha","Sai","venu");
		
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		
		List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
		
		list.stream().map(e->e.toLowerCase()).forEach(System.out::println);
		
		List<Integer> collect2 = list.stream().map(e->e.length()).collect(Collectors.toList());
		System.out.println(collect2);
	}
}