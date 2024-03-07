package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod
{
	public static void main(String[] args)
	{
		List<Integer> list = List.of(59,30,47,10,48,55);
		List<Integer> limit = list.stream().limit(4).collect(Collectors.toList());
		System.out.println(limit);
	}
}