package com.leetcode.grumpyBookOwner;

public class GrumpyBookOwner extends AbstractParent {

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 91.49%
     *
     * Memory
     * 47.10
     * MB
     * Beats
     * 67.88%
     * @param customers
     * @param grumpy
     * @param minutes
     * @return
     */
    @Override
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int maxCustomers = 0, currentMinUsed = 0, maxForMinUsed = 0, currWindow = 0, start = 0, end = 0;
        for (int i = 0; i < customers.length;i++) {
            if (grumpy[i] == 0) {
                maxCustomers += customers[i];
            }
        }
        while (end < minutes && end < customers.length) {
            if (grumpy[end] == 1) {
                currentMinUsed += customers[end];
            }
            end++;
        }
        maxForMinUsed = Math.max(currentMinUsed, maxForMinUsed);
        while (end < customers.length) {
            if (grumpy[end] == 1) {
                currentMinUsed += customers[end];
            }
            if (grumpy[start] == 1) {
                currentMinUsed -= customers[start];
            }
            start++;
            end++;
            maxForMinUsed = Math.max(currentMinUsed, maxForMinUsed);
        }
        return maxCustomers + maxForMinUsed;
    }
}
