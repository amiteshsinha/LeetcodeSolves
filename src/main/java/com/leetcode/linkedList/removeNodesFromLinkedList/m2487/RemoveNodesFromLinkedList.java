package com.leetcode.linkedList.removeNodesFromLinkedList.m2487;

import com.amitesh.core.baseclass.ListNode;

public class RemoveNodesFromLinkedList extends AbstractParent {
//todo - fix this code
    @Override
    public ListNode removeNodes(ListNode head) {
        ListNode lastMaxima = head, next = head, temp = head, maxSoFar = head.next;
        while (maxSoFar != null) {
            while (maxSoFar.next != null && next.val >= maxSoFar.val) {
                if (next.val != maxSoFar.val) {
                    next = maxSoFar;
                }
                maxSoFar = maxSoFar.next;
            }
            if (maxSoFar.next == null && temp == head) {
                break;
            }
            if (lastMaxima.val >= maxSoFar.val) {
                lastMaxima.next = maxSoFar;
            } else {
                lastMaxima = maxSoFar;
                temp = lastMaxima;
            }
            if (lastMaxima != next) {
                next.next = null;
            }
            next = maxSoFar;
            maxSoFar = maxSoFar.next;
        }
        return temp;
    }
}
