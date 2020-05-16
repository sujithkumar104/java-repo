package com.concepts.HackerRank;

import java.util.Arrays;

public class AppleOranges {

	// Complete the countApplesAndOranges function below.
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		System.out.println(Arrays.stream(apples).map(ap -> a + ap).filter(x -> x >= s && x <= t).count());
		System.out.println(Arrays.stream(oranges).map(ap -> b + ap).filter(x -> x >= s && x <= t).count());

	}

	public static void main(String[] args) {
		countApplesAndOranges(7, 10, 4, 12, new int[] { 2, 3, -4 }, new int[] { 3, -2, -4 });
	}
}
