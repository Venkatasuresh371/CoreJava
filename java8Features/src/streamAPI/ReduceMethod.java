package streamAPI;

import java.util.List;
import java.util.Optional;

public class ReduceMethod
{
	public static void main(String[] args) 
	{
		List<String> list = List.of("java","is","awesome","java");
		Optional<String> reduce = list.stream().reduce((a,b)->a+" "+b);
		System.out.println(reduce.get());
	}
}