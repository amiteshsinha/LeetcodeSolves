package com.leetcode.mergeNodesInBetweenZeros;

import com.amitesh.core.baseclass.ListNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.ListNode.createIntArrayFromList;
import static com.amitesh.core.baseclass.ListNode.createList;
import static org.testng.Assert.assertEquals;

/**
 * MergeNodesBetweenZeros
 * 04/07/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract ListNode mergeNodes(ListNode head);

    @Test
    public void should_give_correct_output1() {
        assertEquals(createIntArrayFromList(mergeNodes(createList(new int[]{0,3,1,0,4,5,2,0})), 2), new int[]{4,11});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(createIntArrayFromList(mergeNodes(createList(new int[]{0,1,0,3,0,2,2,0})), 3), new int[]{1,3,4});
    }

    @Test
    public void should_give_correct_output3() {
    }
}