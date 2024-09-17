package com.leetcode.subarrayWithMaxAnd;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * SubArrayWithMaxAnd
 * 14/09/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int longestSubarray(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(longestSubarray(new int[]{1,2,3,3,2,2}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(longestSubarray(new int[]{1,2,3,4}), 1);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(longestSubarray(new int[]{311155,311155,311155,311155,311155,311155,311155,311155,201191,311155}), 8);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(longestSubarray(new int[]{311155,311155,311155,311155}), 4);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(longestSubarray(new int[]{
                586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
                586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
                586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
                586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
                516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529,
                516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529, 516529,
                55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816,
                55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816,
                55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816, 55816,
                586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
                586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
                586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
                586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
                586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
                586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730, 586730,
                586730, 586730, 586730, 586730, 586730,
                232392, 232392, 294503}), 125);
    }
}