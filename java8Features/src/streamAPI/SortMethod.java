package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class SortMethod 
{
	public static void main(String[] args)
	{
		List<Integer> list = List.of(5,7,1,2,9,2,4,6);
		List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		List<String> list2 = List.of("suresh","karthik","venu","harsha","sai");
		List<String> sort2 = list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sort2);
	}
}