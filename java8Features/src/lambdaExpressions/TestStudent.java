package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStudent
{
	public static void main(String[] args) 
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("suresh",23,List.of("maths","java")));
		list.add(new Student("karthik",20,List.of("sql","python")));
		list.add(new Student("venu",23,List.of("maths","html")));
		list.add(new Student("vamsi",24,List.of("css","physics")));
		list.add(new Student("sai",24,List.of("social","mern")));
		list.add(new Student("sharan",25,List.of("social","mern")));
		list.add(new Student("sree",27,List.of("maths","electrical")));
		
		String tragetedCourse = "maths";
		
		List<Student> filteredStudents = list.stream().filter(student ->student.getAge()>20 && student.getCourses().contains(tragetedCourse))
		.collect(Collectors.toList());
	
		
		for (Student student : filteredStudents) 
		{
			System.out.println("Name : "+student.getName()+"\t Age : "+student.getAge()+"   Courses : "+student.getCourses());
		}
		
		System.out.println("**************");
		List<Student> list1 = list.stream().filter(student ->student.getAge()>22).collect(Collectors.toList());
		for (Student student : list1) 
		{
			System.out.println("Name : "+student.getName()+"\t Age : "+student.getAge());
		}
		System.out.println("**************");
		List<String> list2 = list.stream().filter(student ->student.getAge()>22).map(std->std.getName()).collect(Collectors.toList());
		System.out.println(list2);
	}
}