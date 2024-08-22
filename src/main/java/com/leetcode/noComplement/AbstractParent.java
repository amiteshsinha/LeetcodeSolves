package com.leetcode.noComplement;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * NumberComplement
 * 22/08/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findComplement(int num);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(findComplement(5), 2);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(findComplement(1), 0);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(findComplement(4), 3);
    }
}