package com.concepts.newfeatures.MethodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test3 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		
		List<Integer> numbers1 = numbers.stream().sorted().collect(Collectors.toList());
		
		List<Integer> numbers2 = numbers.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		
		List<Integer> numbers3 = numbers.stream().sorted(Integer::compareTo).collect(Collectors.toList());
		
		
	}

}
