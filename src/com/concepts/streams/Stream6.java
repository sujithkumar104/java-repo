package com.concepts.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Stream6 {
	
	public static void main(String[] args) {
		
		List<Person1> personlist = Arrays.asList(new Person1("Sujith", 123, 29), new Person1("Kumar", 124, 30),
				  new Person1("Bhavya", 130, 25), new Person1("Keerthi", 145, 40), new Person1("ABC", 145, 40));
		
		
		Set<Integer> filtered = personlist.stream()
								.filter(x -> x.getAge() > 24)
								.map(x -> x.getAge())
								.collect(Collectors.toSet());
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(20);
		list1.add(20);
		list1.add(30);
		
		Set<Integer> list = new HashSet<>(list1);
		System.out.println(list);
		
		System.out.println(filtered);
		
		
	}

}
