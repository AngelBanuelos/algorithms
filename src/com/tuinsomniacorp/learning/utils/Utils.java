package com.tuinsomniacorp.learning.utils;

import java.util.Arrays;
import java.util.Random;

/**
 * Date: 12/02/2019
 * 
 * Util class to be used across all algorithms for create random arrays, validate if are sorted, print arrays, do swaps and so on.   
 * 
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 * 
 *  
 */

public class Utils {
	
	/**
	 * Create new random array giving parameters requested
	 * @param n Size of the array to create
	 * @param min Minimum value in the array
	 * @param max Maximum value in the array
	 * @return a new array with random values between min an max.
	 */
	public static int[] createArray(int n, int min, int max) {
        Random rmd = new Random();
        int[] array = new int[n];
        int bound = max - min + 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = rmd.nextInt(bound) + min;
        }

        return array;
    }

	/**
	 * Print a given int array
	 * @param array
	 */
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    /**
     * Swap value in position a by value in position b
     * @param array
     * @param a position inside the array
     * @param b position inside the array 
     */
    public static void swap(int[] array, int a, int b) {  
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;  
    }

    /**
     * Check if an array is sorted.
     * @param array to validate
     * @return true if the array is sorted otherwise false.
     */
    public static boolean isSorted(int[] array) { 
        for (int i = 0; i < array.length - 1; i++) { 
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Create a partial sorted array. Useful for analyze sorting algorithms
     * @param n Size of the array to create.
     * @return partial sorted array.
     */
    public static int[] partialSortArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < (int) (n - (n / 10)); i++) {
            array[i] = i;
        }
        for (int i = 0; i < (n / 10); i++) {
            array[(n - (n / 10)) + i] = (n - (n / 10)) - (i * 2);
        }
        return array;
    }

    /**
     * Create an inverted array. Useful for analyze sorting algorithms
     * @param n Size of the array to create.
     * @return inverted array.
     */
    public static int[] invertedArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (n - i);
        }
        return array;
    }

    /**
     * Create a sorted array. Useful for analyze sorting algorithms
     * @param elements Size of the array to create.
     * @return a new sorted array.
     */
    public static int[] createSortedArray(int elements) {
        int [] array = new int[elements];
        for (int i = 0; i < elements; i++) {
            array[i] = i;
        }
        return array;
    }
	

}
