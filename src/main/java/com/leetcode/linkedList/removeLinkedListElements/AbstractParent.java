package com.leetcode.linkedList.removeLinkedListElements;

import com.amitesh.core.baseclass.ListNode;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.amitesh.core.baseclass.ListNode.createIntArrayFromList;
import static com.amitesh.core.baseclass.ListNode.createList;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * RemoveLinkedListElements
 * 06/09/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract ListNode removeElements(ListNode head, int val);

    @Test
    public void should_give_correct_output1() {
        assertEquals(createIntArrayFromList(removeElements(createList(new int[]{1,2,6,3,4,5,6}), 6), 5), new int[]{1,2,3,4,5});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(createIntArrayFromList(removeElements(createList(new int[]{}), 1), 0), new int[]{});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(createIntArrayFromList(removeElements(createList(new int[]{7,7,7,7}), 7), 0), new int[]{});
    }
}