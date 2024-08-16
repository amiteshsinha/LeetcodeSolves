package com.leetcode.containerwithmostwater;

import org.junit.jupiter.api.Test;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        return maxArea2(height);
    }


    public static int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxVal =Integer.MIN_VALUE;
        while (left < right) {
            maxVal = Math.max(maxVal, Math.min(height[left] , height[right])*(right - left));
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxVal;
    }


    // time limit exceeds in brute force approach
    public static int maxArea1(int[] height) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int val = Math.min(height[i] , height[j])*(j - i);
                if (val > maxVal) {
                    maxVal = val;
                }
            }
        }
        return maxVal;
    }

    @Test
    public void test_water_content_1() {
        assert (maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}) == 49);
    }

    @Test
    public void test_water_content_2() {
        assert (maxArea(new int[]{1, 8, 6}) == 6);
    }

    @Test
    public void test_water_content_3() {
        assert (maxArea(new int[]{1, 8, 6, 2, 5}) == 15);
    }

    @Test
    public void test_water_content_4() {
        assert (maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3}) == 40);
    }

    @Test
    public void test_water_content_5() {
        assert (maxArea(new int[]{1, 1}) == 1);
    }

    @Test
    public void test_water_content_6() {
        assert (maxArea(new int[]{3, 3}) == 3);
    }

}
