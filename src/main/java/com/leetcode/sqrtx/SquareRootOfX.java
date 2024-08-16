package com.leetcode.sqrtx;

public class SquareRootOfX extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 86.82%
     *
     * Memory
     * 40.78
     * MB
     * Beats
     * 41.13%
     * @param x
     * @return
     */
    @Override
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 2, right = x/2, mid;
        long square;
        while (left <= right) {
            mid = (left + right)/2;
            square = (long)mid*mid;
            if (square == x) {
                return mid;
            }
            if (square > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
