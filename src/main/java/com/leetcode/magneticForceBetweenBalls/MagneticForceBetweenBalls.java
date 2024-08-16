package com.leetcode.magneticForceBetweenBalls;

import java.util.Arrays;

public class MagneticForceBetweenBalls extends AbstractParent {

    /**
     * Runtime
     * 35
     * ms
     * Beats
     * 99.46%
     * Analyze Complexity
     * Memory
     * 55.62
     * MB
     * Beats
     * 66.09%
     */
    // if you can place balls such that the answer is x then you can do it for y where y < x
    // if you cant place balls such that the answer is x then try for y where y > x
    // start is set to 1 because 1 is the min difference even if all buckets are consecutive in nature
    // end is set to avg of min and max of the array based on m - 1
    int[] positionArr;
    int noOfBalls;
    @Override
    public int maxDistance(int[] position, int m) {
        this.positionArr = position;
        this.noOfBalls = m;
        Arrays.sort(positionArr);
        //min difference will be 1 max difference would be avg of min and max in the array
        int start = 1, end = (positionArr[position.length - 1] - position[0])/(m - 1), resp = 0;
        while (start <= end) {
            int mid = (start + end)/2;
            // place 1 ball at mid and then place remaining
            if (checkPlacement(mid)) {
                resp = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return resp;
    }

    private boolean checkPlacement(int mid) {
        int noOfBalls = 1;
        int prev = positionArr[0];
        for (int i = 1; i < positionArr.length; i++) {
            if (positionArr[i] - prev >= mid) {
                noOfBalls++;
                prev = positionArr[i];
                if (noOfBalls == this.noOfBalls) {
                    return true;
                }
            }
        }
        return false;
    }
}
