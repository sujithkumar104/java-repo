package com.concepts.HackerRank;

public class BtweenTwoSets {

	// LEAST COMMON MUTIPLE
	public static int findLCM(int a, int b) {
		int lcm= (a>b) ? a: b;
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				break;
			}
			lcm++;
		}
		return lcm;
	}

	// GREATEST COMMON DIVISOR
	// 6 -> 1 2 3 
	// 8 -> 1 2 4 
	public static int findGCD(int a, int b) {
		int gcd =1;
		for (int i = 1; i <=a && i<=b ; ++i) {
				if(a%i == 0 && b%i ==0) {
					gcd = i;
				}
		}
		return gcd;
		
	}

	public static void main(String[] args) {

     		System.out.println(findLCM(2, 3));

			System.out.println(findGCD(2, 4));

	}

}
