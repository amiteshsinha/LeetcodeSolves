package com.leetcode.studentAttendanceRecord2;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * AttendanceRecord2
 * 26/05/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int checkRecord(int n);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(checkRecord(2),8);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(checkRecord(1),3);
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(checkRecord(10101),183236316);
    }
}