package com.leetcode.linkedList.rotateList;

import com.amitesh.core.baseclass.ListNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.ListNode.createIntArrayFromList;
import static com.amitesh.core.baseclass.ListNode.createList;

/**
 * RotateList
 * 01/05/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract ListNode rotateRight(ListNode head, int k);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(createIntArrayFromList(rotateRight(createList(new int[]{1,2,3,4,5}), 2),5), (new int[]{4,5,1,2,3}));
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(createIntArrayFromList(rotateRight(createList(new int[]{1,2,3,4,5}), 1),5), (new int[]{5,1,2,3,4}));
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertEquals(createIntArrayFromList(rotateRight(createList(new int[]{0,1,2}), 4),3), (new int[]{2,0,1}));

    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertEquals(createIntArrayFromList(rotateRight(createList(new int[]{0,1,2}), 2),3), (new int[]{1,2,0}));

    }
}