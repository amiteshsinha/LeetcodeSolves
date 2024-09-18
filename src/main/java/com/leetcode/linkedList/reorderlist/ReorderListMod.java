package com.leetcode.linkedList.reorderlist;

public class ReorderListMod extends AbstractParent {

    @Override
    public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null, cur = slow, tmp;
        //reverse the linked list from mid to end
        // 1 -> 2 ->3
        //          \
        //          4 - null
        //         /
        //   6 -> 5
        while (cur != null) {
            tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        ListNode first = head, second = prev;
        while (second.next != null) {
            tmp = first.next;
            first.next = second;
            first = tmp;

            tmp = second.next;
            second.next = first;
            second = tmp;
        }
    }
}
