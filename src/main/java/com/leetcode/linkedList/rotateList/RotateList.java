package com.leetcode.linkedList.rotateList;

import com.amitesh.core.baseclass.ListNode;

public class RotateList extends AbstractParent {

    @Override
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        int length = 1;
        while (curr != null && curr.next != null) {
            curr = curr.next;
            length++;
        }
        k = k%length;
        if (k == 0) {
            return head;
        }
        int size = 0;
        length = length - k;
        ListNode temp = head,prev = head;
        while (size != length) {
            prev = temp;
            temp = temp.next;
            size++;
        }
        curr.next = head;
        prev.next = null;
        return temp;
    }
}
