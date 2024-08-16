package com.leetcode.subsets.noOfBeautifulSubsets;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * NumberOfBeautifulSubsets
 * 23/05/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int beautifulSubsets(int[] nums, int k);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(beautifulSubsets(new int[]{2,4,6}, 2), 4);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(beautifulSubsets(new int[]{1}, 1), 1);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(beautifulSubsets(new int[]{2,4,6}, 3), 7);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(beautifulSubsets(new int[]{4,2,5,9,10,3}, 1), 23);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(beautifulSubsets(new int[]{10,4,5,7,2,1}, 3), 23);
    }
}