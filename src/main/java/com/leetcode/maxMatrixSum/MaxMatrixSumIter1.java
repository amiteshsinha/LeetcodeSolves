package com.leetcode.maxMatrixSum;

/**
 * Runtime
 * 4
 * ms
 * Beats
 * 99.19%
 *
 * Memory
 * 54.48
 * MB
 * Beats
 * 99.09%
 * This file was created on 25/11/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class MaxMatrixSumIter1 extends AbstractParent {

    @Override
    public long maxMatrixSum(int[][] matrix) {
        // if 2 numbers are diagonally negative both can be converted into +ve using 2 steps
        // if odd numbers are -ve then we can only get max of those odd numbers
        // count number of -ve nos
        //Step 1a - count number of -ve numbers
        //Step 1b - find absolute min value in matrix
        //Step 1c - check if there is any 0 in the matrix.
        //Step 2 - if the number of -ve numbers is even - then we can get sum as abs value
        //Step 3 - if the number of -ve numbers are odd then
        //Step 3a- if there is a 0 then we can get sum as abs value else we get sum - 2*min number
        //Update - We dont need to keep track whether 0 is present or not. If the number of -ves is odd and there is a 0
        // then we will deduct sum -2*0 which results in the same answer
        int n = matrix.length, minAbsNumber = Integer.MAX_VALUE, temp;
        boolean oddNoOfNegatives = false;
        long sum = 0l;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp = matrix[i][j];
                if (temp < 0) {
                    oddNoOfNegatives = !oddNoOfNegatives;
                    temp = -temp;
                }
                if (temp < minAbsNumber) {
                    minAbsNumber = temp;
                }
                sum += temp;
            }
        }
        if (oddNoOfNegatives) {
            return sum - 2*minAbsNumber;
        }
        return sum;
    }

}
