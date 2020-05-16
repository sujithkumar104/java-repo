package com.concepts.HackerRank;

import java.util.stream.IntStream;

public class BreakingRecords {
	
	
	static int[] breakingRecords(int[] scores) {
		
		int minimumScore=0;
		int maximumScore=0;
		int minPoints=0;
		int maxPoints=0;
		
		// 12,24,10,24
		for(int i=0;i<scores.length;i++) {
			if(i==0) {
				minimumScore = scores[0];
				maximumScore = scores[0];
			}else {
				if(scores[i] < minimumScore) {
					minimumScore=scores[i];
					minPoints++;
				}
				
				if(scores[i] > maximumScore) {
					maximumScore=scores[i];
					maxPoints++;
				}
			}
			
		}
		return new int[] {maxPoints , minPoints};

    }
	
	public static void main(String[] args) {
		IntStream.of(breakingRecords(new int[] {12,24,10,24})).forEach(System.out::println);
		IntStream.of(breakingRecords(new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42})).forEach(System.out::println);
		IntStream.of(breakingRecords(new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1})).forEach(System.out::println);

	}
	

}
