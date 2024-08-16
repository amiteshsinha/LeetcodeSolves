package com.leetcode.specialArrayWithNumbersX;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * SpecialArrayBruteForce
 * 27/05/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int specialArray(int[] nums);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(specialArray(new int[]{3,5}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(specialArray(new int[]{0,0}), -1);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(specialArray(new int[]{0,4,3,0,4}), 3);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(specialArray(new int[]{0,1,3,0,4}), 2);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(specialArray(new int[]{0,100,3,0,1,4}), 3);
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(specialArray(new int[]{0,100,7,0,5,4}), 4);
    }

    @Test
    public void should_give_correct_output7() {
        Assert.assertEquals(specialArray(new int[]{3, 6,7,7,0}), -1);
    }
}