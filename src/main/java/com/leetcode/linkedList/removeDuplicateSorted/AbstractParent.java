package com.leetcode.linkedList.removeDuplicateSorted;

import com.amitesh.core.baseclass.ListNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.ListNode.createIntArrayFromList;
import static com.amitesh.core.baseclass.ListNode.createList;
import static org.testng.Assert.assertEquals;

/**
 * RemoveDuplicateFromSortedLinkedList
 * 29/05/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract ListNode deleteDuplicates(ListNode head);

    @Test
    public void should_give_correct_output1() {
        assertEquals(createIntArrayFromList(deleteDuplicates(createList(new int[]{1,1,2,3,3})), 3), new int[]{1,2,3});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(createIntArrayFromList(deleteDuplicates(createList(new int[]{1,1,2})), 2), new int[]{1,2});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(createIntArrayFromList(deleteDuplicates(createList(new int[]{1,1,2,3,3,4,4,4})), 4), new int[]{1,2,3,4});
    }
}