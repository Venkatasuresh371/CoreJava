package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamClassMethods
{
	public static void main(String[] args)
	{
		List<Integer> list = List.of(4,6,3,5,7,7,9,1,4);
		
		List<List<Integer>> list2 = new ArrayList<>();
		list2.add(Arrays.asList(4,5,3,2));
		list2.add(Arrays.asList(6,9,1,9));
		list2.add(Arrays.asList(5,8,3,0));
		list2.add(Arrays.asList(7,6,9,5));
		
		List<Integer> filter = list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println(filter);
		
		List<Integer> map = list.stream().map(e->e*2).collect(Collectors.toList());
		System.out.println(map);
		
		List<Integer> fmap = list2.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(fmap);
		
		List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		Set<Integer>  distinct= list.stream().distinct().collect(Collectors.toSet());
		System.out.println(distinct);
		
		List<Integer> limit = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(limit);
		
		long count = list.stream().count();
		System.out.println(count);
		
		List<Integer> skip = list.stream().skip(3).collect(Collectors.toList());
		System.out.println(skip);
		
		boolean allMatch = list.stream().allMatch(e->e%2==0);
		System.out.println(allMatch);
		
		boolean anyMatch = list.stream().anyMatch(e->e%2!=0);
		System.out.println(anyMatch);
		
		boolean noneMatch = list.stream().noneMatch(e->e%2!=0);
		System.out.println(noneMatch);
		
		Integer findFirst = list.stream().findFirst().get();
		System.out.println(findFirst);
		
		Integer findAny = list.stream().findAny().get();
		System.out.println(findAny);
		
		Integer max = list.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(max);
		
		Integer min = list.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println(min);
		
	}
}