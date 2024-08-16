package com.leetcode.kthSmallestPrimeFunction.m786;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * KthSmallestPrimeFraction
 * 10/05/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] kthSmallestPrimeFraction(int[] arr, int k);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(kthSmallestPrimeFraction(new int[]{1,2,3,5}, 3), new int[]{2,5});
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(kthSmallestPrimeFraction(new int[]{1,7}, 1), new int[]{1,7});
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(kthSmallestPrimeFraction(new int[]{1,2,3}, 3), new int[]{2,3});
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(kthSmallestPrimeFraction(new int[]{1,1553,3491,3803,4153,4561,4643,4723,4813,7411,8707,9511,9791,11719,18269,21493,
                21961,23833,25303,26717}, 58), new int[]{4561,21961});
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(kthSmallestPrimeFraction(new int[]{1,1553,3491,3803,4153,4561,4643,4723,4813,7411,8707,9511,9791,11719,18269,21493,
                21961,23833,25303,26717}, 84), new int[]{8707,25303});
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(kthSmallestPrimeFraction(new int[]{1,1553,3491,3803,4153,4561,4643,4723,4813,7411,8707,9511,9791,11719,18269,21493,
                21961,23833,25303,26717}, 100), new int[]{3803,9511});
    }

    @Test
    public void should_give_correct_output7() {
        Assert.assertEquals(kthSmallestPrimeFraction(new int[]{1,3,5,7,13}, 3), new int[]{1,5});
    }

    @Test
    public void should_give_correct_output8() {
        Assert.assertEquals(kthSmallestPrimeFraction(new int[]{1,3,5,7,13}, 7), new int[]{3,5});
    }

    @Test
    public void should_give_correct_output9() {
        Assert.assertEquals(kthSmallestPrimeFraction(new int[]{1,3,5,7,13}, 9), new int[]{5,7});
    }

    @Test
    public void should_give_correct_output10() {
        Assert.assertEquals(kthSmallestPrimeFraction(new int[]{1,3,5,7,13}, 8), new int[]{5,13});
    }
}