package com.leetcode.firstMissingPositive;

import org.junit.jupiter.api.Test;


public abstract class AbstractFirstMissingPositive {

    public abstract int firstMissingPositive(int[] nums);

    @Test
    public void should_return_correct_resp0() {
        assert (firstMissingPositive(new int[]{1}) == 2);
    }

    @Test
    public void should_return_correct_resp10() {
        assert (firstMissingPositive(new int[]{-1}) == 1);
    }

    @Test
    public void should_return_correct_resp1() {
        assert (firstMissingPositive(new int[]{1, 2, 0}) == 3);
    }

    @Test
    public void should_return_correct_resp2() {
        assert (firstMissingPositive(new int[]{3, 4, -1, 1}) == 2);
    }

    @Test
    public void should_return_correct_resp3() {
        assert (firstMissingPositive(new int[]{7, 8, 9, 11, 12}) == 1);
    }

    @Test
    public void should_return_correct_resp4() {
        assert (firstMissingPositive(new int[]{1,2,3,4,7, 8, 9, 11, 12}) == 5);
    }

    @Test
    public void should_return_correct_resp5() {
        assert (firstMissingPositive(new int[]{-7, -8, -9, -11, -12}) == 1);
    }

    @Test
    public void should_return_correct_resp6() {
        assert (firstMissingPositive(new int[]{Integer.MIN_VALUE, -8, -9, -11, -12, 0}) == 1);
    }

    @Test
    public void should_return_correct_resp9() {
        assert (firstMissingPositive(new int[]{Integer.MIN_VALUE, -8, -9, -11, -12, 1}) == 2);
    }

    @Test
    public void should_return_correct_resp7() {
        assert (firstMissingPositive(new int[]{-7, -8, -9, -11, -12, 1 , Integer.MAX_VALUE}) == 2);
    }

    @Test
    public void should_return_correct_resp8() {
        assert (firstMissingPositive(new int[]{6, 5, 4, 3, 2, 1 , Integer.MAX_VALUE}) == 7);
    }

    @Test
    public void should_return_correct_resp11() {
        assert (firstMissingPositive(new int[]{6, 5, 4, 3, 2, 1 , Integer.MAX_VALUE,7, 9}) == 8);
    }
}
