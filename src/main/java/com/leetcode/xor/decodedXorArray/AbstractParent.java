package com.leetcode.xor.decodedXorArray;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * DecodedXorArray
 * 30/05/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] decode(int[] encoded, int first);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(decode(new int[]{1,2,3}, 1), new int[]{1,0,2,1});
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(decode(new int[]{6,2,7,3}, 4), new int[]{4,2,0,7,4});
    }

    @Test
    public void should_give_correct_output3() {
    }
}