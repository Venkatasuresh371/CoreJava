package functionalnterface;

class Circle implements Comparable<Object>
{

	int radius;
	public Circle(int radius)
	{
		super();
		this.radius = radius;
	}

	@Override
	public int compareTo(Object arg)
	{
		Circle c = (Circle)arg;
//		return radius-((Circle)arg).radius;
		return radius-c.radius;
	}
	
}
public class TestComparable 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle(30);
		Circle c2 = new Circle(40);
		System.out.println(c1.compareTo(c2));
	}
}