package com.concepts.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindMissingNumber {

	private static void findMissing(int[] arr) {

		List<Integer> missing = new ArrayList<>();
		
		for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
			boolean found = false;
			for (int value : arr) {
				if (value == i) {
					found = true;
				}
			}
			if (!found) {
				missing.add(i);
			}
		}

		missing.forEach(System.out::println);
		
		

	}

	private static void findMissingOptimzed(int[] arr) {
		int sum = Arrays.stream(arr).sum();
		int fullSum = Stream.iterate(arr[0], e -> e + 1).limit(arr[arr.length - 1]).reduce((a, b) -> a + b).get();
		System.out.println(fullSum - sum);
	}

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2,3,4,6 };
		findMissing(array);
		findMissingOptimzed(array);
	}

}
