package com.leetcode.findWinnerCircularGame;

public class FindWinnerCircularGameIter3 extends AbstractParent {

    /**
     *Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * Analyze Complexity
     * Memory
     * 40.36
     * MB
     * Beats
     * 65.78%
     * @param n
     * @param k
     * @return
     */
    // n and k are less than 500
    @Override
    public int findTheWinner(int n, int k) {
        return findTheWinnerHelper(n, k) + 1;
    }

    private int findTheWinnerHelper(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (findTheWinnerHelper(n - 1, k) + k) % n;
    }
}
