package com.jsp.sortingAlgorithms;
import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator
{
	public int compare(Object arg1,Object arg2)
	{
		String s1=(String)arg1;
		String s2 =(String)arg2;
		return s1.length() - s2.length();
	}
}
public class Demo3
{
	public static void main(String[] args) 
	{
		String [] a = {"suresh","yash","wipro","emc"};
		Arrays.sort(a,new LengthCompare());
        for(String s:a)
        	System.out.println(s);
	}

}
