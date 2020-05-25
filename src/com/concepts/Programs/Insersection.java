package com.concepts.Programs;

import java.util.ArrayList;
import java.util.List;

public class Insersection {

	public static void findIntersection(int[] arr1, int[] arr2) {
		List<Integer> common = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			boolean found = false;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					found = true;
					break;
				}
			}
			if (found) {
				common.add(arr1[i]);
			}
		}

		common.forEach(System.out::println);
	}

	public static void main(String[] args) {

		int[] arr1 = new int[] { 21, 34, 41, 22, 35 };

		int[] arr2 = new int[] { 61, 34, 45, 21, 11 };

		findIntersection(arr1, arr2);

	}
}
