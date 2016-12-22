package com.tuinsomniacorp.learning.tree;

/**
 *
 * Description: 
 *
 *
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 * Date: Dec 22, 2016
 *
 */
public class TreeUtils {

	/**
	 * Util method to know if a tree is sorted
	 * 
	 * @param array
	 * @return true if the Tree array is sorted
	 */
	public static boolean isSorted(Tree[] array) {
		 for (int i = 0; i < array.length - 1; i++) { 
	            if (array[i].intValue() > array[i + 1].intValue()) {
	                return false;
	            }
	        }
		return true;
	}
	

}
