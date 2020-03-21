package com.concepts.newfeatures.streams;

import java.util.ArrayList;
import java.util.List;

public class MapReduce {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		double avg = l.parallelStream().mapToInt((i -> i)).average().getAsDouble();
		System.out.println(avg);
	}

}
