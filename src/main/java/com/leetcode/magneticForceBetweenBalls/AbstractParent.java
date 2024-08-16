package com.leetcode.magneticForceBetweenBalls;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * MagneticForceBetweenBalls
 * 20/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int maxDistance(int[] position, int m);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(maxDistance(new int[]{1,2,3,4,7}, 3), 3);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(maxDistance(new int[]{5,4,3,2,1,1000000000}, 2), 999999999);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(maxDistance(new int[]{5,4,3,2,1,1000000000}, 3), 4);
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(maxDistance(new int[]{79,74,57,22}, 4), 5);
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertEquals(maxDistance(new int[]{1,20,30,40,200}, 3), 39);
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertEquals(maxDistance(new int[]{1,20,30,40,50}, 4), 10);
    }
}