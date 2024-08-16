package com.leetcode.climbingStairs;

public class ClimbingStairs extends AbstractParent {

    // n = 1 , no of ways = 1
    // n = 2, no of ways = 2
    // n = 3, no of ways = 3
    // n = 4, no of ways = 5
    // n = 5, no of ways = 8
    // n = 6, no of ways = 13
    // its a fibonacci series

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 39.89
     * MB
     * Beats
     * 92.70%
     * of users with Java
     * @param n
     * @return
     */
    @Override
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int prevMinus2 = 1;
        int prevMinus1 = 2;
        int retVal = 0;
        for (int i = 3; i <= n; i++) {
            retVal = prevMinus1 + prevMinus2;
            prevMinus2 = prevMinus1;
            prevMinus1 = retVal;
        }
        return retVal;
    }
}
