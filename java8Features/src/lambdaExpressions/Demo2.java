package lambdaExpressions;

@FunctionalInterface
interface Message
{
	public void message();
}
interface Message2
{
	public void message2(String msg);
}
class ChatMessage implements Message,Message2
{
	@Override
	public void message()
	{
		System.out.println("Hello java is awesome");
	}

	@Override
	public void message2(String msg) 
	{
		System.out.println(msg);
	}
}
public class Demo2 
{
	public static void main(String[] args)
	{
		Message m = new ChatMessage();
		m.message();
		Message2 m2 = new ChatMessage();
		m2.message2("java 8 features");
		
		//Lambda expression
		Message m3 = ()->
		{
			System.out.println("welcome to java 8");
		};
		m3.message();
		Message2 m4 = (a)->System.out.println(a);
		m4.message2("method with param");
	}
}