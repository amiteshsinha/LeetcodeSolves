package com.leetcode.productOfArrayExceptSelf;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * ProductOfArrayExceptSelf
 * 14/09/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] productExceptSelf(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(productExceptSelf(new int[]{1,2,3,4}), new int[]{24,12,8,6});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(productExceptSelf(new int[]{-1,1,0,-3,3}), new int[]{0,0,9,0,0});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(productExceptSelf(new int[]{7,5}), new int[]{5,7});
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(productExceptSelf(new int[]{-10,-5,1,5,-2,-3}), new int[]{-150,-300,1500,300,-750,-500});
    }
}