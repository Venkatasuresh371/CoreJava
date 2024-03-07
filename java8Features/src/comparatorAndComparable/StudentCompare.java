package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() 
	{
		return "[name=" + name + ", age=" + age +"]";
	}
	
}
public class StudentCompare 
{
	public static void main(String[] args) 
	{
		Comparator<Student> comparator = new Comparator<Student>()
		{
			@Override
			public int compare(Student s1, Student s2)
			{
				if(s1.getAge()>s2.getAge())
					return 1;
				else
					return -1;
			}
		};
		Comparator<Student> comparator1 = new Comparator<Student>()
		{
			@Override
			public int compare(Student s1, Student s2)
			{
				return s1.getName().compareTo(s2.getName());
			}
		};
		List<Student> s = new ArrayList<>();
		s.add(new Student("suresh",22));
		s.add(new Student("karthik",19));
		s.add(new Student("venu",22));
		s.add(new Student("sai",23));
		s.add(new Student("harsha",24));
		
		Collections.sort(s,comparator);
		s.forEach(System.out::println);
		System.out.println("----------------------------");
		Collections.sort(s,comparator1);
		s.forEach(System.out::println);
	}
}