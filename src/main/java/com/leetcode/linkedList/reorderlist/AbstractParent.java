package com.leetcode.linkedList.reorderlist;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * ReorderList
 * 02/04/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {


//
//     * Definition for singly-linked list.
      public class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public abstract void reorderList(ListNode head);

    protected ListNode createList(int[] arr) {
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

    private int[] createIntArrayFromList(ListNode head, int length) {
        int[] arr = new int[length];
        ListNode curr = head;
        for (int i = 0; i < length; i++) {
            arr[i] = curr.val;
            curr = curr.next;
        }
        return arr;
    }

    private void assertCase(int[] input, int[] expected) {
        ListNode head = createList(input);
        reorderList(head);
        Assert.assertEquals(createIntArrayFromList(head, input.length), expected);
    }

    @Test
    public void should_give_correct_output1() {
        assertCase(new int[]{1,2,3,4}, new int[]{1,4,2,3});
    }

    @Test
    public void should_give_correct_output2() {
        assertCase(new int[]{1,2,3,4,5}, new int[]{1,5,2,4,3});
    }

    @Test
    public void should_give_correct_output3() {
        assertCase(new int[]{1,2,3,4,5,6}, new int[]{1,6,2,5,3,4});
    }

    @Test
    public void should_give_correct_output4() {
        assertCase(new int[]{1,2,3}, new int[]{1,3,2});
    }

    @Test
    public void should_give_correct_output5() {
        assertCase(new int[]{1,2}, new int[]{1,2});
    }

    @Test
    public void should_give_correct_output6() {
        assertCase(new int[]{1}, new int[]{1});
    }

    @Test
    public void should_give_correct_output7() {
        assertCase(new int[]{1,2,3,4,5,6,7}, new int[]{1,7,2,6,3,5,4});
    }


}