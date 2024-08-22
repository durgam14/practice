package com.tutorials.programing;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		
		String name = "javatpoint";
		
		char a[] = name.toCharArray();
		
		Map<String, Long> count = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(count);
 
	}

}
