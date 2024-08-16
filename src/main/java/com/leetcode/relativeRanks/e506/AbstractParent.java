package com.leetcode.relativeRanks.e506;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * RelativeRanks
 * 08/05/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String[] findRelativeRanks(int[] score);

    protected String returnRank(int n) {
        switch(n) {
            case 0 :
                return "Gold Medal";
            case 1 :
                return "Silver Medal";
            case 2 :
                return "Bronze Medal";
            default:
                return n + 1 + "";
        }
    }

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(findRelativeRanks(new int[]{5,4,3,2,1}), new String[]{"Gold Medal","Silver Medal","Bronze Medal","4","5"});
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(findRelativeRanks(new int[]{10,3,8,9,4}), new String[]{"Gold Medal","5","Bronze Medal","Silver Medal","4"});
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(findRelativeRanks(new int[]{6,8}), new String[]{"Silver Medal","Gold Medal"});
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(findRelativeRanks(new int[]{0,106,4,8}), new String[]{"4","Gold Medal","Bronze Medal","Silver Medal"});
    }
}