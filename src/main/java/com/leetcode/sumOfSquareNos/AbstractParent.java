package com.leetcode.sumOfSquareNos;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * SumOfSquareNumbers
 * 17/06/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean judgeSquareSum(int c);

    @Test
    public void should_give_correct_output1() {
        Assert.assertTrue(judgeSquareSum(5));
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertFalse(judgeSquareSum(3));
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertTrue(judgeSquareSum(25));
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertTrue(judgeSquareSum(4));
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertTrue(judgeSquareSum(160514));
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertTrue(judgeSquareSum(317));
    }

    @Test
    public void should_give_correct_output7() {
        Assert.assertFalse(judgeSquareSum(147));
    }

    @Test
    public void should_give_correct_output8() {
        Assert.assertTrue(judgeSquareSum(441));
    }

    @Test
    public void should_give_correct_output9() {
        Assert.assertFalse(judgeSquareSum(6));
    }

    @Test
    public void should_give_correct_output10() {
        Assert.assertFalse(judgeSquareSum(892784));
    }

    @Test
    public void should_give_correct_output11() {
        Assert.assertFalse(judgeSquareSum(12));
    }

    @Test
    public void should_give_correct_output12() {
        Assert.assertFalse(judgeSquareSum(24));
    }
}