package com.tuinsomniacorp.learning.sort;

import com.tuinsomniacorp.learning.utils.Utils;

/**
 *
 * 
 * 
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 *
 */
public class MergeSort implements Sort {

	private long swapCount;
	private long comparisonCount;
	private long executionTime;

	@Override
	public long getSwapCount() {
		return swapCount;
	}

	@Override
	public long getComparisonCount() {
		return comparisonCount;
	}

	@Override
	public long getExecutionTime() {
		return executionTime;
	}

	@Override
	public String getSortingName() {
		return MergeSort.class.getCanonicalName();
	}

	@Override
	public void printAnalysis() {
		System.out.println(
				getSortingName() + ", " + getSwapCount() + ", " + getComparisonCount() + ", " + getExecutionTime());
	}

	@Override
	public void reset() {
		comparisonCount = 0L;
		swapCount = 0L;
		executionTime = 0L;
	}

	@Override
	public int[] sort(int[] array) {

		return sort(array, 0, array.length - 1);
	}

	private int[] sort(int[] array, int start, int end) {
		int aux = (end - start);
		if (aux == 0) {
			return array;
		}
		if (aux == 1) {
			if (array[start] > array[end]) {
				Utils.swap(array, start, end);
			}
			return array;
		}
		int half = (aux / 2) + start;
		// left partition
		sort(array, start, half);
		// right partition
		sort(array, half + 1, end);
		
		merge(array, start, end, half);
		return array;
	}

	private void merge(int[] array, int start, int end, int half) {
		int left[] = new int[(half - start + 1)];
		int right[] = new int[(end - half)];
		int j = 0;
		int i = start;
		while (j <= left.length - 1 && i <= array.length) {
			left[j] = array[i];
			j++;
			i++;
		}
		i = half + 1;
		j = 0;
		while (j <= right.length - 1) {
			right[j] = array[i];
			j++;
			i++;
		}

		i = start;
		j = 0;
		int k = 0;
		while (i <= end && j < left.length) {
			if (k >= right.length || left[j] < right[k]) {
				array[i] = left[j];
				j++;
			} else {
				array[i] = right[k];
				k++;
			}
			i++;
		}

	}

}
