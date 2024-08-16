package com.leetcode.trapping.rain.water;

class Solution extends AbstractParent {

//    public int trap(int[] height) {
//        int n = height.length;
//        int waterTrapped = 0;
//        int[] maxOnLeft = new int[n];
//        int[] maxOnRight = new int[n];
//        int maxLeft = 0;
//        int maxRight = 0;
//        for (int i = 0; i < n; i++) {
//            maxOnLeft[i] = maxLeft;
//            maxLeft = Math.max(maxLeft, height[i]);
//        }
//
//        for (int i = n - 1; i >= 0; i--) {
//            maxOnRight[i] = maxRight;
//            maxRight = Math.max(maxRight, height[i]);
//        }
//        for (int i = 1; i < n - 1; i++) {
//            waterTrapped += Math.max(0, Math.min(maxOnLeft[i], maxOnRight[i]) - height[i]);
//        }
//        return waterTrapped;
//    }

    public int trap(int[] heights) {

        int[] leftOfI = new int[heights.length];
        int[] rightOfI = new int[heights.length];

        int n = heights.length - 1, lMax = 0, rMax = 0;
        for (int i = 0; i <= n; i++) {
            if (heights[i] > lMax) {
                lMax = heights[i];
            }
            leftOfI[i] = lMax;

            if (heights[n - i] > rMax) {
                rMax = heights[n - i];
            }
            rightOfI[n - i] = rMax;
        }

        int totalWater = 0;
        for (int i = 0; i < heights.length; i++) {
            int waterOnI = (Math.min(leftOfI[i], rightOfI[i]) - heights[i]);
            totalWater += waterOnI;
        }
        return totalWater;
    }
}