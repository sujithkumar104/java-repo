package com.concepts.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class Stream4 {
	
	public static void main(String[] args) {
		List<Person1> personlist = Arrays.asList(new Person1("Sujith", 123, 29), new Person1("Kumar", 124, 30),
				  new Person1("Bhavya", 130, 25), new Person1("Keerthi", 145, 40));
		
		
		LongSummaryStatistics longSummary = personlist.stream()
											.collect(Collectors.summarizingLong(x -> x.getAge()));
		
		IntSummaryStatistics intSummary = personlist.stream()
				.collect(Collectors.summarizingInt(x -> x.getAge()));

		
		System.out.println(longSummary);
		
		System.out.println(intSummary);
		
		
	}

}
