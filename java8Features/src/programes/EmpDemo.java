package programes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpDemo 
{
	public static void main(String[] args) 
	{
		List<Employee> l = new ArrayList<>();

		l.add(new Employee("suresh", 50000, "development"));
		l.add(new Employee("karthik", 30000, "production"));
		l.add(new Employee("venu", 20000, "testing"));
		l.add(new Employee("sree", 80000, "development"));
		l.add(new Employee("sharan", 40000, "scrum"));

		Map<String, List<Employee>> map = l.stream().filter(e -> e.getSalary() >= 40000)
				.collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(map);
		
		List<String> list = l.stream().filter(e->e.getSalary()>30000).map(e->e.getName()).collect(Collectors.toList());
		System.out.println(list);
	}
}