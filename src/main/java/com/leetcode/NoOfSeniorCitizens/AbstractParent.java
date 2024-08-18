package com.leetcode.NoOfSeniorCitizens;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * NoOfSeniorCitizens
 * 18/08/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int countSeniors(String[] details);

    @Test
    public void should_give_correct_output1() {
        assertEquals(countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(countSeniors(new String[]{"1313579440F2036","2921522980M5644"}), 2);
    }

    @Test
    public void should_give_correct_output3() {
    }
}