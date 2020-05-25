package com.concepts.Programs;

public class PrimeNumber {

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		} else {
			for (int i = 2; i * i <= number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 40 };

		/*
		 * for (int a : array) { System.out.println(a + " is prime: " + isPrime(a)); }
		 */
		
				
		if(isPrime(array[0])) {
			System.out.println(array[0] + " is prime number");
		}else {
			System.out.println(array[0] + " is not prime number ");
		}

	}

}
