package com.concepts.HackerRank;

public class StairCase {
	
	static void staircase(int n) {

		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(j < n-i) {
					System.out.print(" ");
				}else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}

    }
	
	public static void main(String[] args) {
		staircase(6);
	}

}
