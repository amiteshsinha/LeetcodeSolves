package com.leetcode.subsequence.longestIncreasingSubsequence;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * LongestIncreasingSubsequence
 * <p>
 * This file was created on 30/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int lengthOfLIS(int[] nums);

    //10,9,2,5,3,7,101,18}
    // 0,1,2,3,4,5,6,7
    // 2,4,3,5,1,0,7,6 - sorted indexes
    @Test
    public void should_give_correct_output_1() {
        assertEquals(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}), 4);//2,3,7,101 or 2,3,7,18
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(lengthOfLIS(new int[]{0,1,0,3,2,3}), 4);//0,1,2,3
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(lengthOfLIS(new int[]{7,7,7,7,7,7,7}), 1);
    }
}
