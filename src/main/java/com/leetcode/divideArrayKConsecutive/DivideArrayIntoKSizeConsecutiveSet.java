package com.leetcode.divideArrayKConsecutive;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Solution - https://medium.com/algorithm-and-datastructure/divide-array-in-sets-of-k-consecutive-numbers-81473ec3d4ea
 *
 *
 */
public class DivideArrayIntoKSizeConsecutiveSet extends AbstractDivideArray {

    public boolean isPossibleDivide(int[] nums, int k) {
        // if nums array cannot be divided into sets of K then return false
        if (nums == null || nums.length % k != 0) {
            return false;
        }
        Arrays.sort(nums);
        int totalSets = nums.length / k;
        LinkedList<Integer>[] data = new LinkedList[totalSets];
        for (int i = 0; i < data.length; i++) {
            data[i] = new LinkedList<>();
        }
        System.out.println();
        System.out.println(Arrays.toString(nums));
        for (int val : nums) {
            insert(data, val, k);
            for (LinkedList list : data) {
                printList(list);
            }
            System.out.println();
        }

        for (LinkedList list : data) {
            //printList(list);
            if (list.size() != k) return false;
        }
        return true;
    }

    private void printList(LinkedList list) {
        System.out.print(Arrays.toString(list.toArray()) + " ");
    }


    private void insert(LinkedList<Integer>[] data, int val, int k) {
        for (LinkedList list : data) {
            if (list.size() == 0) {
                list.add(val);
                break;
            }
            if (list.size() < k) {
                if (((int) list.getFirst() - val) == 1) {
                    list.addFirst(val);
                    break;
                } else if ((val - (int) list.getLast()) == 1) {
                    list.addLast(val);
                    break;
                }
            }
        }
    }
}
