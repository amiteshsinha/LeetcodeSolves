package com.leetcode.compareVersionNo;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * CompareVersionNo
 * 03/05/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int compareVersion(String version1, String version2);

    @Test
    public void should_give_correct_output1() {
        String version1 = "1.01", version2 = "1.001";
        Assert.assertEquals(compareVersion(version1, version2), 0);
    }

    @Test
    public void should_give_correct_output2() {
        String version1 = "1.0", version2 = "1.0.0";
        Assert.assertEquals(compareVersion(version1, version2), 0);
    }

    @Test
    public void should_give_correct_output3() {
        String version1 = "0.1", version2 = "1.1";
        Assert.assertEquals(compareVersion(version1, version2), -1);
    }

    @Test
    public void should_give_correct_output4() {
        String version1 = "2.5.33", version2 = "0.1";
        Assert.assertEquals(compareVersion(version1, version2), 1);
    }

    @Test
    public void should_give_correct_output5() {
        String version1 = "1.0", version2 = "1.1";
        Assert.assertEquals(compareVersion(version1, version2), -1);
    }

    @Test
    public void should_give_correct_output6() {
        String version1 = "1.0.1", version2 = "1";
        Assert.assertEquals(compareVersion(version1, version2), 1);
    }
}