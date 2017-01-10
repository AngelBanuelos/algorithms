/**
 * 
 */
package com.tuinsomniacorp.eulerproject;

/**
 * @author angel_banuelos
 *
 */
public class EvenFibonaciiNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=1;
		int j=2;
		int limit = 4_000_000;
		int sum = 2;
		boolean is = true;

		while (i < limit) {
			int newVal = i + j;			
			if(is) {
				i = newVal;
			}else{
				j = newVal;
			}
			is = !is;
			if(newVal % 2 == 0){
				sum += newVal;
			}
		}
		System.out.println("Sum: " + sum);
	}

}
