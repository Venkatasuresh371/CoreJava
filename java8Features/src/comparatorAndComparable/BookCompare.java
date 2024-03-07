package comparatorAndComparable;

import java.util.Arrays;

class Book implements Comparable<Book>
{
	private String name;
	private double price;
	
	public Book(String name, double price)
	{
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "Book [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book b)
	{
		return this.price>b.price?1:-1;
	}	
}
public class BookCompare
{
	public static void main(String[] args) 
	{
		Book[] b1={
			new Book("physics",400),
			new Book("telug",500),
			new Book("java",600),
			new Book("sql",400),
			new Book("html",300)
		};
		Arrays.sort(b1);
		for (Book book : b1) 
		{
			System.out.println(book);
		}
	}
}