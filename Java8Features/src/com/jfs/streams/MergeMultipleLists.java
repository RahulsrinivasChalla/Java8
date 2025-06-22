package com.jfs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeMultipleLists {
	
	public static void main(String[] args) {
		List<List<String>> words = new ArrayList<>();
		
		words.add(Arrays.asList("Hi" , "Bye"));
		words.add(Arrays.asList("Goku" , "Vegeta"));
		words.add(Arrays.asList("Luffy" , "Zoro" , "Sanji"));
		words.add(Arrays.asList("Senku" , "Gen"));
		
		System.out.println("Original List = "+ words);
		
		
		List<String> mergedList = words
		.stream()
		.flatMap(list -> list.stream())
		.toList();
		System.out.println("Merged List = " + mergedList);
		
		words
		.parallelStream()
		.forEach(list -> System.out.println(list));
		
		List<String> parallelStreamList = mergedList
		.parallelStream()
		.toList();
		System.out.println("Parallel Stream List = " + parallelStreamList);
	}

}
