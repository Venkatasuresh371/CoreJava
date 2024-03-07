package functionalnterface;

interface College
{
	public void  exam();
}
public class Demo1 
{
	public static void main(String[] args) 
	{
		College c = ()->System.out.println("mid exams");
		c.exam();
	}
}