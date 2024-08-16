package com.leetcode.largestIntegerPair;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * LargestIntegerPair
 * 03/05/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findMaxK(int[] nums);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(findMaxK(new int[]{-1,2,-3,3}), 3);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(findMaxK(new int[]{-10,8,6,7,-2,-3}), -1);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(findMaxK(new int[]{-1,10,6,7,-7,1}), 7);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(findMaxK(new int[]{-9,-43,24,-23,-16,-30,-38,-30}), -1);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(findMaxK(new int[]{-34,7,7,-18,27,2,37,-50,-36,-7,31,23,5,-10,-3,45,20,-16,38,6}), 7);
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(findMaxK(new int[]{-7,7,7,2}), 7);
    }
}