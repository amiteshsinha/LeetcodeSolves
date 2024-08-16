package com.leetcode.bestBuyStock;

import org.junit.jupiter.api.Test;

public abstract class AbstractParent {

    abstract int getMaxProfix(int[] stockArray);

    @Test
    public void should_return_max_value() {
        assert (getMaxProfix(new int[]{7,1,5,3,6,4}) == 5);
    }

    @Test
    public void should_return_max_value2() {
        assert (getMaxProfix(new int[]{7,6,4,3,1}) == 0);
    }

    @Test
    public void should_return_max_value3() {
        assert (getMaxProfix(new int[]{2,1,4}) == 3);
    }

    @Test
    public void should_return_max_value4() {
        assert (getMaxProfix(new int[]{3,2,6,5,0,3}) == 4);
    }

    @Test
    public void should_return_max_value5() {
        assert (getMaxProfix(new int[]{1}) == 0);
    }

    @Test
    public void should_return_max_value6() {
        assert (getMaxProfix(new int[]{1,4}) == 3);
    }

    @Test
    public void should_return_max_value7() {
        assert (getMaxProfix(new int[]{4,1}) == 0);
    }
}
