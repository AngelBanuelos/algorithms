package com.tuinsomniacorp.leetcode.easy;

/**
 * Reverse digits of an integer. Example1: x = 123, return 321 Example2: x =
 * -123, return -321
 * 
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 *
 */
public class ReverseInteger {

	public int reverse(int x) {

		return reverseAsString(x);
	}

	private int reverseAsString(int x) {

		String plus = "";
		if (x < 0) {
			plus = "-";
			x = -x;
		}

		String xs = "" + x;
		char[] chars = xs.toCharArray();

		String rxs = plus;
		int N = chars.length -1;
		
		for (int i = N; i >= 0; i--) {
			if (chars[i] != '-')
			rxs += chars[i];
		}
		
		if(new Long(rxs) > new Long(Integer.MAX_VALUE ) || 
				new Long(rxs) < new Long(Integer.MIN_VALUE)) {
			return 0;
		}
		
		return new Integer(rxs);

	}

	public static void main(String[] args) {
		
		ReverseInteger obj = new ReverseInteger();
		System.out.println(obj.reverseAsString(-123));
		System.out.println(obj.reverseAsString(((1 << 31) - 2)));
		System.out.println(obj.reverseAsString(1563847412));
		System.out.println(obj.reverseAsString(-2147483412));
		
	}

}
