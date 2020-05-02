package com.concepts.newfeatures.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Sorting2 {
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(45);
		l1.add(40);
		l1.add(30);
		l1.add(20);
		l1.add(100);
		
		List<Integer> l2 = l1.stream().sorted((i1,i2) -> (i1<i2) ? 1 : (i1>i2) ? -1 : 0).collect(Collectors.toList());
		
		l2.stream().forEach(System.out::println);
	}

}
