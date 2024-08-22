package com.tutorials.programing;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		
		String name = "javatpoint";
		
		char a[] = name.toCharArray();
		
		List<String> duplicates = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(s->s.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		
		
		
		System.out.println(duplicates);
 
	}

}
