package com.leetcode.walmart.loopOfList;

import org.junit.jupiter.api.Test;

/**
 * LoopInLinkedList
 * 22/07/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public abstract void findAndFixLoop(Node head);

    @Test
    public void should_give_correct_output1() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node temp = head.next.next;
        temp.next = new Node(4);
        temp.next.next = new Node(5);
        temp.next.next.next = temp;
        findAndFixLoop(head);
    }

    @Test
    public void should_give_correct_output2() {
    }

    @Test
    public void should_give_correct_output3() {
    }
}