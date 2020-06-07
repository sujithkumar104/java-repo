package com.concepts.HackerRank;

import java.util.stream.IntStream;

public class SumofMinMax {
	
	
	static void miniMaxSum(int[] arr) {

        int[] arr1= IntStream.of(arr).sorted().toArray();
        
        System.out.println(arr1.length);
        
        int min =0;
        int max =0;
        for(int i=0;i<arr1.length-1;i++) {
        	min += arr1[i];
        }
		
        for(int i=1;i<arr1.length;i++) {
        	max += arr1[i];
        }

        System.out.println(min +" " +max);
    }
	
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 11, 10, 4};
		
		miniMaxSum(arr);
		
	}	

}
