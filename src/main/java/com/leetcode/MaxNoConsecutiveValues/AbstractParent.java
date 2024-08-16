package com.leetcode.MaxNoConsecutiveValues;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MaxNoOfConsecutiveValueFromCoin
 * 16/06/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int getMaximumConsecutive(int[] coins);

    @Test
    public void should_give_correct_output1() {
        assertEquals(getMaximumConsecutive(new int[]{1,3}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(getMaximumConsecutive(new int[]{1,1,1,4}), 8);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(getMaximumConsecutive(new int[]{1,4,10,3,1}), 20);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(getMaximumConsecutive(new int[]{1,1,1,596,266,210,766,579,1,195,1,1,230,1,465,1,1,1,538,1,1,125,624,62,239,1,1,1,1,874,1,307,186,1,1,879,1,933,681,680,1,1,1,757,1,903,975,104,1,742,516,1,541,1,1,1,661,529,628,721,1,1,38,493,434,813,270,380,1,1,1,448,226,1,1,1,1,1,360,1,411,699,717,1,1,483,1,1,1,1,1,1,427,1,931,857,871,1,96,1,1,556,898,1,1,1,1,873,1,608,1,515,134,1,1,606,780,863,1,1,1,774,87,639,1,1,209,1,394,1,1,864,1,395,737,523,1,348,1,328,1,16,1,1,1,1,1,210,789,729,1,713,1,614,64,429,1,1,241,866,541,324}),
                42215);
    }
}