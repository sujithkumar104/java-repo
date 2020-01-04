package com.concepts.newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(60);
		l.add(30);
		l.add(25);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l); // Natural Sorting order Ascending Order
		
		// Descending Order using Compartor lamda expression
		Comparator<Integer> c = (I1,I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0;
		Collections.sort(l, c);
		System.out.println(l);
		
		// Natural Order with Compartor using Compartor lamda expression
		Collections.sort(l, (I1,I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0);
		System.out.println(l);
		
		l.stream().forEach(System.out::println);
		// Print only Even Numbers from list
		List<Integer> l2 = l.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		System.out.println(l2);
	}

}
