package accessModifiers;

class PrivateModifier
{
	private int j= 30;
	private void m2()
	{
		System.out.println("private Method");
	}
}
public class PrivateModifierDemo
{
	public static void main(String[] args)
	{
		PrivateModifier modifier = new PrivateModifier();
//		System.out.println(modifier.j); j is private variable so in another class its not accessible
//		modifier.m2(); m2() is private method so in another class its not accessible
		
	}
}
