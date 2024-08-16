package com.leetcode.waterBottles2;

public class WaterBottles2 extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * Analyze Complexity
     * Memory
     * 41.10
     * MB
     * Beats
     * 17.72%
     * @param numBottles
     * @param numExchange
     * @return
     */
    @Override
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count = numBottles;
        while (numBottles >= numExchange) {
            count++;
            numBottles = numBottles + 1 - numExchange;
            numExchange++;
        }
        return count;
    }
}
