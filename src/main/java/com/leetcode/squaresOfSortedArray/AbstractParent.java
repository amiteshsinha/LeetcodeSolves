package com.leetcode.squaresOfSortedArray;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SquaresOfSortedArray
 * 01/06/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] sortedSquares(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(sortedSquares(new int[]{-4,-1,0,3,10}), new int[]{0,1,9,16,100});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(sortedSquares(new int[]{-7,-3,2,3,11}), new int[]{4,9,9,49,121});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(sortedSquares(new int[]{-9,2,3,7,11}), new int[]{4,9,49,81,121});
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(sortedSquares(new int[]{-9,-7,-4,-3,11}), new int[]{9,16,49,81,121});
    }
}