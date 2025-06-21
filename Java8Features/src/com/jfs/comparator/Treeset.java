package com.jfs.comparator;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		TreeSet<Employee> employeeSet = new TreeSet<Employee>((emps1, emps2) -> emps1.domain.compareTo(emps2.domain));

		employeeSet.add(new Employee(013, "UIPATH", "Rahul"));
		employeeSet.add(new Employee(573, "RPA", "Srinivas"));
		employeeSet.add(new Employee(744, "RPA", "Divya"));
		employeeSet.add(new Employee(135, "SAP", "Anuradha"));
		employeeSet.add(new Employee(734, "DataBase", "Govardhan"));

		System.out.println(employeeSet);
	}

}
