package com.concepts.newfeatures.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Sorting1 {
	
	public static void main(String[] args) {
		
		List<String> s = new ArrayList<>();
		
		s.add("B");
		s.add("A");
		s.add("E");
		s.add("Z");
		s.add("F");
		
		List<String> s1 = s.stream().sorted().collect(Collectors.toList());
		s1.stream().forEach(System.out::println);
		
		List<String> s2 = s.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
		s2.stream().forEach(System.out::println);
		
		Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9};
		Stream<Integer> str = Stream.of(arr);
		str.forEach(System.out::println);
	
	}

}
