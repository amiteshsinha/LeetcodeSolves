package com.leetcode.kthLargestElementInStream;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * KthLargest
 * 12/08/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public class AbstractParent {

    @Test
    public void should_give_correct_output1() {
        KthLargestIter1 kthLargest = new KthLargestIter1(3, new int[]{4,5,8,2});
        Assert.assertEquals(kthLargest.add(3), 4);   // return 4
        Assert.assertEquals(kthLargest.add(5), 5);  // return 5
        Assert.assertEquals(kthLargest.add(10), 5);  // return 5
        Assert.assertEquals(kthLargest.add(9), 8);   // return 8
        Assert.assertEquals(kthLargest.add(4), 8); // returns 8
    }

    @Test
    public void should_give_correct_output2() {
        KthLargestIter1 kthLargest = new KthLargestIter1(1, new int[]{});
        Assert.assertEquals(kthLargest.add(-3), -3);
        Assert.assertEquals(kthLargest.add(-2), -2);
        Assert.assertEquals(kthLargest.add(-4), -2);
        Assert.assertEquals(kthLargest.add(0), 0);
        Assert.assertEquals(kthLargest.add(4), 4);
    }

    @Test
    public void should_give_correct_output3() {
        KthLargestIter1 kthLargest = new KthLargestIter1(2, new int[]{0});
        Assert.assertEquals(kthLargest.add(-1), -1);
        Assert.assertEquals(kthLargest.add(1), 0);
        Assert.assertEquals(kthLargest.add(-2), 0);
        Assert.assertEquals(kthLargest.add(-4), 0);
        Assert.assertEquals(kthLargest.add(3), 1);
    }
}