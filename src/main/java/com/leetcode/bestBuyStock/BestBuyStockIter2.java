package com.leetcode.bestBuyStock;

public class BestBuyStockIter2 extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 99.76%
     * of users with Java
     * Memory
     * 61.60
     * MB
     * Beats
     * 52.33%
     * of users with Java
     * of users with Java
     * @param stockArray
     * @return
     */
    public int getMaxProfix(int[] stockArray) {
        int j = stockArray.length;
        int minStock = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < j; i++) {
            if (minStock < stockArray[i]) {
                profit = Math.max(stockArray[i] - minStock, profit);
            } else {
                minStock = stockArray[i];
            }
        }
        return profit;
    }
}
