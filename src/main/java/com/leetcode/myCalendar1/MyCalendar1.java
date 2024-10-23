package com.leetcode.myCalendar1;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static java.util.Comparator.comparingInt;

/**
 * This file was created on 09/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class MyCalendar1 extends AbstractParent {

    PriorityQueue<Node> queue;
    List<Node> nodeList;

    MyCalendar1() {
        queue = new PriorityQueue<>(comparingInt(a -> a.start));
        nodeList = new ArrayList<>();
    }

    public void print() {
        for (Node node : queue) {
            System.out.println(node.start + " " + node.end);
        }
        System.out.println();
    }

    public boolean book(int start, int end) {
        Node temp = new Node(start, end);
        boolean retVal = true;
        while (!queue.isEmpty() && queue.peek().end > start && queue.peek().start > start) {
            nodeList.add(queue.poll());
        }
        if (queue.isEmpty() || queue.peek().end < start) {
            queue.offer(temp);
        } else if (queue.peek().end > start && queue.peek().start < start) {
            retVal = false;
        }
        while (!nodeList.isEmpty()) {
            temp = nodeList.remove(nodeList.size() - 1);
            if (!queue.isEmpty() && queue.peek().end == temp.start) {
                Node temp2 = queue.poll();
                temp.start = temp2.start;
            }
            queue.offer(temp);
        }
        return retVal;
    }

    class Node {

        int start;
        int end;

        Node(int _start, int _end) {
            start = _start;
            end = _end;
        }
    }


}
