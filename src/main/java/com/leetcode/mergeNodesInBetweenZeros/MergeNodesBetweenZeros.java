package com.leetcode.mergeNodesInBetweenZeros;

import com.amitesh.core.baseclass.ListNode;

public class MergeNodesBetweenZeros extends AbstractParent {

    @Override
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head, retNode = null, retTemp = null;
        int count = 0;
        temp = temp.next;
        while (temp != null) {
            if (temp.val == 0) {
              if (retNode == null) {
                 retNode = new ListNode(count);
                 retTemp = retNode;
              } else {
                  retTemp.next = new ListNode(count);
                  retTemp = retTemp.next;
              }
              count = 0;
            } else {
                count += temp.val;
            }
            temp = temp.next;
        }
        return retNode;
    }
}
