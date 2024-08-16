package com.leetcode.threeConsqOddNos;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * ThreeConsecutiveOdds
 * 01/07/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean threeConsecutiveOdds(int[] arr);

    @Test
    public void should_give_correct_output1() {
        Assert.assertFalse(threeConsecutiveOdds(new int[]{2,6,4,1}));
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertTrue(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
    }

    @Test
    public void should_give_correct_output3() {
    }
}