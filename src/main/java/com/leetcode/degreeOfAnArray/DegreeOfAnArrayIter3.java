package com.leetcode.degreeOfAnArray;

public class DegreeOfAnArrayIter3 extends AbstractParent {

    /**
     * Runtime
     * 4
     * ms
     * Beats
     * 97.95%
     *
     * Memory
     * 47.88
     * MB
     * Beats
     * 34.23%
     * @param nums
     * @return
     */
    @Override
    public int findShortestSubArray(int[] nums) {
        int max = -1, minSubArrLength = 0, maxFreq = 0, temp;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        IndexCountRef[] countRefArr = new IndexCountRef[max + 1];
        for (int i = 0; i < nums.length; i++) {
            if (countRefArr[nums[i]] == null) {
                countRefArr[nums[i]] = new IndexCountRef(i);
            }
            countRefArr[nums[i]].end = i;
            countRefArr[nums[i]].count++;
            temp = countRefArr[nums[i]].end - countRefArr[nums[i]].start + 1;
            if (countRefArr[nums[i]].count > maxFreq) {
                maxFreq = countRefArr[nums[i]].count;
                minSubArrLength = temp;
            } else if (countRefArr[nums[i]].count == maxFreq && minSubArrLength > temp) {
                minSubArrLength = temp;
            }
        }
        return minSubArrLength;
    }

    class IndexCountRef {
        int count = 0;
        int start;
        int end;

        IndexCountRef(int index) {
            start = index;
            end = index;
        }
    }
}
