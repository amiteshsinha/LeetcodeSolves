package com.leetcode.heightChecker;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * HeightChecker
 * 10/06/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int heightChecker(int[] heights);

    @Test
    public void should_give_correct_output1() {
        assertEquals(heightChecker(new int[]{1,1,4,2,1,3}), 3);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(heightChecker(new int[]{5,1,2,3,4}), 5);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(heightChecker(new int[]{1,2,3,4,5}), 0);
    }
}