package comparatorAndComparable;

import java.util.Arrays;
import java.util.Comparator;

class Employee
{
	String name;
	double salary;
	
	public Employee()
	{
		super();
	}

	public Employee(String name, double salary) 
	{
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
class NameLengthCompare implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2)
	{
		return o1.getName().length()-o2.getName().length();
	}
}
public class Demo3 
{
	public static void main(String[] args)
	{
		Employee[] e={
			new Employee("suresh",100000),
			new Employee("venu",90000),
			new Employee("hari",80000),
			new Employee("vamsi",90000),
			new Employee("sai",80000),
		};
		Arrays.sort(e,new NameLengthCompare());
		for (Employee employee : e) 
		{
			System.out.println(employee);
		}
	}
}