package lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(3,1,4,6,2,8);
		for (Integer integer : list)
		{
			System.out.print(integer+" ");
		}
		System.out.println();
		list.forEach(n->System.out.print(n+" "));
		System.out.println();
		List<String> list2 = Arrays.asList("lion","tiger","cheetah","deer","elephant");
		Collections.sort(list2);
		System.out.println(list2);
	}
}