package com.leetcode.linkedList.reorderlist;

public class ReorderList extends AbstractParent {

    @Override
    public void reorderList(ListNode head) {
        //needs to be recursively done
        ListNode last = head, mid = head;
        int count = 0;
        while (last.next != null && last.next.next != null) {
            last = last.next;
            count++;
            if (last != null && last.next != null && last.next.next != null) {
                last = last.next;
                count++;
            }
            mid = mid.next;
        }
        if (count == 0) {
            return;
        }
        if (count%2 == 0) {
            mid = mid.next;
        }
        ListNode current = head;
        while (mid.next != null) {
            // re-arrange the nodes in the list
            ListNode next = current.next;
            current.next = last.next;
            last.next.next = next;
            last.next = null;
            if (mid.next == null) {
                return;
            }
            // change the pointers
            current = next;
            ListNode temp = mid;
            while (temp.next != last) {
                temp = temp.next;
            }
            last = temp;
        }
    }
}
