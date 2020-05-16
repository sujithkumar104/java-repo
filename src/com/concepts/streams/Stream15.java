package com.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream15 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,10,15);
		
		int sum = list.stream().collect(Collectors.summingInt(i->i));
		
		int sum1 = list.stream().reduce(0, (a,b) -> a +b);
		
		System.out.println(sum);
		
		System.out.println(sum1);
	}
}
