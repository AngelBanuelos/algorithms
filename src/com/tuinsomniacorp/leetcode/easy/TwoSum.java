package com.tuinsomniacorp.leetcode.easy;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have
 * exactly one solution. Example: Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 *
 */
public class TwoSum {

	
	/**
	 * Cuadratic Solution 
	 * @param nums
	 * @param target
	 * @return array with the solution
	 */
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			for(int j = i; j < nums.length; j++) {
				if(nums[i] + nums[j] == target){
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}

}
