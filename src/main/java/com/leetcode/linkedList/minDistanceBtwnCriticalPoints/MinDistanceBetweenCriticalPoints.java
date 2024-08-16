package com.leetcode.linkedList.minDistanceBtwnCriticalPoints;

import com.amitesh.core.baseclass.ListNode;

public class MinDistanceBetweenCriticalPoints extends AbstractParent {

    /**
     * Runtime
     * 7
     * ms
     * Beats
     * 44.69%
     *
     * Memory
     * 60.41
     * MB
     * Beats
     * 64.65%
     * @param head
     * @return
     */
    @Override
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] retArr = {-1,-1};
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, lowestIndex = -1, previndex = -1;
        ListNode prev = head;
        head = head.next;
        int index = 1;
        while (head != null && head.next != null) {
            if (isCriticalPoint(prev, head)) {
                if (lowestIndex == -1) {
                    lowestIndex = index;
                    previndex = index;
                } else {
                    // means we have received 2 points at least
                    min = Math.min(index - previndex, min);
                    max = Math.max(index - lowestIndex, max);
                    retArr[0] = min;
                    retArr[1] = max;
                    previndex = index;
                }
            }
            prev = head;
            head = head.next;
            index++;
        }
        return retArr;
    }

    private boolean isCriticalPoint(ListNode prev, ListNode head) {

            if ((prev.val > head.val && head.val < head.next.val) ||
                    (prev.val < head.val && head.val > head.next.val)) {
                return true;
            }

        return false;
    }
}
