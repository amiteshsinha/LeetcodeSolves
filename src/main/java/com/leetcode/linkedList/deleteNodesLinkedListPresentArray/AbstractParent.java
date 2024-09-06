package com.leetcode.linkedList.deleteNodesLinkedListPresentArray;

import com.amitesh.core.baseclass.ListNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.ListNode.createIntArrayFromList;
import static com.amitesh.core.baseclass.ListNode.createList;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * DeleteNodesFromLinkedListPresentInArray
 * 06/09/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract ListNode modifiedList(int[] nums, ListNode head);

    @Test
    public void should_give_correct_output1() {
        assertEquals(createIntArrayFromList(modifiedList(new int[]{1,2,3}, createList(new int[]{1,2,3,4,5})), 2), new int[]{4,5});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(createIntArrayFromList(modifiedList(new int[]{1}, createList(new int[]{1,2,1,2,1,2})), 3), new int[]{2,2,2});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(createIntArrayFromList(modifiedList(new int[]{5}, createList(new int[]{1,2,1,3,4})), 5), new int[]{1,2,1,3,4});
    }
}