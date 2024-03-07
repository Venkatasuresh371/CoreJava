package streamAPI;

import java.util.List;

public class MaxMinMethod 
{
	public static void main(String[] args) 
	{
		List<Integer> list = List.of(47,69,20,50,10);
		Integer max = list.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(max);
		
		Integer min = list.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println(min);
	}
}