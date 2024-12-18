package com.leetcode.finalPriceWithDiscount;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * FinalPriceWithSpecialShopDiscount
 * <p>
 * This file was created on 18/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int[] finalPrices(int[] prices);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(finalPrices(new int[]{8,4,6,2,3}), new int[]{4,2,4,2,3});
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(finalPrices(new int[]{1,2,3,4,5}), new int[]{1,2,3,4,5});
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(finalPrices(new int[]{10,1,1,6}), new int[]{9,0,1,6});
    }

    @Test
    public void should_give_correct_output_4() {
        assertEquals(finalPrices(new int[]{6,5,4,3,2,1}), new int[]{1,1,1,1,1,1});
    }

    @Test
    public void should_give_correct_output_5() {
        assertEquals(finalPrices(new int[]{7,8,9,3,4,6,1}), new int[]{4,5,6,2,3,5,1});
    }

    @Test
    public void should_give_correct_output_6() {
        assertEquals(finalPrices(new int[]{8,7,4,2,8,1,7,7,10,1}), new int[]{1,3,2,1,7,0,0,6,9,1});
    }
}
