package com.tuinsomniacorp.learning.performance;

/**
 *
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 */
public interface PerformanceAnalysis {
    
    public long getSwapCount();
    public long getComparisonCount();
    public long getExecutionTime();
    public String getSortingName();
    public void printAnalysis();
    
}
