package com.leetcode.minNoOfDaysToMakeBouquets;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinDaysToMakeMBouquets extends AbstractParent {

    @Override
    public int minDays(int[] bloomDay, int m, int k) {
        if (m*k > bloomDay.length) {
            return -1;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        int maxLength = bloomDay.length - k + 1;
        int[] minMArr = new int[maxLength];
        int j = 0;
        for (int i = 0; i < maxLength; i++) {
            while (queue.size() != k) {
                queue.offer(bloomDay[j]);
                j++;
            }
            minMArr[i] = queue.peek();
            queue.remove(bloomDay[i]);
        }
        //minMArr now has the max in k window at each possible index
        // iterating over this array we need to find the indexes where the max is the smallest

        return -1;
    }
}
