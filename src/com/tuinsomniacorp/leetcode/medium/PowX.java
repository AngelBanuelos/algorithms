package com.tuinsomniacorp.leetcode.medium;

/**
 * 50. Pow(x, n) Implement pow(x, n).
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

		if (n == 0) {
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

		if (n == 0 || x == 1) {
			return pow;
		}
		if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE + 1) {
			return 0.0;
		}
		if (x == -1) {
			if (n % 2 == 0) {
				return 1;
			} else {
				return -1;
			}
		}
		if (n > 0) {
			while (pow != 0 && n > 0) {
				n--;
				pow *= x;
			}
		} else if (n < 0) {
			while (pow != 0 && n < 0) {
				n++;
				pow /= x;
			}
		}
		return pow;

	}

	/**
	 * x^15 x^1 x x^2 x x x^4 x xx x x^8 x x x xx x x x x^15 = x^1 * x^2 * x^4 *
	 * x^8 if n = 15 then binary number of 15 equal to 1 1 1 1 8+4+2+1 = 15
	 * 
	 * @param x
	 * @param n
	 * @return pow
	 */
	public double myPowBit(double x, int n) {
		int binary = (n < 0 ? -n : n);
		int n1 = 0;
		double pow = 1;
		while (binary > 0) {
			int bit = binary % 2;
			int newN = bit * (1 << n1++);
			binary /= 2;
			if (newN == 0) {
				continue;
			}
			if (n < 0) {
				pow = pow(x, -newN, pow);
			} else {
				pow = pow(x, newN, pow);
			}
		}
		return pow;
	}

	public static double pow(double base, int exp) {

		if(Integer.MIN_VALUE == exp) {
			return 0; 
		}
		if(base == 1) {
			return 1;
		}
		double result = 1;
		boolean negative = (exp < 0 ? true : false);
		
		//if exp is negative change it to positive to use the bit pow  
		if (negative) {
			exp = -exp;
		}

		while (exp != 0) {
			
			//validate if the exp is pair or not
			if ((exp & 1) == 1) {
				if (!negative) {
					result *= base;
				} else {
					result *= (1 / base);
				}
			}
			exp >>= 1;
			if (!negative) {
				base *= base;
			} else {
				base /= (1 / base);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(pow(-1, Integer.MAX_VALUE));
	}

}
