package com.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream16 {

	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(5,10,15);

		List<Integer> list2 = Arrays.asList(25,50,75);
		
		Stream<Integer> concatedStream = Stream.concat(list1.stream(), list2.stream());
		
		concatedStream.forEach(System.out::println);
		

	}
}
