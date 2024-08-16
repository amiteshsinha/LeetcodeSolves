package com.leetcode.kthLargestElementInStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Runtime
 * 26
 * ms
 * Beats
 * 11.11%
 * Analyze Complexity
 * Memory
 * 46.92
 * MB
 * Beats
 * 52.01%
 */
public class KthLargestIter1 {

    List<Integer> queue;
    int k;
    int currentKthLargest;

    public KthLargestIter1(int k, int[] nums) {
        this.k = k;
        queue = new ArrayList<>();
        for (int i : nums) {
            queue.add(i);
        }
        if (!queue.isEmpty()) {
            queue.sort(Comparator.reverseOrder());
            if (queue.size() >= k) {
                currentKthLargest = queue.get(k - 1);
            }
        }
    }

    public int add(int val) {
        if (queue.isEmpty() || k > queue.size() || val > currentKthLargest) {
            if (!queue.isEmpty()) {
                int index = getIndex(val);
                queue.add(index, val);
            } else {
                queue.add(val);
            }
            currentKthLargest = queue.get(k - 1);
        }
        return currentKthLargest;
    }

    private int getIndex(int val) {
        int left = 0;
        int right = queue.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midElement = queue.get(mid);
            if (midElement == val) return mid;
            if (midElement > val) {
                // Go to left half
                left = mid + 1;
            } else {
                // Go to right half
                right = mid - 1;
            }
        }
        return left;
    }
}
