package com.leetcode.assignCookies;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * AssignCookies
 * 12/04/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findContentChildren(int[] g, int[] s);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(findContentChildren(new int[]{1,2,3},new int[]{1,1}), 1);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(findContentChildren(new int[]{1,2,3},new int[]{1,2}), 2);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(findContentChildren(new int[]{1,2},new int[]{1,2,3}), 2);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(findContentChildren(new int[]{1,2,4,6},new int[]{1,2,3,4,5}), 3);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(findContentChildren(new int[]{10,9,8,7},new int[]{5,6,7,8}), 2);
    }
}