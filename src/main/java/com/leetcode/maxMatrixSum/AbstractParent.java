package com.leetcode.maxMatrixSum;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * MaxMatrixSum
 * <p>
 * This file was created on 25/11/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract long maxMatrixSum(int[][] matrix);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(maxMatrixSum(new int[][]{{1,-1},{-1,1}}), 4);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(maxMatrixSum(new int[][]{{1,2,3},{-1,-2,-3},{1,2,3}}), 16);
    }

    /**
     * in this scenario - the negative numbers form a + symbol.
     * Here again we can choose max of these 5 in output
     */
    @Test
    public void should_give_correct_output_3() {
        assertEquals(maxMatrixSum(new int[][]{
                {1,-2,3},
                {-1,-2,-3},
                {1,-2,3}}),
        16);
    }

    /**
     * If there are odd number of -ve numbers connected to each other - we get max 1 as negative.
     * If even number of -ve numbers are connected - then we can convert all of them
     */
    @Test
    public void should_give_correct_output_4() {
        assertEquals(maxMatrixSum(new int[][]{
                        {1, -2, 3, 4},//10
                        {-1,-2,-3, 5},//11
                        {-1,-2, 3,-4},//10
                        {1, -2, 2, 5}}),//10
                41);
    }

    /**
     * If there are odd number of -ve numbers connected to each other - we get max 1 as negative.
     * this 1 max can be the min number +ve or -ve in the matrix
     * If even number of -ve numbers are connected - then we can convert all of them
     */
    @Test
    public void should_give_correct_output_5() {
        assertEquals(maxMatrixSum(new int[][]{
                        {1,  2, 3,-4},//10
                        {-4, 2,-3, 5},//14
                        {-4,-2, 3,-4},//13
                        {1, -3, 2, 5}}),//11 - here the 1st 1 can be converted to -1
                46);
    }

    /**
     * If there is a 0 added to the matrix then that 0 can absorb all -ve multiplications
     * doesn't matter if its surrounded by any +ve numbers
     */
    @Test
    public void should_give_correct_output_6() {
        assertEquals(maxMatrixSum(new int[][]{
                        {0,  2, 3,-4},//9
                        {4,  2,-3, 5},//14
                        {-2,-2, 3,-4},//11
                        {1, -2,-2, 5}}),//10
                44);
    }
}
