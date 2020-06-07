package com.concepts.HackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

	private static int getResult(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int value = list.stream().reduce(1, (a, b) -> a * b).intValue();
		return (value > 0) ? 1 : (value < 0) ? -1 : 0;
	}

	public static void main(String[] args) {
		System.out.println(getResult(new int[] {1, -2, -3,5}));
		System.out.println(getResult(new int[] {1, 2, 3, -5}));
		System.out.println(getResult(new int[] {1, 2, 0,-5}));
		System.out.println(getResult(new int[] {99999, 998, 10000,-997}));

	}

}
