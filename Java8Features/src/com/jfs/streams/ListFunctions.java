package com.jfs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFunctions {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,35,86,46,93,47));
		
		System.out.println("Given List = " + list);
		
		long count = list
		.stream()
		.count();
		System.out.println("Count of list = " + count);
		
		int sumOfList = list
		.stream()
		.mapToInt(num -> num)
		.sum();
		System.out.println("Sum of List = " + sumOfList);
		
		List<Integer> evenNumbers = list
		.stream()
		.filter(num -> num%2 == 0)
		.toList();
		System.out.println("Even Numbers in List = " + evenNumbers);
		
		
		int sum = evenNumbers
		.stream()
		.mapToInt(num -> num)
		.sum();
		System.out.println("Sum of Even Numbers = " + sum);
		
		List<Integer> fiveMultiples = list
		.stream()
		.filter(n -> n%5==0)
		.toList();
		System.out.println("Five Multiples in List = " + fiveMultiples);
		
		double asDouble = list
		.stream()
		.mapToInt(num -> num)
		.average()
		.getAsDouble();
		System.out.println("Average of List = "+ asDouble);
		
		int min = list
		.stream()
		.mapToInt(num -> num)
		.min()
		.getAsInt();
		System.out.println("Min value in List = " + min);
		
		int max = list
		.stream()
		.mapToInt(num -> num)
		.max()
		.getAsInt();
		System.out.println("Max value in List = " + max);
		
		
	}
	
	
}
