package com.concepts.interviewprograms.twodimesional;

public class Simple {

	private static void test(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		int[][] integerArray = { { 5, 10 }, { 0, 20 }, { 25, 40 }, { 35, 45 } };
		test(integerArray);
	}

}
