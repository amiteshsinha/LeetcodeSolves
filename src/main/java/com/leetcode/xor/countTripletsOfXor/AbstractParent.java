package com.leetcode.xor.countTripletsOfXor;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * CountTripletsThatCanFormArrOfEqualXor
 * 30/05/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int countTriplets(int[] arr);

    @Test
    public void should_give_correct_output1() {
        assertEquals(countTriplets(new int[]{2,3,1,6,7}), 4);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(countTriplets(new int[]{1,1,1,1,1}), 10);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(countTriplets(new int[]{572,708,248,931,859,97,826,15,821,6,819,300,543,557,50,879,861,464,653,209,604,198,666,220,582,99,549,
                61,536}), 28);
    }
}