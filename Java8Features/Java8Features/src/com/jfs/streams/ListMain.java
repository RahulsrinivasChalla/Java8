package com.jfs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListMain {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(0, 7, 98, 7, 98, 56, 5, 87));

		list.forEach((num) -> System.out.println(num));

		List<Integer> even = list
		.stream()
		.filter((n) -> n % 2 == 0)
		.collect(Collectors.toList());
		System.out.println("Even numbers = " + even);

		List<Integer> odd = list
		.stream()
		.filter((n) -> n % 2 != 0)
		.collect(Collectors.toList());
		System.out.println("Odd numbers = " + odd);

		System.out.println("Original List = " + list);
		// to remove duplicates use distinct() method
		List<Integer> uniqueValues = list
		.stream()
		.distinct()
		.toList();
		System.out.println("Removed Duplicates = " + uniqueValues);

		Integer findFirst = list
		.stream()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.findFirst()
		.get();
		System.out.println("Find First = " + findFirst);
	}
}
