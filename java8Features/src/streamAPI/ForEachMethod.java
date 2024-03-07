package streamAPI;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod 
{
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("suresh","karthik","venu","sai","harsha");
		names.forEach(name->System.out.println(name));
	}
}