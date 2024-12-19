package com.leetcode.specialArray2;

import java.util.PriorityQueue;

/**
 * todo fix it
 * This file was created on 18/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class SpecialArray2 extends AbstractParent {

    @Override
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean [] result = new boolean[queries.length];
        // if a sub query is false then the super query will also be false.
        // conversely if a query is true then all sub queries will also be true.
        // we need to find out whether this query is already calculated
        PriorityQueue<Integer>[] mapWithFalseSpecialArr = new PriorityQueue[nums.length];
        boolean polarity, temp;
        boolean[] polarityArr = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            polarityArr[i] = nums[i] % 2 == 0;
        }
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            // if the number of elements between left and right is less than or equal to 1
            // then it cannot be a special array.
            if (right - left + 1 <= 1) {
                result[i] = true;
                continue;
            }
            // search if there is a range smaller than current range which is already false
            // if there is current one becomes false too
//            if (binarySearch(left, mapWithFalseSpecialArr, right)) {
//                result[i] = false;
//            } else {
                result[i] = true;
                polarity = polarityArr[left];
                for (int j = left + 1; j <= right; j++) {
                    temp = polarityArr[j];
                    if (temp == polarity) {
                        result[i] = false;
//                        PriorityQueue<Integer> tempList = mapWithFalseSpecialArr[left];
//                        if (tempList == null) {
//                            tempList = new PriorityQueue<>();
//                        }
//                        tempList.add(right);
                        break;
                    }
                    polarity = temp;
                }
            //}
        }
        return result;
    }

    private boolean binarySearch(int left, PriorityQueue<Integer>[] mapWithFalseSpecialArr, int right) {
        // return true if we find a left right pair smaller than input // else return false;
        int start = left, end = mapWithFalseSpecialArr.length , mid;
        while (start < end) {
            mid = start + (end - start)/2;
            if (mapWithFalseSpecialArr[mid] != null) {

            }
        }
        return false;
    }

}
