package com.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream7 {
	
	public static void main(String[] args) {
		List<Person1> personlist = Arrays.asList(new Person1("Sujith", 123, 29), new Person1("Kumar", 124, 30),
				  new Person1("Bhavya", 130, 25), new Person1("Keerthi", 145, 40), new Person1("ABC", 145, 40));
		
		
		Map<String, Integer> map = personlist.stream()
							       .collect(Collectors.toMap(x->x.getName(), x->x.getId()));
		
		System.out.println(map);
	}

}
