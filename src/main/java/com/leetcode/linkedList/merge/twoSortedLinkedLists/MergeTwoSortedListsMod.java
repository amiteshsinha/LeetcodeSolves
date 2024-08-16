package com.leetcode.linkedList.merge.twoSortedLinkedLists;

import com.amitesh.core.baseclass.ListNode;

public class MergeTwoSortedListsMod extends AbstractParent {

    @Override
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = new ListNode(-1), curr = head;
        // neither of them are null
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = (list1 == null) ? list2 : list1;
        return head.next;
    }
}