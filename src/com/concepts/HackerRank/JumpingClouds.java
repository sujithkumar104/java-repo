package com.concepts.HackerRank;

public class JumpingClouds {

	static int jumpingOnClouds(int[] c) {
		int i;
		int jump = 0;

		for (i = 0; i < c.length - 1; i++) {
			jump++;
			if (i < c.length - 2 && c[i + 2] == 0) {
				i++;
			}
		}
		return jump;
	}

	public static void main(String[] args) {
		System.out.println(jumpingOnClouds(new int[] { 0, 0, 1, 0, 0, 1, 0 }));
	}

}
