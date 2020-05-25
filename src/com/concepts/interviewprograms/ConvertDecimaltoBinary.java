package com.concepts.interviewprograms;

import java.util.Arrays;

public class ConvertDecimaltoBinary {

	public static void main(String[] args) {
		int[] binary = new int[4];
		int number = 13;
		int index =0;
		while(number>0) {
			int temp = number%2;
			binary[index] = temp;
			index++;
			number = number/2;
		}

		Arrays.stream(binary).forEach(System.out::println);
	}
}
