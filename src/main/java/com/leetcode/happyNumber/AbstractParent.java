package com.leetcode.happyNumber;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * HappyNumber
 * 03/05/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean isHappy(int n);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(isHappy(19), true);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(isHappy(2), false);

    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(isHappy(1), true);
    }
}