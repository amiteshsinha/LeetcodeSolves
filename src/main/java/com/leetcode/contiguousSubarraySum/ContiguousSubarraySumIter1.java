package com.leetcode.contiguousSubarraySum;

import java.util.HashMap;
import java.util.Map;

public class ContiguousSubarraySumIter1 extends AbstractParent {

    /**
     * We iterate through the input array exactly once, keeping track of the running sum mod k of the elements in the process.
     * If we find that a running sum value at index j has been previously seen before in some earlier index i in the array,
     * then we know that the sub-array (i,j] contains a desired sum.
     *
     * Running sum from first element to index i : sum_i. If we mod k, it will be some format like : sum_i = k * x + modk_1
     * Running sum from first element to index j : sum_j. If we mod k, it will be some format like : sum_j = k * y + modk_2
     * If they have the same mod, which is modk_1 == modk_2, subtracting these two running sum we get the difference
     * sum_i - sum_j = (x - y) * k = constant * k,
     * and the difference is the sum of elements between index i and j, and the value is a multiple of k.
     *
     * (a+(n*x))%x is same as (a%x)
     *
     * For e.g. in case of the array [23,2,6,4,7] the running sum is [23,25,31,35,42] and the remainders are [5,1,1,5,0].
     * We got remainder 5 at index 0 and at index 3. That means, in between these two indexes we must have added a number which is multiple of the k.
     * @param nums
     * @param k
     * @return
     */
    @Override
    public boolean checkSubarraySum(int[] nums, int k) {
        int runningSum = 0;
        Integer prev = 0;
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);
        for (int i = 0 ; i < nums.length; i++) {
            runningSum += nums[i];
            runningSum %= k;
            prev = remainderMap.get(runningSum);
            if (prev != null) {
                if ((i - prev) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(runningSum, i);
            }
        }
        return false;
    }
}
