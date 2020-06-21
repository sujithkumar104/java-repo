package com.concepts.Programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class Epsilnon {

	public static int test(int[] input2) {
		int count1 = Arrays.stream(input2).sum();
		int count2 = Stream.iterate(input2[0], e -> e + 2).limit(input2.length + 1).reduce((a, b) -> a + b).get();
		int missing = count2 - count1;
		return missing;
	}

	public static void main(String[] args) {
		System.out.println(test(new int[] { 1, 3, 5, 7, 11, 13, 15, 17 }));
		System.out.println(test(new int[] { 2, 4, 6, 8, 10, 14 }));
	}

}
