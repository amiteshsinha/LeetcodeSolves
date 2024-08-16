package com.leetcode.xor.findOriginalArrOfPrefixXor;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * FindOrgArrOfPrefixXor
 * 30/05/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] findArray(int[] pref);

    @Test
    public void should_give_correct_output1() {
        assertEquals(findArray(new int[]{5,2,0,3,1}), new int[]{5,7,2,3,2});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(findArray(new int[]{13}), new int[]{13});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(findArray(new int[]{706832,199138,351457,328002}), new int[]{706832,639218,414979,23971});
    }
}