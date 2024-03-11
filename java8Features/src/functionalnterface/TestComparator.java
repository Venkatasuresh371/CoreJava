package functionalnterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student 
{
	String name;
	
	public Student(String name)
	{
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
class SortByName implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) 
	{
		if(o1.getName().length()< o2.getName().length()) return 1;
		else if(o1.getName().length()> o2.getName().length()) return -1;
		return 0;
	}
}
public class TestComparator
{
	public static void main(String[] args)
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student("karthik"));
		list.add(new Student("suresh"));
		list.add(new Student("venu"));
		
		for (Student student : list) 
		{
			System.out.println(student.getName());
		}
		System.out.println("-------------------------");
		Collections.sort(list,new SortByName());
		for (Student student : list) 
		{
			System.out.println(student.getName());
		}
	}
}