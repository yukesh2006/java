package day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
	String name;
	String department;
	int salary;
	Employee(String name, String department, int salary){
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public String toString() {
		return name+"-"+department+"-"+salary;
	}
}
public class custom_comparator {
	public static void main(String[] args) {
		List<Employee>employees=Arrays.asList(
			new Employee("Ravi","IT",60000),
			new Employee("Anil","HR",70000),
			new Employee("Priya","IT",90000),
			new Employee("Amith","HR",80000),
			new Employee("Rahul","AI",50000)
		);
		
		employees.sort(
			    Comparator.comparing((Employee e) -> e.department)
			              .thenComparing((Employee e) -> e.salary, Comparator.reverseOrder())
			              .thenComparing((Employee e) -> e.name)
			);
			for(Employee e: employees) {
				System.out.println(e);
			}
	}
}
