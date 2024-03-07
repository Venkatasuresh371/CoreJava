package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo2
{
	public static void main(String[] args)
	{
		Comparator<String> c = new Comparator<String>() 
		{
			@Override
			public int compare(String o1, String o2)
			{
				if(o1.length()>o2.length())
					return 1;
				else
					return -1;
			}
		};
		List<String> list = new ArrayList<>();
		list.add("suresh");
		list.add("karthik");
		list.add("venu");
		list.add("sai");
		list.add("harsha");
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,c);
		System.out.println(list);
	}
}