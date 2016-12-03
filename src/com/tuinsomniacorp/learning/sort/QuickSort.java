package com.tuinsomniacorp.learning.sort;

import com.tuinsomniacorp.learning.utils.Utils;

/**
 *
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 */
public class QuickSort implements Sort {

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
        return CountingSort.class.getName();
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

    @Override
    public int[] sort(int[] array) {
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        return quickSort(array, leftPointer, rightPointer);
    }

    private int[] quickSort(int[] array, int leftPointer, int rightPointer) {
        if (rightPointer <= leftPointer || rightPointer - leftPointer == 1) {
            if (rightPointer > leftPointer && array[rightPointer] < array[leftPointer]) {
                Utils.swap(array, leftPointer, rightPointer);
            }
            return array;
        } else {
            int partitionPos = partition(array, leftPointer, rightPointer - 1, rightPointer);
            quickSort(array, leftPointer, partitionPos - 1);
            quickSort(array, partitionPos + 1, rightPointer);
        }
        return array;
    }

    private int partition(int[] array, int leftPointer, int rightPointer, int pivot) {
        int tempLeft = leftPointer, tempRigth = rightPointer;
        int pivotNum = array[pivot];
        while (!(tempLeft >= tempRigth)) {
            while (tempLeft <= rightPointer && array[tempLeft] <= pivotNum) {
                tempLeft++;
            }
            while (tempRigth >= leftPointer && array[tempRigth] >= pivotNum) {
                tempRigth--;
            }
            if (tempLeft < tempRigth) {
                Utils.swap(array, tempLeft, tempRigth);
                tempLeft++;
                tempRigth--;
            }
        }
        if (tempLeft != pivot) {
            Utils.swap(array, tempLeft, pivot);
        }
        return tempLeft;

    }

}
