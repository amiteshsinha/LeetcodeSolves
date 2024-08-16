package com.leetcode.getEqualSubstringWithinBudget;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * GetEqualSubstringWithinBudget
 * 28/05/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int equalSubstring(String s, String t, int maxCost);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(equalSubstring("abcd", "bcdf", 3), 3);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(equalSubstring("abcd", "cdef", 3), 1);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(equalSubstring("abcd", "acde", 0), 1);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(equalSubstring("krpgjbjjznpzdfy", "nxargkbydxmsgby", 14), 4);
    }
}