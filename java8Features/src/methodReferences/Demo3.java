package methodReferences;

import java.util.List;

public class Demo3
{
	public static void main(String[] args) 
	{
		List<Integer> list = List.of(50,20,30,90,10);
		Integer max = list.stream().max(Integer::compare).get();
		System.out.println(max);
		Integer min = list.stream().min(Integer::compare).get();
		System.out.println(min);
		
	}

}
