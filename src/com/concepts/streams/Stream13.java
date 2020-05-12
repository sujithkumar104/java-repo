package com.concepts.streams;

import java.util.ArrayList;
import java.util.List;

public class Stream13 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<20;i++) {
			list.add(i);
		}
		
		Integer[] in = list.stream().filter(i-> i%2 ==0).toArray(Integer[]::new);
		  
	}

}
