package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 
{
	public static void main(String[] args)
	{
		
		Comparator<Integer> comparator = new Comparator<>()
		{
			@Override
			public int compare(Integer o1, Integer o2)
			{
				if(o1%10 > o2%10)
					return 1;
				else
					return -1;
			}
		};
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(32);
		nums.add(31);
		nums.add(28);
		nums.add(95);
		nums.add(39);
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
		Collections.sort(nums,comparator);
		System.out.println(nums);
	}
}