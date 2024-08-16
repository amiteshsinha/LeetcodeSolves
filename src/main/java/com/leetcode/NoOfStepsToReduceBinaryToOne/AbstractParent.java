package com.leetcode.NoOfStepsToReduceBinaryToOne;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * NoOfStepsToReduceBinaryStringToOne
 * 29/05/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int numSteps(String s);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(numSteps("1101"), 6);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(numSteps("1110"), 5);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(numSteps("11"), 3);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(numSteps("100"), 2);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(numSteps("10"), 1);
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(numSteps("1111011110000011100000110001011011110010111001010111110001"), 85);
    }
}