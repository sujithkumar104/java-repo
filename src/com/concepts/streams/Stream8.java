package com.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream8 {

	
	public static void main(String[] args) {
		
		List<Person1> personlist = Arrays.asList(new Person1("Sujith", 123, 29), new Person1("Kumar", 124, 30),
				  new Person1("Bhavya", 130, 25), new Person1("Keerthi", 145, 40), new Person1("ABC", 145, 40));
		
		
		List<String> filtered = personlist.stream()
				 			    .filter(p -> p.getAge()>29)
				 			    .map(Person1::getName)
				 			    .collect(Collectors.toList());
		
		List<String> filterted1 = personlist.stream()
								  .map(x->x.getName())
								  .collect(Collectors.toList());
		
		System.out.println(filtered);
		
		System.out.println(filterted1);
	}
}
