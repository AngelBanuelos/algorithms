package com.tuinsomniacorp.leetcode.medium;

import sun.applet.Main;

public class PowX {

	public double myPow(double x, int n) {
		double pow = 1;
		if (n % 2 == 0) {
			double pow1 = pow(x, n / 2);
			return pow1 * pow1;
		} else {
			double pow1 = pow(x, n / 2);
			if (n < 0) {
				return pow1 * pow1 / x;
			}
			return pow1 * pow1 * x;
		}
	}

	public double pow(double x, int n) {
		double pow = 1;
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				pow *= x;
			}
		} else if (n < 0) {
			for (int i = n; i < 0; i++) {
				pow /= x;
			}
		}
		return pow;
	}

	public double myPowRec(double x, int n, double pow) {
		if (n > 0) {
			n--;
			pow *= x;
			return myPowRec(x, n, pow);
		} else if (n < 0) {
			n++;
			pow /= x;
			return myPowRec(x, n, pow);
		}
		return pow;
	}

	public double myPowBit(double x, int n) {
		int binary = (n < 0 ? n * -1 : n);
		int n1 = 0;
		double pow = 1;
		while (binary > 0) {
			int bit = binary % 2;
			int newN = bit * (1 << n1);
			// System.out.println(bit + " " + newN);
			binary /= 2;
			n1++;
			if (n < 0) {
				System.out.println(bit + " " + (-1) * newN);
				pow *= pow(x, newN * (-1));

			} else {
				System.out.println(bit + " " + newN);
				pow *= pow(x, newN);
			}
		}
		return pow;
	}

	public static void main(String[] args) {
		PowX obj = new PowX();
		System.out.println(obj.myPowBit(5, -4));
		
	}

}