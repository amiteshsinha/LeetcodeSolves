package com.leetcode.waterBottles;

public class WaterBottles extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * Analyze Complexity
     * Memory
     * 40.18
     * MB
     * Beats
     * 54.33%
     * @param numBottles
     * @param numExchange
     * @return
     */
    @Override
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles, exchange = numBottles / numExchange, empty = numBottles % numExchange;
        while (exchange > 0) {
            count += exchange;
            numBottles = exchange + empty;
            exchange = numBottles / numExchange;
            empty = numBottles % numExchange;
        }
        return count;
    }
}
