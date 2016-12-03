package com.tuinsomniacorp.learning.sort;

import com.tuinsomniacorp.learning.utils.Utils;

/**
 *
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 */
public class InsertionSort implements Sort {

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
        return InsertionSort.class.getName();
    }

    @Override
    public int[] sort(int[] array) {
        
        int N = array.length;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0; j--) {
                comparisonCount++;
                if (array[j] < array[j-1]) {
                    Utils.swap(array, j, j-1);
                    swapCount++;
                }
            }
        }
        long endtime = System.currentTimeMillis();
        executionTime = endtime - startTime;
        return array;
    }

    @Override
    public void printAnalysis() {
        System.out.println(getSortingName() + ", " + getSwapCount() + ", "
                + getComparisonCount() + ", " + getExecutionTime());
    }
    
    @Override
    public void reset() {
        comparisonCount = 0L;
        swapCount = 0L;
        executionTime = 0L;
    }

}
