package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod 
{
	public static void main(String[] args)
	{
		List<Integer> list = List.of(5,3,6,2,6,8,2);
		System.out.println(list.stream().collect(Collectors.toList()));
		List<Integer> filter = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(filter);
		int sum = 0;
		for (Integer i : list)
		{
			if (i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		int sum1 = list.stream().filter(n->n%2==0).mapToInt(n->n).sum();
		System.out.println(sum1);
		
		List<String> list2 = Arrays.asList("hello","hari","suresh","venu");
		List<String> collect = list2.stream()
				.filter(e->e.toUpperCase().startsWith("H"))
				.collect(Collectors.toList());
		System.out.println(collect);
	}
}