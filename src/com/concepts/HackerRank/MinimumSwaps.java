package com.concepts.HackerRank;

public class MinimumSwaps {

	static int minimumSwaps(int[] arr) {

		int swap = 0;
		boolean visited[] = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int j = i;
			int count = 0;

			while (!visited[j]) {
				visited[j] = true;
				j = arr[j] - 1;
				count++;
			}

			if (count != 0) {
				swap += count - 1;
			}
		}
		return swap;

	}

	public static void main(String[] args) {
		System.out.println(minimumSwaps(new int[] { 4, 3, 2, 1 }));

	}

	static int minimumSwaps1(int[] arr) {

		boolean visited[] = new boolean[arr.length];

		int swap = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int j = i;
			while (!visited[j]) {
				visited[j] = true;
				j = arr[j] - 1;
				count++;
			}

			if (count != 0) {
				swap += count + 1;
			}
		}

		return swap;

	}

}
