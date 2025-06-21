package com.jfs.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(744, "Java", "Rahul"));
		employees.add(new Employee(617, "Python", "Divya"));
		employees.add(new Employee(987, "Ruby", "Anuradha"));
		employees.add(new Employee(887, "C++", "Prasad"));
		employees.add(new Employee(574, "DotNet", "Srinivas"));

		// Writing separate class to compare the Integers
		Collections.sort(employees, new IdComparator());
		System.out.println(employees);

		// Anonymous Inner Class
		Comparator<Employee> nameComparator = new Comparator<>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.Name.compareTo(emp2.Name);
			}
		};

		Collections.sort(employees, nameComparator);
		System.out.println(employees);

		// Lambda Expression
//		Comparator<Employee> domainComparator = (Employee emp1, Employee emp2) -> {
////			return emp1.domain.compareTo(emp2.domain);
//	    };
		Collections.sort(employees, (emp1, emp2) -> emp1.domain.compareTo(emp2.domain));
		System.out.println(employees);
	}
}
