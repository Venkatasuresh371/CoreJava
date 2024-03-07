package streamAPI;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctMethod 
{
	public static void main(String[] args)
	{
		List<Integer> list = List.of(5,3,6,7,4,3,2,3,7,5);
		List<Integer> list2 = list.stream().collect(Collectors.toList());
		System.out.println(list2);
		Set<Integer>  distinct= list.stream().distinct().collect(Collectors.toSet());
		System.out.println(distinct);
	}
}