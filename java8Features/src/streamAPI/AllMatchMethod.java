package streamAPI;

import java.util.List;

public class AllMatchMethod 
{
	public static void main(String[] args)
	{
		List<Integer> l = List.of(2,6,8,2,4,10);
		boolean allMatch = l.stream().allMatch(e->e%2==0);
		System.out.println(allMatch);
		
		boolean anyMatch = l.stream().anyMatch(e->e%2!=0);
		System.out.println(anyMatch);
		
		boolean noneMatch = l.stream().noneMatch(e->e%2!=0);
		System.out.println(noneMatch);
		
	}
}