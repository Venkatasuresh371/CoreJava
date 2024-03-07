package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test
{
	public static void main(String[] args) 
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("suresh",23,List.of("maths","java")));
		list.add(new Student("karthik",20,List.of("sql","python")));
		list.add(new Student("venu",23,List.of("maths","html")));
		list.add(new Student("vamsi",24,List.of("css","physics")));
		list.add(new Student("sai",24,List.of("social","mern")));
		
		String tragetedCourse = "maths";
		
		List<Student> filteredStudents = list.stream().filter(student ->student.getAge()>20 && student.getCourses().contains(tragetedCourse))
		.collect(Collectors.toList());
	
		
		for (Student student : filteredStudents) 
		{
			System.out.println("Name : "+student.getName()+" Age : "+student.getAge()+" Courses : "+student.getCourses());
		}
	}
}