package com.leetcode.nextPermutation;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * NextPermutation
 * 03/06/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract void nextPermutation(int[] nums);

    @Test
    public void should_give_correct_output1() {
        int[] input = new int[]{2,1,8,7,6,5};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{2,5,1,6,7,8});
    }

    @Test
    public void should_give_correct_output2() {
        int[] input = new int[]{1,2,3,4};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{1,2,4,3});
    }

    @Test
    public void should_give_correct_output3() {
        int[] input = new int[]{5,3,4,9,7,6};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{5,3,6,4,7,9});
    }

    @Test
    public void should_give_correct_output4() {
        int[] input = new int[]{4,3,1,2};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{4,3,2,1});
    }


    @Test
    public void should_give_correct_output7() {
        int[] input = new int[]{1,1,5};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{1,5,1});
    }

    @Test
    public void should_give_correct_output6() {
        int[] input = new int[]{3,2,1};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{1,2,3});
    }

    @Test
    public void should_give_correct_output5() {
        int[] input = new int[]{1,2,3};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{1,3,2});
    }

    @Test
    public void should_give_correct_output8() {
        int[] input = new int[]{1,3,2};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{2,1,3});
    }

    @Test
    public void should_give_correct_output9() {
        int[] input = new int[]{2,1,3};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{2,3,1});
    }

    @Test
    public void should_give_correct_output10() {
        int[] input = new int[]{2,3,1};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{3,1,2});
    }

    @Test
    public void should_give_correct_output11() {
        int[] input = new int[]{3,1,2};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{3,2,1});
    }

    @Test
    public void should_give_correct_output12() {
        int[] input = new int[]{3,4,2,1};
        nextPermutation(input);
        Assert.assertEquals(input, new int[]{4,3,1,2});
    }
}