package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipMethod
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(4,6,7,9,2,3,5);
		List<Integer> skip = list.stream().skip(4).collect(Collectors.toList());
		System.out.println(skip);
		
		List<String> list2 = Arrays.asList("a","b","r","g","q","p","d");
		list2.stream().skip(2).forEach(System.out::println);
	}
}