package com.concepts.newfeatures.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(7);
		l.add(15);
		l.add(25);
		
		List<Integer> l1 = l.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(l1);
		
	}
}
