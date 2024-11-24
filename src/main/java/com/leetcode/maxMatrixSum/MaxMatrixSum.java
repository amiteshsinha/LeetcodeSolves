package com.leetcode.maxMatrixSum;

/**
 * This file was created on 25/11/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class MaxMatrixSum extends AbstractParent {

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
        int n = matrix.length, noOfNegativeNos = 0, minAbsNumber = Integer.MAX_VALUE, temp;
        long sum = 0l;
        boolean isZeroAbsent = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp = matrix[i][j];
                if (temp < 0) {
                    noOfNegativeNos++;
                }
                if (temp == 0) {
                    isZeroAbsent = false;
                }
                temp = Math.abs(temp);
                if (temp < minAbsNumber) {
                    minAbsNumber = temp;
                }
                sum += temp;
            }
        }
        if (noOfNegativeNos % 2 != 0 && isZeroAbsent) {
            sum -= 2*minAbsNumber;
        }
        return sum;
    }

}
