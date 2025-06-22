package com.jfs.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapStreams {
	public static void main(String[] args) {
		HashMap<Integer, String> names = new HashMap<>();

		names.put(1, "Rahul");
		names.put(2, "Srinivas");
		names.put(3, "Anuradha");
		names.put(4, "Divya");

		names
		.entrySet()
		.stream()
		.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
		
		System.out.println();

		names
		.keySet()
		.stream()
		.forEach(key -> System.out.println("Only Keys = " + key));
		
		System.out.println();

		names
		.values()
		.stream()
		.forEach(values -> System.out.println("Only Values = " + values));
		
		System.out.println();

		List<Integer> keys = names
		.keySet()
		.stream()
		.toList();
		System.out.println("Keys in List = " + keys);
		
		System.out.println();

		List<String> values = names
		.values()
		.stream()
		.toList();
		System.out.println("Values in List = " + values);
		
		System.out.println();

		Set<Integer> keySet = names
		.keySet()
		.stream()
		.collect(Collectors.toSet());
		System.out.println("Keys in Set = " + keySet);
		
		System.out.println();

		Set<String> valueSet = names
		.values()
		.stream()
		.collect(Collectors.toSet());
		System.out.println("Values in Set = " + valueSet);
		
		System.out.println();

		Map<Integer, String> filteredMap = names
		.entrySet()
		.stream()
		.filter(entry -> entry.getKey() >= 2)
		.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
		System.out.println("Filtered Map = " + filteredMap);
		
		System.out.println();
		
		HashMap<String, String> courses = new HashMap<>();

		courses.put("Rahul", "Course1");
		courses.put("Divya", "Course3");
		courses.put("Anuradha", "Course1");
		courses.put("Srinivas", "Course2");
		
		Map<String, String> filteredKeys = courses
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue().equals("Course1"))
// 		.map(entry -> entry.getKey())
//		.forEach(entry -> System.out.println(entry));
		.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
//		.toList();
        System.out.println("Filtered Keys with Course = " + filteredKeys);
	}

}