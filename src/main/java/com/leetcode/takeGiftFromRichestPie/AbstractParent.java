package com.leetcode.takeGiftFromRichestPie;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * TakeGiftFromRichestPie
 * <p>
 * This file was created on 12/12/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract long pickGifts(int[] gifts, int k);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(pickGifts(new int[]{25,64,9,4,100}, 4), 29);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(pickGifts(new int[]{1,1,1,1}, 4), 4);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(pickGifts(new int[]{17,2,52,54,41,1}, 14), 6);
    }
}
