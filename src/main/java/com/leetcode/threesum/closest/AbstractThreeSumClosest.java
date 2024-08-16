package com.leetcode.threesum.closest;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public abstract class AbstractThreeSumClosest {

    public abstract int threeSumClosest(int[] nums, int target);

    @Test
    public void should_return_closest_val() {
        assert (threeSumClosest(new int[]{-1,2,1,-4}, 1) == 2);
    }

    @Test
    public void should_return_closest_val2() {
        assert (threeSumClosest(new int[]{0,0,0}, 1) == 0);
    }

    @Test
    public void should_return_closest_val3() {
        assert (threeSumClosest(new int[]{0,0,0, 2}, 4) == 2);
    }

    @Test
    public void should_return_closest_val4() {
        assert (threeSumClosest(new int[]{-1,2,1, 4}, 5) == 5);
    }

    @Test
    public void should_return_closest_val5() {
        assert (threeSumClosest(new int[]{-1,2,1, 4}, 6) == 5);
    }

    @Test
    public void should_return_closest_val6() {
        Assert.assertEquals(threeSumClosest(new int[]{-1000,-5,-5,-5,-5,-5,-5,-1,-1,-1}, -14), -15);
    }
}
