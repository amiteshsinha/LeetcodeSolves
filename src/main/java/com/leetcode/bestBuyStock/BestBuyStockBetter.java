package com.leetcode.bestBuyStock;

public class BestBuyStockBetter extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 73.74%
     * of users with Java
     * Memory
     * 59.62
     * MB
     * Beats
     * 95.47%
     * of users with Java
     * @param stockArray
     * @return
     */
    public int getMaxProfix(int[] stockArray) {
        int j = stockArray.length;
        int[] minArr = new int[j];
        int[] maxArr = new int[j];
        int maxProfit = 0, minStock = stockArray[0], maxStock = stockArray[j - 1];
        for (int i = 0; i < j; i++) {
            minStock = Math.min(minStock, stockArray[i]);
            minArr[i] = minStock;
        }
        for (int i = j -1; i >= 0; i--) {
            maxStock = Math.max(stockArray[i], maxStock);
            maxArr[i] = maxStock;
        }
        for (int i = 0; i < j; i++) {
            maxProfit = Math.max(maxArr[i]- minArr[i], maxProfit);
        }
        return maxProfit;
    }
}
