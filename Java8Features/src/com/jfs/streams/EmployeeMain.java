package com.jfs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "Rahul", 100000));
		employees.add(new Employee(2, "Srinivas", 20000));
		employees.add(new Employee(3, "Divya", 200000));
		employees.add(new Employee(4, "Anuradha", 300000));
		employees.add(new Employee(5, "Prasad", 30000));
		employees.add(new Employee(6, "Challa", 400000));

		// filter
		List<Employee> salaryMoreThan1Lakh = employees
		.stream()
		.filter((emp) -> emp.salary > 100000)
//		.forEach((emp) -> System.out.println(emp)); we can use forEach or collect both work same
		.collect(Collectors.toList());
		System.out.println(salaryMoreThan1Lakh);

		// sorted
		List<Employee> list = employees
		.stream()
		.sorted((emp1, emp2) -> Integer.compare(emp1.salary, emp2.salary))
		.toList();
		System.out.println(list);

		// to modify data use map as intermediate operation
		List<Employee> updatedSalaryList = employees
		.stream()
		.map((emp) -> new Employee(emp.id, emp.name, (emp.salary += emp.salary / 5)))
//	    .forEach((emp) -> System.out.println(emp)); we can use forEach or collect both work same
		.toList();
		System.out.println("Updated salary = " + updatedSalaryList);

		// to find the lowest salary---- sorted method will sort the numbers in
		// ascending order & find first() method will give the first number
		Optional<Employee> lowestSalary = employees
		.stream()
		.sorted((emp1, emp2) -> Integer.compare(emp1.salary, emp2.salary))
		.findFirst();
		System.out.println("Lowest salary = " + lowestSalary);

		// to find the highest salary---- use sorted method with comparator.reverseOrder
		// & it will sort the numbers in descending order & find first() method will give
		// the first number
		Optional<Employee> highestSalary = employees
		.stream()
		.distinct()
		.sorted((emp1, emp2) -> Integer.compare(emp2.salary, emp1.salary))
		.findFirst();
		System.out.println("Highest salary = " + highestSalary);

		// to find the custom highest salary(Ex: 2nd, 3rd Or any other highest)---- use
		// sorted method, use skip() method it will skip the count u pass in the parameter
		// & it will sort the numbers in descending order & find first() method will give
		// the first number
		Optional<Employee> customHighestSalary = employees
		.stream()
		.distinct()
		.sorted((emp1, emp2) -> Integer.compare(emp2.salary, emp1.salary))
		.skip(2)// it we give 2 it will skip 2 id's provide 3rd highest salary
		.findFirst();
		System.out.println("Custom Highest salary = " + customHighestSalary);

	}

}
