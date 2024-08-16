package com.leetcode.linkedList.deleteNodeLinkedList;

import com.amitesh.core.baseclass.ListNode;

public class DeleteNodeLinkedList extends AbstractParent {

    @Override
    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.next = temp.next;
        node.val = temp.val;
        temp.next = null;
    }
}
