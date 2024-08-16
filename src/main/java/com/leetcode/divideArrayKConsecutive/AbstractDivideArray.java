package com.leetcode.divideArrayKConsecutive;

import org.junit.jupiter.api.Test;

public abstract class AbstractDivideArray {

    abstract boolean isPossibleDivide(int[] nums, int k);

    @Test
    public void should_return_true_when_array_can_be_divided1() {
        assert (isPossibleDivide(new int[]{1,2,3,3,4,4,5,6}, 4));
    }

    @Test
    public void should_return_true_when_array_can_be_divided2() {
        assert (isPossibleDivide(new int[]{3,2,1,2,3,4,3,4,5,9,10,11}, 3));
    }

    @Test
    public void should_return_true_when_array_can_be_divided3() {
        assert (isPossibleDivide(new int[]{3,3,2,2,1,1}, 3));
    }

    @Test
    public void should_return_true_when_array_can_be_divided4() {
        assert (isPossibleDivide(new int[]{1,2,3,6,2,3,4,7,8}, 3));
    }

    @Test
    public void should_return_true_when_array_can_be_divided5() {
        assert (isPossibleDivide(new int[]{12, 12, 2, 11, 22, 20, 11, 13, 3, 21, 1, 13}, 3));
    }

    @Test
    public void should_return_true_when_array_cannot_be_divided1() {
        assert (!isPossibleDivide(new int[]{1,2,3,4}, 3));
    }

    @Test
    public void should_return_true_when_array_cannot_be_divided2() {
        assert (!isPossibleDivide(new int[]{1,2,2,3,3,4,4,4,5}, 3));
    }
}
