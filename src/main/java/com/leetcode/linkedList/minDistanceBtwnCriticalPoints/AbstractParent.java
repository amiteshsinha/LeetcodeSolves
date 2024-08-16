package com.leetcode.linkedList.minDistanceBtwnCriticalPoints;

import com.amitesh.core.baseclass.ListNode;
import org.junit.jupiter.api.Test;

import static com.amitesh.core.baseclass.ListNode.createList;
import static org.testng.Assert.assertEquals;

/**
 * MinDistanceBetweenCriticalPoints
 * 05/07/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] nodesBetweenCriticalPoints(ListNode head);

    @Test
    public void should_give_correct_output1() {
        assertEquals(nodesBetweenCriticalPoints(createList(new int[]{5,3,1,2,5,1,2})), new int[]{1,3});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(nodesBetweenCriticalPoints(createList(new int[]{3,1})), new int[]{-1,-1});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(nodesBetweenCriticalPoints(createList(new int[]{1,3,2,2,3,2,2,2,7})), new int[]{3,3});
    }
}