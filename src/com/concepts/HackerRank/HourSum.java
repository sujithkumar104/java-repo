package com.concepts.HackerRank;

import java.io.IOException;

public class HourSum {
	
	static int R = 5; 
	static int C = 5; 

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		
		if (R < 3 || C < 3) 
	        return -1; 
		
		int arrsum = 1;
		for (int i = 0; i < R-2 ; i++) {
			for (int j = 0; j < C- 2; j++) {
				int sum = arr[i][j]+arr[i][j+1] + arr[i][j+2]
							+ arr[i+1][j+1]
							+ arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				arrsum = Math.max(sum, arrsum);
			}
		}
		return arrsum;

	}

	public static void main(String[] args) throws IOException {

	}
}
