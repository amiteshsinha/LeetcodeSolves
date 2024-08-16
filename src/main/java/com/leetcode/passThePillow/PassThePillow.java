package com.leetcode.passThePillow;

public class PassThePillow extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 40.12
     * MB
     * Beats
     * 61.02%
     * @param n
     * @param time
     * @return
     */
    public int passThePillow1(int n, int time) {
        // in n - 1 it reaches the end then it flips
        int quotient = 0;
        if (time >= n) {
           quotient = time/(n - 1);
           time = time%(n - 1);
            if (quotient%2 == 0) {
                return 1 + time;
            } else {
                return n - time;
            }
        } else {
            return 1 + time;
        }
    }

    public int passThePillow(int n, int time) {
        // in n - 1 it reaches the end then it flips
        int quotient = time/(n - 1);
        if (time >= n) {
            time = time%(n - 1);
        } else {
            quotient = 0;
        }
        return (quotient%2 == 0) ? 1 + time : n - time;
    }
}
