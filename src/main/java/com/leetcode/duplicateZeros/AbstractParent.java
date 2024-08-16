package com.leetcode.duplicateZeros;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * DuplicateZeros
 * 05/08/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract void duplicateZeros(int[] arr);

    @Test
    public void should_give_correct_output1() {
        int[] temp = new int[]{1,0,2,3,0,4,5,0};
        duplicateZeros(temp);
        Assert.assertEquals(temp, new int[]{1,0,0,2,3,0,0,4});
    }

    @Test
    public void should_give_correct_output2() {
        int[] temp = new int[]{1,2,3};
        duplicateZeros(temp);
        Assert.assertEquals(temp, new int[]{1,2,3});
    }

    @Test
    public void should_give_correct_output3() {
        int[] temp = new int[]{1,0,0,2,3,0,0,4};
        duplicateZeros(temp);
        Assert.assertEquals(temp, new int[]{1,0,0,0,0,2,3,0});
    }

    @Test
    public void should_give_correct_output4() {
        int[] temp = new int[]{1,0,0,0,3,0,4,5,6,0};
        duplicateZeros(temp);
        Assert.assertEquals(temp, new int[]{1,0,0,0,0,0,0,3,0,0});
    }

    @Test
    public void should_give_correct_output5() {
        int[] temp = new int[]{1,0,3,0,0,0,4,5,6,0};
        duplicateZeros(temp);
        Assert.assertEquals(temp, new int[]{1,0,0,3,0,0,0,0,0,0});
    }

    @Test
    public void should_give_correct_output6() {
        int[] temp = new int[]{0,0,0,0,0,0,0};
        duplicateZeros(temp);
        Assert.assertEquals(temp, new int[]{0,0,0,0,0,0,0});
    }
}