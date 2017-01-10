/**
 * 
 */
package com.tuinsomniacorp.eulerproject;

/**
 * @author angel_banuelos
 *
 */
public class LArgestPalindromeProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 999;
		int y = 999;
		int max = -1;
		for (int i = x; i > 0; i--) {
			for (int j = y; j > 0; j--) {
				int product = i * j;
				if (product > max && isPalindorme(product)) {
					max = product;
					break;
				}

			}
		}
		System.out.println("Maximum " + max);
	}

	private static boolean isPalindorme(int product) {
		String p = "" + product;
		String r = "";
		for (int i = p.length() - 1; i >= 0; i--) {
			r += p.charAt(i);
		}
		if (product == Integer.parseInt(r)) {
			return true;
		}
		return false;
	}

}
