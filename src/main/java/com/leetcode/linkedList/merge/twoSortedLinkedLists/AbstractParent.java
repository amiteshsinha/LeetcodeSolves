package com.leetcode.linkedList.merge.twoSortedLinkedLists;

import com.amitesh.core.baseclass.ListNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.ListNode.createIntArrayFromList;
import static com.amitesh.core.baseclass.ListNode.createList;

/**
 * MergeTwoSortedLists
 * 26/04/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract ListNode mergeTwoLists(ListNode list1, ListNode list2);

    @Test
    public void should_give_correct_output1() {
        ListNode result = mergeTwoLists(createList(new int[]{1,2,4}), createList(new int[]{1,3,4}));
        Assert.assertEquals(createIntArrayFromList(result, 6), new int[]{1,1,2,3,4,4});
    }

    @Test
    public void should_give_correct_output2() {
        ListNode result = mergeTwoLists(createList(new int[]{}), createList(new int[]{}));
        Assert.assertEquals(createIntArrayFromList(result, 0), new int[]{});
    }

    @Test
    public void should_give_correct_output3() {
        ListNode result = mergeTwoLists(createList(new int[]{}), createList(new int[]{0}));
        Assert.assertEquals(createIntArrayFromList(result, 1), new int[]{0});
    }

    @Test
    public void should_give_correct_output4() {
        ListNode result = mergeTwoLists(createList(new int[]{1,3,5,7}), createList(new int[]{2,4,6,8}));
        Assert.assertEquals(createIntArrayFromList(result, 8), new int[]{1,2,3,4,5,6,7,8});
    }

    @Test
    public void should_give_correct_output5() {
        ListNode result = mergeTwoLists(createList(new int[]{1,3,4,7}), createList(new int[]{2,5,6,8,9}));
        Assert.assertEquals(createIntArrayFromList(result, 9), new int[]{1,2,3,4,5,6,7,8,9});
    }

    @Test
    public void should_give_correct_output6() {
        ListNode result = mergeTwoLists(createList(new int[]{2}), createList(new int[]{}));
        Assert.assertEquals(createIntArrayFromList(result, 1), new int[]{2});
    }

    @Test
    public void should_give_correct_output7() {
        ListNode result = mergeTwoLists(createList(new int[]{2}), createList(new int[]{1}));
        Assert.assertEquals(createIntArrayFromList(result, 2), new int[]{1,2});
    }

    @Test
    public void should_give_correct_output8() {
        ListNode result = mergeTwoLists(createList(new int[]{2,4,6}), createList(new int[]{1,3,4,5}));
        Assert.assertEquals(createIntArrayFromList(result, 7), new int[]{1,2,3,4,4,5,6});
    }
}