package com.concepts.annomous;

public class Solution1 {

	static int minParkingSpaces(int[][] parkingStartEndTimes) {

		/*
		 * System.out.println(parkingStartEndTimes[0][0]);
		 * System.out.println(parkingStartEndTimes[0][1]);
		 * 
		 * System.out.println(parkingStartEndTimes[1][0]);
		 * System.out.println(parkingStartEndTimes[1][1]);
		 */

		int count = 0;
		for (int i = 0; i < parkingStartEndTimes.length; i++) {
			for (int j = 0; j < parkingStartEndTimes[i].length; j++) {
				System.out.println("i:" + i + " j:" + j);
				if (i < 2 && parkingStartEndTimes[i][j] < parkingStartEndTimes[i + 1][j]) {
					if (j + 1 < 2 && (parkingStartEndTimes[i][j + 1] < parkingStartEndTimes[i + 1][j])) {
						count++;
					} else if (j + 1 < 2 && (parkingStartEndTimes[i][j + 1] < parkingStartEndTimes[i + 1][j])) {
						count++;
					}
				}

			}
		}

		return count;
	}

	public static void main(String[] args) {
		// int[][] integerArray = { {1,2},{3,4},{5,6}};
		int[][] integerArray = { { 5, 10 }, { 0, 20 }, { 25, 40 }, { 35, 45 } };


		System.out.println(minParkingSpaces(integerArray));
	}

}
