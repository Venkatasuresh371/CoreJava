package functionalnterface;

class Circle implements Comparable<Circle>
{
	int radius;
	public Circle(int radius)
	{
		super();
		this.radius = radius;
	}

	@Override
	public int compareTo(Circle arg)
	{
		return radius-arg.radius;
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