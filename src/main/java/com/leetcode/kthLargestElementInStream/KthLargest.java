package com.leetcode.kthLargestElementInStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KthLargest {

    List<Integer> queue;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new ArrayList<>();
        for (int i : nums) {
            queue.add(i);
        }
        queue.sort(Comparator.reverseOrder());
    }

    public int add(int val) {
        if (!queue.isEmpty()) {
            int index = 0;
            while (index < queue.size() && queue.get(index) > val) {
                index++;
            }
            queue.add(index, val);
        } else {
            queue.add(val);
        }
        return queue.get(k - 1);
    }
}
