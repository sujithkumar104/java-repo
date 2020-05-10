package com.concepts.HackerRank;

public class BirthDayCake {

	
	static int birthdayCakeCandles(int[] ar) {
		int max=0;
		int sum=0;
		
		for(int i=0;i<ar.length;i++) {
				if(ar[i] > max) {
					max=ar[i];
					sum=1;
				}else if(ar[i] == max){
					sum++;
				}
		}
		
		
		return sum;
        

    }

	
    public static void main(String[] args) {
		int[] arr = new int[] {11, 11,11, 11, 11, 11};
        System.out.println(birthdayCakeCandles(arr));
    }
}
