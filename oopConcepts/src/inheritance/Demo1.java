package inheritance;

public class Demo1 
{
	public static void main(String... args)
	{
		System.out.println("Welcome to oops concepts");
		int a = 200;
		byte b = (byte)a;
		System.out.println("Integer -->  "+Integer.MAX_VALUE+" Bits --> "+Integer.SIZE);
		System.out.println(a);
		System.out.println("Byte -->  "+Byte.MAX_VALUE+" Bits --> "+Byte.SIZE);
		System.out.println(b);
	}
}