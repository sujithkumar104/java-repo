package com.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
	
	public static void main(String[] args) {
		
		 List<Person1> personlist = Arrays.asList(new Person1("Sujith", 123, 29), new Person1("Kumar", 124, 30),
				  new Person1("Bhavya", 130, 25), new Person1("Keerthi", 145, 40));

		 
		 List<Integer> personLis1 = personlist.stream()
				 					.map(p -> p.getAge() +10).collect(Collectors.toList());
				 					
		 System.out.println(personLis1);
		 		 
		 // REDUCE will accumalate and gives the result of all
		 int totalage = personlist.stream()
				 	    .map(x->x.getAge())
				        .reduce(0, (a, b) -> a+b);
		 
		 System.out.println(totalage);
		 
		 int totalage1 = personlist.stream()
			 	    .map(x->x.getAge())
			        .reduce(0, Integer::sum);
		 
		 System.out.println(totalage1);
	}

}
