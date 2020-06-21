package com.concepts.HackerRank;

public class SequenceSum {

	private static long sumseq(int x, int y, int k) {
		long sum = 0;
		for (int i = x; i < y; i++) {
			sum = sum + i;
		}
		for (int j = y; j > k; j--) {
			sum = sum + j;
		}
		sum = sum + k;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumseq(5, 9, 6));
		System.out.println(sumseq(0, 5, -1));
		System.out.println(sumseq(-5, -1, -3));

	}

}
