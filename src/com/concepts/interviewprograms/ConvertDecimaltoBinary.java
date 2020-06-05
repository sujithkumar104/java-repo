package com.concepts.interviewprograms;

import java.util.Arrays;
import java.util.Collections;

public class ConvertDecimaltoBinary {

	public static void main(String[] args) {
		int[] binary = new int[4];
		int number = 13;
		int index = 0;
		while (number > 0) {
			int temp = number % 2;
			binary[index] = temp;
			index++;
			number = number / 2;
		}

		Integer[] boxed = Arrays.stream(binary).boxed().toArray(Integer[]::new);

		Collections.reverse(Arrays.asList(boxed));

		System.out.println(Arrays.toString(boxed));

	}
}
