package com.tuinsomniacorp.learning.sort;

import com.tuinsomniacorp.learning.performance.PerformanceAnalysis;

/**
 * Implement this interface in the sorting method when APosteriory analysis needs to be done.
 *
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 */
public interface Sort extends PerformanceAnalysis {
    
    public int[] sort(int[] array);

    public void reset();
    
}
