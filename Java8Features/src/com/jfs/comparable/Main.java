package com.jfs.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> student = new ArrayList<>();

		student.add(new Student(42, "Rahulsrinivas"));
		student.add(new Student(10, "Divya"));
		student.add(new Student(14, "Anuradha"));
		student.add(new Student(19, "Govardhan"));
		student.add(new Student(42, "Prasad"));

		System.out.println(student);
		Collections.sort(student);
		System.out.println(student);
	}

}
