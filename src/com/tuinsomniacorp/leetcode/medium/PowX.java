package com.tuinsomniacorp.leetcode.medium;

/**
 * 
 * 
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 *
 */
public class PowX {

	public double myPow(double x, int n) {
		double pow = 1;
		if (n % 2 == 0) {
			double pow1 = pow(x, n / 2, pow);
			return pow1 * pow1;
		} else {
			double pow1 = pow(x, n / 2, pow);
			if (n < 0) {
				return pow1 * pow1 / x;
			}
			return pow1 * pow1 * x;
		}
	}

	public double myPowRec(double x, int n, double pow) {
		if(n == 0) {
			return pow;
		}
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

	public double pow(double x, int n, double pow) {
		if (pow == 0) {
			return 0;
		}
		if(n == 0 || x == 1) {
			return pow;
		}
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
	
	public double myPowBit(double x, int n) {
		int binary = (n < 0 ? n * -1 : n);
		int n1 = 0;
		double pow = 1;
		while (binary > 0) {
			int bit = binary % 2;
			int newN = bit * (1 << n1++);
			binary /= 2;
			if (n < 0) {
				pow = pow(x, newN * (-1), pow);
				pow = pow(x, newN, pow);
			}
		}
		return pow;
	}

	public static void main(String[] args) {
		PowX obj = new PowX();
		long start = System.currentTimeMillis();
		System.out.println("2 = " + (1 << -2147483648));
		System.out.println(obj.myPowBit(2, -2147483648));
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start));
		//1.00000
//		2147483647
		//2.00000
//		-2147483648
		
	}

}
