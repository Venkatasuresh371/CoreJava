package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber 
{
	public static boolean isPrime(int n) 
	{
		if(n<=1)
			return false; 
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(3,7,2,6,9,4,10);
		System.out.println(list.stream().collect(Collectors.toList()));
		System.out.println(list.stream().filter(PrimeNumber::isPrime).collect(Collectors.toList()));
	}
}
