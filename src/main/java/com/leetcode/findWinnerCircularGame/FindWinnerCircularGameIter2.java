package com.leetcode.findWinnerCircularGame;

import java.util.LinkedList;
import java.util.Queue;

public class FindWinnerCircularGameIter2 extends AbstractParent {

    /**
     *Runtime
     * 42
     * ms
     * Beats
     * 23.76%
     * Analyze Complexity
     * Memory
     * 44.88
     * MB
     * Beats
     * 7.81%
     * @param n
     * @param k
     * @return
     */
    // n and k are less than 500
    @Override
    public int findTheWinner(int n, int k) {
        Queue<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            circle.offer(i);
        }
        while (circle.size() > 1) {
            for (int i = 0; i < k -1; i++) {
                circle.offer(circle.poll());
            }
            circle.poll();
        }
        return circle.poll();
    }
}
