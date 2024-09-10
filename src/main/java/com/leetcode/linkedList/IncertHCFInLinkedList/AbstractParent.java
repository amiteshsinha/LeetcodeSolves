package com.leetcode.linkedList.IncertHCFInLinkedList;

import com.amitesh.core.baseclass.ListNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.ListNode.createIntArrayFromList;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * InsertHCFInLinkedList
 * 10/09/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract ListNode insertGreatestCommonDivisors(ListNode head);

    @Test
    public void should_give_correct_output1() {
        assertEquals(
                createIntArrayFromList(insertGreatestCommonDivisors(ListNode.createList(new int[]{18,6,10,3})),7),
                new int[]{18,6,6,2,10,1,3}
        );
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(
                createIntArrayFromList(insertGreatestCommonDivisors(ListNode.createList(new int[]{7})),1),
                new int[]{7}
        );
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(
                createIntArrayFromList(insertGreatestCommonDivisors(ListNode.createList(new int[]{18,20,10})),5),
                new int[]{18,2,20,10,10}
        );
    }
}