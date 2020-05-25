package com.concepts.Programs;

import java.util.Arrays;

public class FindBigAndSmallNumberArray {

	private static void find(int[] arr) {

		System.out.println("Min Value:" + Arrays.stream(arr).sorted().min().getAsInt());
		System.out.println("Min Value:" + Arrays.stream(arr).sorted().max().getAsInt());

	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 10, 5, 6, 4, 7, 9, 3 };
		find(array);
	}

}
