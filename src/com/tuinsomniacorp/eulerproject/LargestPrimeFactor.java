/**
 * 
 */
package com.tuinsomniacorp.eulerproject;

/**
 * @author angel_banuelos
 *
 */
public class LargestPrimeFactor {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		System.out.println(" " + gcd(13195, 5));
		long num = 600851475143L;
		long max = -1;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				num /= i;
				if (max < i) {
					max = i;
				}
				System.out.println(i + " rrr " + num);
				i = 2;
			}
		}
		System.out.println("Max prime: " + max);
	}

	public static long getLargestPrimeFactor(int num) {
		long prime = 1;
		// int i = prime;
		// while (num > 0) {
		//
		// if () {
		//
		// }
		// }
		return prime;
	}

	public static int gcd(int a, int b) {
		int helper = 1;
		while (b > 0) {
			helper = (a % b);
			a = b;
			b = helper;

		}

		return a;
	}

}
