package com.leetcode.divideArrayKConsecutive;

import java.util.Arrays;
import java.util.Stack;

/**
 * Solution - https://medium.com/algorithm-and-datastructure/divide-array-in-sets-of-k-consecutive-numbers-81473ec3d4ea
 *
 *
 */
public class DivideArrayIntoKSizeConsecutiveSetWithStack extends AbstractDivideArray {

    public boolean isPossibleDivide(int[] nums, int k) {
        // if nums array cannot be divided into sets of K then return false
        if (nums == null || nums.length % k != 0) {
            return false;
        }
        Arrays.sort(nums);
        int totalSets = nums.length / k;
        Stack<Integer>[] data = new Stack[totalSets];
        for (int i = 0; i < data.length; i++) {
            data[i] = new Stack<>();
        }
        for (int val : nums) {
            insert(data, val, k);
        }

        for (Stack list : data) {
            if (list.size() != k) return false;
        }
        return true;
    }

    private void insert(Stack<Integer>[] data, int val, int k) {
        for (Stack stack : data) {
            if (stack.size() == 0) {
                stack.add(val);
                break;
            }
            if (stack.size() < k) {
                if ((val - (int)stack.peek()) == 1) {
                    stack.push(val);
                    break;
                }
            }
        }
    }
}
