package com.amitesh.core.baseclass;


public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; 
    }

    public static ListNode createList(int[] arr) {
        ListNode head = null, curr = null;
        for (int i :arr) {
            ListNode temp = new ListNode(i);
            if (head == null) {
                head = temp;
                curr = temp;
            } else {
                curr.next = temp;
                curr = curr.next;
            }
        }
        return head;
    }

    public static int[] createIntArrayFromList(ListNode head, int length) {
        int[] arr = new int[length];
        ListNode curr = head;
        for (int i = 0; i < length; i++) {
            arr[i] = curr.val;
            curr = curr.next;
        }
        return arr;
    }
    
}
