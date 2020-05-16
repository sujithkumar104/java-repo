package com.concepts.streams;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream19 {
	
	public static void main(String[] args) {
		   Integer[]  arr = new Integer[] {3,2,50,60,1};
		   
		  Integer max =  Stream.of(arr).max(Comparator.comparing(Integer::valueOf)).get();
		  
		  System.out.println(max);
		  
		   int[] arr1 = new int[] {3,2,50,60,1};
		   
		   System.out.println(IntStream.of(arr1).max().getAsInt());


		   
	}

}
