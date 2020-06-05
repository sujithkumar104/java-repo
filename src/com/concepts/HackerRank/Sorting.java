package com.concepts.HackerRank;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {

	
	static String[] bigSorting(String[] unsorted) {
		
	    List<String> bigList = Stream.of(unsorted).parallel().map(s -> new BigInteger(s)).sorted().map(b->b.toString()).collect(Collectors.toList());
	    bigList.stream().forEach(System.out::println);
	    return bigList.toArray(new String[bigList.size()]);

		
    }
	
	public static void main(String[] args) {
		Stream.of(bigSorting(new String[] {"31415926535897932384626433832795","1","30","10"})).forEach(System.out::println);;
		
	}
}
