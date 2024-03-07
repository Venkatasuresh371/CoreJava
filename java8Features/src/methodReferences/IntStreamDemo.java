package methodReferences;

import java.util.stream.IntStream;

public class IntStreamDemo
{
	public static void main(String[] args)
	{
		int sum = IntStream.of(4,7,2,4,7,8,3,3,5)
				 .filter(n->n%2!=0)
				 .sum();
		System.out.println(sum);
	}
}