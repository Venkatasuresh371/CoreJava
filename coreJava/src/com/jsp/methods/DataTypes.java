package com.jsp.methods;

public class DataTypes 
{
	public static void main(String[] args) 
	{
		System.out.println( "S.No.\t  Data Type\t Size\t\t Min. Value\t\t    Max. Value\t");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("1\t  Byte\t\t" + Byte.SIZE + "\t\t" + Byte.MIN_VALUE + "\t\t\t\t" + Byte.MAX_VALUE);
		
		System.out.println("2\t  Short\t\t" + Short.SIZE + "\t\t" + Short.MIN_VALUE + "\t\t\t\t" + Short.MAX_VALUE);
		
		System.out.println("3\t  Integer\t" + Integer.SIZE + "\t\t" + Integer.MIN_VALUE + "\t\t\t" + Integer.MAX_VALUE);
		
		System.out.println("4\t  Float\t\t" + Float.SIZE + "\t\t" + Float.MIN_VALUE + "\t\t\t\t" + Float.MAX_VALUE);
		
		System.out.println("5\t  Long\t\t" + Long.SIZE + "\t\t" + Long.MIN_VALUE + "\t\t" + Long.MAX_VALUE);
		
		System.out.println("6\t  Double\t" + Double.SIZE + "\t\t" + Double.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
		
		System.out.println("7\t  Character\t" + Character.SIZE);
	}
}

