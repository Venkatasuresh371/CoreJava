package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1,"karthik","java"));
		list.add(new Student(2,"venu","sql"));
		list.add(new Student(3,"sai","html"));
		list.add(new Student(4,"vamsi","css"));
		list.add(new Student(5,"suresh","mern"));
		List<Student> list1 = sortByName(list);
		for (Student student : list1)
		{
			System.out.println(student);
		}
		List<Student> list2 = sortByBranch(list);
		for (Student student : list2)
		{
			System.out.println(student);
		}
	}

	public static List<Student> sortByBranch(ArrayList<Student> slist)
	{
		return slist.stream().sorted((e1,e2)->
		{
			return e1.getBranch().compareToIgnoreCase(e2.getBranch());
		}).collect(Collectors.toList());
	}

	public static List<Student> sortByName(List<Student> slist) 
	{
		return slist.stream().sorted((e1,e2)->
		{
			return e1.getName().compareToIgnoreCase(e2.getName());
		}).collect(Collectors.toList());
	}
}
