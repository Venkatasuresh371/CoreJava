package com.jsp.strings;

public class PalindromesInAString 
{
	public static void main(String[] args) 
	{
		String s="madam";
		for(int i=0;i<=s.length();i++)
		{
			for(int j=i+2;j<=s.length();j++)
			{
				String str=s.substring(i,j);
				if(isPalindrome(str))
					System.out.println(str);
			}
		}
	}
    public static boolean isPalindrome(String s)
    {
    	s=s.toLowerCase();
    	char [] a = s.toCharArray();
    	int i=0,j=a.length-1;
    	while(i<j)
    	{
    		if(a[i]!=a[j]) return false;
    		i++;
    		j--;
    	}
    	return true;
    }
}
