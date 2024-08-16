package com.leetcode.containDuplicates2;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * ContainsDuplicates2
 * 17/06/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean containsNearbyDuplicate(int[] nums, int k);

    @Test
    public void should_give_correct_output1() {
        Assert.assertTrue(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertTrue(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertFalse(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}