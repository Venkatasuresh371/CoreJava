package com.jsp.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 
{
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("[abc]");
	    Matcher m =p.matcher("abcdefg");
	    while(m.find())
	    {
	    	System.out.println("start = "+m.start());
	    	System.out.println("end = "+m.end());
	    	System.out.println("group = "+m.group());
	    }
	}
}
