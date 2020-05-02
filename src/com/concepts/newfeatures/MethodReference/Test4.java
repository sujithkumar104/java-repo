package com.concepts.newfeatures.MethodReference;

import java.util.ArrayList;
import java.util.List;


public class Test4 {
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		l1.stream().forEach(i -> System.out.println(i));
		
		l1.stream().forEach(System.out::println);
		
	}

}
