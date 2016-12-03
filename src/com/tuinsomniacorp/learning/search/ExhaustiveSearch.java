package com.tuinsomniacorp.learning.search;

/**
 *
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 */
public class ExhaustiveSearch implements Search {

    @Override
    public int search(int[] array, int elementTofind) {
        int positionFound = -1;
        final int N = array.length;
        for (int i = 0; i < N; i++) {
            if(elementTofind == array[i]){
                return i;
            }
        }
        return positionFound;
    }

}
