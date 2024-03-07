package methodReferences;

import java.util.function.Function;

class Student
{
	private String name;

	public Student(String name)
	{
		super();
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
}

public class ConstructorReference 
{
	public static void main(String[] args)
	{
		Function<String,Student> s = Student::new;
		Student student = s.apply("suresh");
		System.out.println(student.getName());
	}
}