package com.leetcode.fractionAdditionAndSubtraction;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * FractionAddition
 * 23/08/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String fractionAddition(String expression);

    @Test
    public void should_give_correct_output1() {
        assertEquals(fractionAddition("-1/2+1/2"), "0/1");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(fractionAddition("-1/2+1/2+1/3"), "1/3");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(fractionAddition("1/3-1/2"), "-1/6");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(fractionAddition("12/7-31/29"), "131/203");
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(fractionAddition("12/7-31/29-160/16"), "-1899/203");
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(fractionAddition("7/2+2/3-3/4"), "41/12");
    }
}