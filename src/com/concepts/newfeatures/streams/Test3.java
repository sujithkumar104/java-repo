package com.concepts.newfeatures.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test3 {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(7);
		l.add(15);
		l.add(25);
		
		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList()); 
		System.out.println(l1);
		
		List<Integer> l2 = l.stream().sorted((i1,i2) -> i1<i2 ? 1 : i1>i2 ? -1 : 0).collect(Collectors.toList());
		System.out.println(l2);
		
		int i = l.stream().min((i1,i2) -> i1<i2 ? -1 : i1>i2 ? 1 : 0).get();
		System.out.println(i);

		int max = l.stream().max((i1,i2) -> i1<i2 ? -1 : i1>i2 ? 1 : 0).get();
		System.out.println(max);
		
		Consumer<Integer> c = a->System.out.print(a*a);
		
		l.stream().forEach(c);
		
		Integer[] abc = l.stream().toArray(Integer[]:: new);
		
		

	}


}
