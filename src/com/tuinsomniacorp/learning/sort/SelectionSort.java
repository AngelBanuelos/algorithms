package com.tuinsomniacorp.learning.sort;

import com.tuinsomniacorp.learning.utils.Utils;

/**
 *
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 */
public class SelectionSort implements Sort {

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
        return SelectionSort.class.getName();
    }

    @Override
    public int[] sort(int[] array) {
        int N = array.length;
        int positionHelper = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            positionHelper = i;
            for (int j = i + 1; j < N; j++) {
                comparisonCount++;
                if (array[positionHelper] > array[j]) {
                    positionHelper = j;
                }
            }
            comparisonCount++;
            if (i != positionHelper) {
                swapCount++;
                Utils.swap(array, positionHelper, i);
            }
        }
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
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
