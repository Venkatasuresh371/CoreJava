package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethod
{
	public static void main(String[] args) 
	{
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(4,5,3,2));
		list.add(Arrays.asList(6,9,1,9));
		list.add(Arrays.asList(5,8,3,0));
		list.add(Arrays.asList(7,6,9,5));
		System.out.println(list);
		
		List<Integer> fmap = list.stream().flatMap(e ->e.stream()).collect(Collectors.toList());
		System.out.println(fmap);
	}
}