package com.leetcode.linkedList.removeNodesFromLinkedList.m2487;

import com.amitesh.core.baseclass.ListNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.ListNode.createIntArrayFromList;
import static com.amitesh.core.baseclass.ListNode.createList;
import static org.testng.Assert.assertEquals;

/**
 * RemoveNodesFromLinkedList
 * 07/05/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract ListNode removeNodes(ListNode head);

    @Test
    public void should_give_correct_output1() {
        assertEquals(createIntArrayFromList(removeNodes(createList(new int[]{5,2,13,3,8})),2), new int[]{13,8});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(createIntArrayFromList(removeNodes(createList(new int[]{1,1,1,1})),4), new int[]{1,1,1,1});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(createIntArrayFromList(removeNodes(createList(new int[]{5,4,3,2})),4), new int[]{5,4,3,2});
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(createIntArrayFromList(removeNodes(createList(new int[]{2,3,4,5})),1), new int[]{5});
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(createIntArrayFromList(removeNodes(createList(new int[]{12,4,3,7,5,2})),4), new int[]{12,7,5,2});
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(createIntArrayFromList(removeNodes(createList(new int[]{12,4,3,7,7,7,7})),5), new int[]{12,7,7,7,7});
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(createIntArrayFromList(removeNodes(createList(new int[]{12,10,9,7,7,7,7,8})),4), new int[]{12,10,9,8});
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(createIntArrayFromList(removeNodes(createList(new int[]{12,10,9,8,7,7,7,7,8})),5), new int[]{12,10,9,8,8});
    }
}