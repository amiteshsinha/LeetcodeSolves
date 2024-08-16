package com.leetcode.setMismatch645;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * SetMismatch
 * 22/01/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] findErrorNums(int[] nums);

    @Test
    public void shouldReturnCorrectArray1() {
        Assert.assertEquals(findErrorNums(new int[]{1,2,2,4}), new int[]{2,3});
    }

    @Test
    public void shouldReturnCorrectArray2() {
        Assert.assertEquals(findErrorNums(new int[]{1,1}), new int[]{1,2});
    }

    @Test
    public void shouldReturnCorrectArray3() {
        Assert.assertEquals(findErrorNums(new int[]{1,2,3,1}), new int[]{1,4});
    }

    @Test
    public void shouldReturnCorrectArray4() {
        Assert.assertEquals(findErrorNums(new int[]{1,2,3,4,3,6}), new int[]{3,5});
    }

    @Test
    public void shouldReturnCorrectArray5() {
        Assert.assertEquals(findErrorNums(new int[]{3,2,2}), new int[]{2,1});
    }
}