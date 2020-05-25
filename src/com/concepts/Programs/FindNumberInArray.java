package com.concepts.Programs;

import java.util.Arrays;

public class FindNumberInArray {
	
	
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 9, 10 };

		System.out.println(Arrays.stream(array).anyMatch(x-> x == 11));
	}

}
