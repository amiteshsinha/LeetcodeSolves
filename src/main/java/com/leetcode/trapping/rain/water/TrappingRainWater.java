package com.leetcode.trapping.rain.water;

public class TrappingRainWater extends AbstractParent {

    /**
     * This approach fails when we have scenario like [4, 2, 0, 3, 2, 5]
     * Here this function calculates on smaller minimas but does not consider the overall minima.
     * it calculates it as 4 (water between 4-2-0-3) + 1 (water between 3-2-5) instead of
     * calculating this as 9
     * @param height
     * @return
     */
    @Override
    public int trap(int[] height) {
        int output = 0;
        int left = -1, right = 0, tempSum = 0;
        boolean isSpace = false;
        if (left == -1) {
            while (height[right] <= height[right + 1]) {
                right++;
            }
            isSpace = true;
            left = right;
        }
        while (right < height.length - 1) {
            while (right < height.length - 1 && height[right] > height[right + 1]) {//for downward curve
                isSpace = true;
                tempSum += height[++right];
            }
            right++;
            while (isSpace && right < height.length - 1 && height[right] <= height[right + 1]) {//for upward curve
                tempSum += height[right];
                right++;
            }
            if (isSpace && right <= height.length - 1) {
                output += Math.min(height[left], height[right]) * (right - left - 1) - tempSum;
                tempSum = 0;
                left = right;
                isSpace = false;
            }
        }
        return output;
    }
}
