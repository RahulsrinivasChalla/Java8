package com.jfs.comparator;

public class Employee {

	int empId;

	String domain;

	String Name;

	public Employee() {

	}

	public Employee(int empId, String domain, String name) {
		super();
		this.empId = empId;
		Name = name;
		this.domain = domain;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + ", domain=" + domain + "]";
	}

}
