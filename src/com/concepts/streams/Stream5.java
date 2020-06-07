package com.concepts.streams;

import java.util.Arrays;
import java.util.List;

public class Stream5 {

	public static void main(String[] args) {
			
		List<Person1> personlist = Arrays.asList(new Person1("Sujith", 123, 29), new Person1("Kumar", 124, 30),
				  new Person1("Bhavya", 130, 25), new Person1("Keerthi", 145, 40));
		
		
		
		Person1 maxAge = personlist.stream()
						 .max((a,b) -> a.getAge() > b.getAge() ? 1 : a.getAge() < b.getAge() ? -1 : 0).get();
		
		Person1 minAge = personlist.stream()
				 .min((a,b) -> a.getAge() > b.getAge() ? 1 : a.getAge() < b.getAge() ? -1 : 0).get();

		
		System.out.println(minAge);
		System.out.println(maxAge);
	}
}
