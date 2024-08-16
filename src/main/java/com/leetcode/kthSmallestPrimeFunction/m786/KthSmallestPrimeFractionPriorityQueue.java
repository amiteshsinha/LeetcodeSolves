package com.leetcode.kthSmallestPrimeFunction.m786;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KthSmallestPrimeFractionPriorityQueue extends AbstractParent {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        if (arr.length == 2) {
            return arr;
        }
        PriorityQueue<Double> queue = new PriorityQueue<>();
        Map<Double, int[]> map = new HashMap<>();
        int length = arr.length;
        int max = length*(length - 1)/2;
        double fraction = 0;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                fraction = (double)arr[i]/arr[j];
                queue.offer(fraction);
                map.put(fraction, new int[]{arr[i], arr[j]});
            }
        }
        int size = 0;
        while (size != k) {
            fraction = queue.poll();
            size++;
        }
        return map.get(fraction);
    }
}
