package com.leetcode.numberOf1Bits;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * NumberOf1Bits
 * 06/09/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int hammingWeight(int n);

    @Test
    public void should_give_correct_output1() {
        assertEquals(hammingWeight(11), 3);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(hammingWeight(128), 1);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(hammingWeight(2147483645), 30);
    }
}