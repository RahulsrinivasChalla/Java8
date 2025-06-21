package com.jfs.comparable;

public class Student implements Comparable<Student> {

	int id;
	String name;

	public Student() {

	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student student) {
		// return (this.id==student.id)?0:(this.id > student.id)?1:-1; sort with Id
		return this.name.compareTo(student.name); // Sort with Name
	}

}
