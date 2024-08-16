package com.leetcode.linkedList.merge.twoSortedLinkedLists;

import com.amitesh.core.baseclass.ListNode;

public class MergeTwoSortedLists extends AbstractParent {

    @Override
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = new ListNode(-1), curr = head, temp;
        // neither of them are null
        while (list1 != null || list2 != null) {
            if ((list2 == null && list1 != null) || (list1 != null && list2 != null && list1.val < list2.val)) {
                curr.next = list1;
                curr = list1;
                temp = list1.next;
                curr.next = null;
                list1 = temp;
            } else {
                curr.next = list2;
                curr = list2;
                temp = list2.next;
                curr.next = null;
                list2 = temp;
            }
        }
        return head.next;
    }
}









//while (list2 != null && list1 != null && list1.next != null && list1.next.val <= list2.val) {
//        list1 = list1.next;
//        }
//        // it means that the above while loop is broken i.e. list1.next.val > list2.val;
//        if (list2 != null) {
//        temp = list1.next;
//        list1.next = list2;
//        list1 = temp;
//        }
//        while (list1 != null && list2 != null && list2.next != null && list2.next.val <= list1.val) {
//        if (list2 != null) {
//        list2 = list2.next;
//        }
//        }
//        if (list1 != null) {
//        temp = list2.next;
//        list2.next = list1;
//        list2 = temp;
//        }