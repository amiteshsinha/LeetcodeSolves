package com.leetcode.spiral.matrix4;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * SpiralMatrix4
 * 06/09/23
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[][] spiralMatrix(int m, int n, ListNode head);

    @Test
    public void should_give_correct_output1() {
        ListNode head = getNodeFromArray(new int []{3,0,2,6,8,1,7,9,4,2,5,5,0});
        int[][] retMatrix = spiralMatrix(3, 5, head);
        int[][] expectedRefMatrix  = {{3,0,2,6,8},{5,0,-1,-1,1},{5,2,4,9,7}};
        for (int i = 0; i < expectedRefMatrix.length; i++) {
            Assert.assertEquals(retMatrix[i], expectedRefMatrix[i]);
        }
    }

    @Test
    public void should_give_correct_output2() {
        ListNode head = getNodeFromArray(new int []{0,1,2});
        int[][] retMatrix = spiralMatrix(1, 4, head);
        int[][] expectedRefMatrix  = {{0,1,2,-1}};
        for (int i = 0; i < expectedRefMatrix.length; i++) {
            Assert.assertEquals(retMatrix[i], expectedRefMatrix[i]);
        }
    }

    @Test
    public void should_give_correct_output3() {
    }

    private ListNode getNodeFromArray(int[] arr) {
        ListNode head = null, curr = null;
        for (int i : arr) {
            ListNode next = new ListNode(i);
            if (head == null) {
                head = next;
                curr = next;
            } else {
                curr.next = next;
                curr = curr.next;
            }
        }
        return head;
    }
}