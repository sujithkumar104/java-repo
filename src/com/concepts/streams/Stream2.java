package com.concepts.streams;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
	
	
	public static void main(String[] args) {
		
	 List<Person1> personlist = Arrays.asList(new Person1("Sujith", 123, 29), new Person1("Kumar", 124, 30),
			 								  new Person1("Bhavya", 130, 25), new Person1("Keerthi", 145, 40));
			 								  
		Person1 person = personlist.stream().filter(x -> "Sujith".equals(x.getName())).findAny().orElse(null);	
		
		Person1 person1 = personlist.stream().filter(x -> "ABC".equals(x.getName())).findAny().orElse(null);	

		Person1 person2 = personlist.stream().filter(x -> "Sujith".equals(x.getName()) && x.getAge() == 29).findAny().orElse(null);	

		long count = personlist.stream().filter(x-> x.getAge() > 29).count();
		
		System.out.println(person);
		
		System.out.println(person1);
		
		System.out.println(person2);

		System.err.println("Count: " +count);
		
	}

}
