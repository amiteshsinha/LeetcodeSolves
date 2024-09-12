package com.leetcode.defangIPAddress;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * DefangingAnIPAddress
 * 12/09/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String defangIPaddr(String address);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(defangIPaddr("1.1.1.1"), "1[.]1[.]1[.]1");
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(defangIPaddr("255.100.50.0"), "255[.]100[.]50[.]0");
    }

    @Test
    public void should_give_correct_output3() {
    }
}