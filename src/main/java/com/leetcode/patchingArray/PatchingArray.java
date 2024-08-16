package com.leetcode.patchingArray;

public class PatchingArray extends AbstractParent {

    // if we have 1 and powers of 2 i.e. - 2,4,,8,16 etc - we can make numbers till 2*max - 1
    // for example with 1,2 we can go till 2*2 - 1 = 3
    // with 1,2,4 we can go till - 2*4 - 1 = 7
    // with 1,2,4,8 we can go till - 2*8 - 1 = 15
    // we can memorize - if we have an existing way of reaching n - k then we only need k more
    // we can also only search for powers of 2 and see if they exist but there can be duplicates in the array
    // input array is sorted so we can do binary search
    @Override
    public int minPatches(int[] nums, int n) {
        int maxSum = 0, patchCount = 0, twoPowIndex = 0;
        boolean[] nArr = new boolean[n];

        for (int i : nums) {
            nArr[i] = true;
            maxSum += i;
            nArr[maxSum] = true;
        }
//        if (maxSum < n) {
//            patchCount++;
//        }
        if (nums[0] != 1) {
            patchCount++;
            nArr[1] = true;
        }


        for (int i = 2; i <= n; i = i*2) {
            if (!nArr[i]) {
                patchCount++;
                twoPowIndex = 2*i;
                for (int j = i; j < twoPowIndex; j++) {
                    nArr[i] = true;
                }
            }
        }
        return patchCount;
    }
}
