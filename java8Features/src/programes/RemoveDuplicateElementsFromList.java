package programes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromList
{
	public static void main(String[] args)
	{
		List<String> listOfStrings = Arrays.asList("Java","Python","Python","C#","Java","C#","Kotlin", "Python");
		List<String> list = listOfStrings.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	}
}