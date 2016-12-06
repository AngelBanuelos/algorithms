package com.tuinsomniacorp.test.sort;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.tuinsomniacorp.learning.sort.BubbleSort;
import com.tuinsomniacorp.learning.sort.CountingSort;
import com.tuinsomniacorp.learning.sort.HeapSort;
import com.tuinsomniacorp.learning.sort.InsertionSort;
import com.tuinsomniacorp.learning.sort.MergeSort;
import com.tuinsomniacorp.learning.sort.QuickSort;
import com.tuinsomniacorp.learning.sort.RadixSort;
import com.tuinsomniacorp.learning.sort.SelectionSort;
import com.tuinsomniacorp.learning.sort.Sort;
import com.tuinsomniacorp.learning.utils.Utils;

@RunWith(Parameterized.class)
public class SortTest {
	
	private Sort sort;
	
	public SortTest(Sort sort){
		this.sort = sort;
	}
	
	/**
	 * Test if all algorithms implemented are sorting correctly.
	 */
	@Test
	public void testSort() {
		long start = System.currentTimeMillis();
		int [] array = Utils.createArray(100_000, 0, 10000);
		sort.sort(array);
		if(!Utils.isSorted(array)) {
			System.err.println(sort.getSortingName() + " is not sorting");
			fail(sort.getSortingName() + " is not sorting ");
		}
		long end = System.currentTimeMillis();
		System.out.println(sort.getSortingName() + " Execution time:  " + (end - start));
		
	}
	
	/**
	 * Instantiate each sorting algorithm to be tested.
	 * @return a list of Implemented algorithms
	 */
	@Parameterized.Parameters
    public static Collection<Object[]> instancesToTest() {
    	
        return Arrays.asList(
	        		new Object[]{new InsertionSort()},
	                new Object[]{new SelectionSort()},
	                new Object[]{new BubbleSort()},
                    new Object[]{new MergeSort()},
                    new Object[]{new HeapSort()},
                    new Object[]{new QuickSort()},
                    new Object[]{new RadixSort()},
                    new Object[]{new CountingSort()}
        );
    }
    
    private void testNegative(){
    	
    }

}
