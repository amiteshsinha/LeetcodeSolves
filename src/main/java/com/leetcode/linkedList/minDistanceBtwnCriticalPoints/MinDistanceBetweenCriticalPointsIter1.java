package com.leetcode.linkedList.minDistanceBtwnCriticalPoints;

import com.amitesh.core.baseclass.ListNode;

public class MinDistanceBetweenCriticalPointsIter1 extends AbstractParent {

    /**
     * Runtime
     * 4
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 60.37
     * MB
     * Beats
     * 72.34%
     * @param head
     * @return
     */
    @Override
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] retArr = {-1, -1};
        int min = 1000000, max = 0, prevIndex = -1, diff;
        ListNode prev = head;
        head = head.next;
        int index = 1;
        while (head.next != null) {
            if ((prev.val > head.val && head.val < head.next.val) ||
                    (prev.val < head.val && head.val > head.next.val)) {
                if (prevIndex > 0) {
                    diff = index - prevIndex;
                    if (min > diff) {
                        min = diff;
                    }
                    max += diff;
                    retArr[0] = min;
                    retArr[1] = max;
                }
                prevIndex = index;
            }
            prev = head;
            head = head.next;
            index++;
        }
        return retArr;
    }


}
