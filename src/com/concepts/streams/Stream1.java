package com.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	
	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("Sujith","Kumar","Bhavya","Keerthi");
		
		List<String> filter = nameList.stream().filter(name -> name.startsWith("K")).collect(Collectors.toList());
		
		filter.forEach(System.out::println);
		
		
		
	}
	

}
