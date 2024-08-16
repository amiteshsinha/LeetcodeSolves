package com.leetcode.findWinnerCircularGame;


public class FindWinnerCircularGameIter1 extends AbstractParent {

    /**
     * Runtime
     * 39
     * ms
     * Beats
     * 24.72%
     * Analyze Complexity
     * Memory
     * 42.90
     * MB
     * Beats
     * 24.14%
     * @param n
     * @param k
     * @return
     */
    // n and k are less than 500
    @Override
    public int findTheWinner(int n, int k) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }
        ListNode prev = temp;
        temp.next = head;
        temp = head;
        int countdown = 0, tempCount = 0;
        while (prev  != prev.next) {
            countdown = k - 1;
            while (countdown != 0) {
                prev = temp;
                temp = temp.next;
                countdown--;
            }
            // remove node
            prev.next = temp.next;
            System.out.println("removing " + temp.val);
            temp.next = null;
            temp = prev.next;
        }
        return prev.val;
    }

    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
}
